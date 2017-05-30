package org.primefaces.omega.component.controller;

import org.primefaces.omega.component.controller.util.MobilePageController;
import org.primefaces.omega.entidades.PersonaEstadocivil;
import org.primefaces.omega.component.facade.PersonaEstadocivilFacade;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "personaEstadocivilController")
@ViewScoped
public class PersonaEstadocivilController extends AbstractController<PersonaEstadocivil> {

    @Inject
    private MobilePageController mobilePageController;

    // Flags to indicate if child collections are empty
    private boolean isPersonaPersonaCollectionEmpty;

    public PersonaEstadocivilController() {
        // Inform the Abstract parent controller of the concrete PersonaEstadocivil Entity
        super(PersonaEstadocivil.class);
    }

    /**
     * Set the "is[ChildCollection]Empty" property for OneToMany fields.
     */
    @Override
    protected void setChildrenEmptyFlags() {
        this.setIsPersonaPersonaCollectionEmpty();
    }

    public boolean getIsPersonaPersonaCollectionEmpty() {
        return this.isPersonaPersonaCollectionEmpty;
    }

    private void setIsPersonaPersonaCollectionEmpty() {
        PersonaEstadocivil selected = this.getSelected();
        if (selected != null) {
            PersonaEstadocivilFacade ejbFacade = (PersonaEstadocivilFacade) this.getFacade();
            this.isPersonaPersonaCollectionEmpty = ejbFacade.isPersonaPersonaCollectionEmpty(selected);
        } else {
            this.isPersonaPersonaCollectionEmpty = true;
        }
    }

    /**
     * Sets the "items" attribute with a collection of PersonaPersona entities
     * that are retrieved from PersonaEstadocivil?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for PersonaPersona page
     */
    public String navigatePersonaPersonaCollection() {
        PersonaEstadocivil selected = this.getSelected();
        if (selected != null) {
            PersonaEstadocivilFacade ejbFacade = (PersonaEstadocivilFacade) this.getFacade();
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("PersonaPersona_items", ejbFacade.findPersonaPersonaCollection(selected));
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/app/personaPersona/index";
    }

}
