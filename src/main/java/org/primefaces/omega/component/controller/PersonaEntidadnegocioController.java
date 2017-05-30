package org.primefaces.omega.component.controller;

import org.primefaces.omega.component.controller.util.MobilePageController;
import org.primefaces.omega.entidades.PersonaEntidadnegocio;
import org.primefaces.omega.component.facade.PersonaEntidadnegocioFacade;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "personaEntidadnegocioController")
@ViewScoped
public class PersonaEntidadnegocioController extends AbstractController<PersonaEntidadnegocio> {

    @Inject
    private PersonaTipoentidadController tipoEntidadIDController;
    @Inject
    private PersonaPersonaController personaPersonaController;
    @Inject
    private MobilePageController mobilePageController;

    // Flags to indicate if child collections are empty
    private boolean isPersonaDocumentoentidadCollectionEmpty;
    private boolean isPersonaDireccionentidadCollectionEmpty;

    public PersonaEntidadnegocioController() {
        // Inform the Abstract parent controller of the concrete PersonaEntidadnegocio Entity
        super(PersonaEntidadnegocio.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        tipoEntidadIDController.setSelected(null);
        personaPersonaController.setSelected(null);
    }

    /**
     * Set the "is[ChildCollection]Empty" property for OneToMany fields.
     */
    @Override
    protected void setChildrenEmptyFlags() {
        this.setIsPersonaDocumentoentidadCollectionEmpty();
        this.setIsPersonaDireccionentidadCollectionEmpty();
    }

    public boolean getIsPersonaDocumentoentidadCollectionEmpty() {
        return this.isPersonaDocumentoentidadCollectionEmpty;
    }

    private void setIsPersonaDocumentoentidadCollectionEmpty() {
        PersonaEntidadnegocio selected = this.getSelected();
        if (selected != null) {
            PersonaEntidadnegocioFacade ejbFacade = (PersonaEntidadnegocioFacade) this.getFacade();
            this.isPersonaDocumentoentidadCollectionEmpty = ejbFacade.isPersonaDocumentoentidadCollectionEmpty(selected);
        } else {
            this.isPersonaDocumentoentidadCollectionEmpty = true;
        }
    }

    /**
     * Sets the "items" attribute with a collection of PersonaDocumentoentidad
     * entities that are retrieved from PersonaEntidadnegocio?cap_first and
     * returns the navigation outcome.
     *
     * @return navigation outcome for PersonaDocumentoentidad page
     */
    public String navigatePersonaDocumentoentidadCollection() {
        PersonaEntidadnegocio selected = this.getSelected();
        if (selected != null) {
            PersonaEntidadnegocioFacade ejbFacade = (PersonaEntidadnegocioFacade) this.getFacade();
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("PersonaDocumentoentidad_items", ejbFacade.findPersonaDocumentoentidadCollection(selected));
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/app/personaDocumentoentidad/index";
    }

    /**
     * Sets the "selected" attribute of the PersonaTipoentidad controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareTipoEntidadID(ActionEvent event) {
        PersonaEntidadnegocio selected = this.getSelected();
        if (selected != null && tipoEntidadIDController.getSelected() == null) {
            tipoEntidadIDController.setSelected(selected.getTipoEntidadID());
        }
    }

    /**
     * Sets the "selected" attribute of the PersonaPersona controller in order
     * to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void preparePersonaPersona(ActionEvent event) {
        PersonaEntidadnegocio selected = this.getSelected();
        if (selected != null && personaPersonaController.getSelected() == null) {
            personaPersonaController.setSelected(selected.getPersonaPersona());
        }
    }

    public boolean getIsPersonaDireccionentidadCollectionEmpty() {
        return this.isPersonaDireccionentidadCollectionEmpty;
    }

    private void setIsPersonaDireccionentidadCollectionEmpty() {
        PersonaEntidadnegocio selected = this.getSelected();
        if (selected != null) {
            PersonaEntidadnegocioFacade ejbFacade = (PersonaEntidadnegocioFacade) this.getFacade();
            this.isPersonaDireccionentidadCollectionEmpty = ejbFacade.isPersonaDireccionentidadCollectionEmpty(selected);
        } else {
            this.isPersonaDireccionentidadCollectionEmpty = true;
        }
    }

    /**
     * Sets the "items" attribute with a collection of PersonaDireccionentidad
     * entities that are retrieved from PersonaEntidadnegocio?cap_first and
     * returns the navigation outcome.
     *
     * @return navigation outcome for PersonaDireccionentidad page
     */
    public String navigatePersonaDireccionentidadCollection() {
        PersonaEntidadnegocio selected = this.getSelected();
        if (selected != null) {
            PersonaEntidadnegocioFacade ejbFacade = (PersonaEntidadnegocioFacade) this.getFacade();
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("PersonaDireccionentidad_items", ejbFacade.findPersonaDireccionentidadCollection(selected));
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/app/personaDireccionentidad/index";
    }

}
