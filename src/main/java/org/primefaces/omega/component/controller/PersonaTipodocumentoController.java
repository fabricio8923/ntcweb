package org.primefaces.omega.component.controller;

import org.primefaces.omega.component.controller.util.MobilePageController;
import org.primefaces.omega.entidades.PersonaTipodocumento;
import org.primefaces.omega.component.facade.PersonaTipodocumentoFacade;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "personaTipodocumentoController")
@ViewScoped
public class PersonaTipodocumentoController extends AbstractController<PersonaTipodocumento> {

    @Inject
    private MobilePageController mobilePageController;

    // Flags to indicate if child collections are empty
    private boolean isPersonaDocumentoentidadCollectionEmpty;

    public PersonaTipodocumentoController() {
        // Inform the Abstract parent controller of the concrete PersonaTipodocumento Entity
        super(PersonaTipodocumento.class);
    }

    /**
     * Set the "is[ChildCollection]Empty" property for OneToMany fields.
     */
    @Override
    protected void setChildrenEmptyFlags() {
        this.setIsPersonaDocumentoentidadCollectionEmpty();
    }

    public boolean getIsPersonaDocumentoentidadCollectionEmpty() {
        return this.isPersonaDocumentoentidadCollectionEmpty;
    }

    private void setIsPersonaDocumentoentidadCollectionEmpty() {
        PersonaTipodocumento selected = this.getSelected();
        if (selected != null) {
            PersonaTipodocumentoFacade ejbFacade = (PersonaTipodocumentoFacade) this.getFacade();
            this.isPersonaDocumentoentidadCollectionEmpty = ejbFacade.isPersonaDocumentoentidadCollectionEmpty(selected);
        } else {
            this.isPersonaDocumentoentidadCollectionEmpty = true;
        }
    }

    /**
     * Sets the "items" attribute with a collection of PersonaDocumentoentidad
     * entities that are retrieved from PersonaTipodocumento?cap_first and
     * returns the navigation outcome.
     *
     * @return navigation outcome for PersonaDocumentoentidad page
     */
    public String navigatePersonaDocumentoentidadCollection() {
        PersonaTipodocumento selected = this.getSelected();
        if (selected != null) {
            PersonaTipodocumentoFacade ejbFacade = (PersonaTipodocumentoFacade) this.getFacade();
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("PersonaDocumentoentidad_items", ejbFacade.findPersonaDocumentoentidadCollection(selected));
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/app/personaDocumentoentidad/index";
    }

}
