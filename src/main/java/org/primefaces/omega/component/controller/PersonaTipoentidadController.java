package org.primefaces.omega.component.controller;

import org.primefaces.omega.component.controller.util.MobilePageController;
import org.primefaces.omega.entidades.PersonaTipoentidad;
import org.primefaces.omega.component.facade.PersonaTipoentidadFacade;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "personaTipoentidadController")
@ViewScoped
public class PersonaTipoentidadController extends AbstractController<PersonaTipoentidad> {

    @Inject
    private MobilePageController mobilePageController;

    // Flags to indicate if child collections are empty
    private boolean isPersonaEntidadnegocioCollectionEmpty;

    public PersonaTipoentidadController() {
        // Inform the Abstract parent controller of the concrete PersonaTipoentidad Entity
        super(PersonaTipoentidad.class);
    }

    /**
     * Set the "is[ChildCollection]Empty" property for OneToMany fields.
     */
    @Override
    protected void setChildrenEmptyFlags() {
        this.setIsPersonaEntidadnegocioCollectionEmpty();
    }

    public boolean getIsPersonaEntidadnegocioCollectionEmpty() {
        return this.isPersonaEntidadnegocioCollectionEmpty;
    }

    private void setIsPersonaEntidadnegocioCollectionEmpty() {
        PersonaTipoentidad selected = this.getSelected();
        if (selected != null) {
            PersonaTipoentidadFacade ejbFacade = (PersonaTipoentidadFacade) this.getFacade();
            this.isPersonaEntidadnegocioCollectionEmpty = ejbFacade.isPersonaEntidadnegocioCollectionEmpty(selected);
        } else {
            this.isPersonaEntidadnegocioCollectionEmpty = true;
        }
    }

    /**
     * Sets the "items" attribute with a collection of PersonaEntidadnegocio
     * entities that are retrieved from PersonaTipoentidad?cap_first and returns
     * the navigation outcome.
     *
     * @return navigation outcome for PersonaEntidadnegocio page
     */
    public String navigatePersonaEntidadnegocioCollection() {
        PersonaTipoentidad selected = this.getSelected();
        if (selected != null) {
            PersonaTipoentidadFacade ejbFacade = (PersonaTipoentidadFacade) this.getFacade();
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("PersonaEntidadnegocio_items", ejbFacade.findPersonaEntidadnegocioCollection(selected));
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/app/personaEntidadnegocio/index";
    }

}
