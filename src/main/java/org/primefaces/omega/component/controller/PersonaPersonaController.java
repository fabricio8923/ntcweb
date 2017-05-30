package org.primefaces.omega.component.controller;

import org.primefaces.omega.component.controller.util.MobilePageController;
import org.primefaces.omega.entidades.PersonaPersona;
import org.primefaces.omega.component.facade.PersonaPersonaFacade;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "personaPersonaController")
@ViewScoped
public class PersonaPersonaController extends AbstractController<PersonaPersona> {

    @Inject
    private PersonaEntidadnegocioController personaEntidadnegocioController;
    @Inject
    private PersonaEstadocivilController estadoCivilIDController;
    @Inject
    private MobilePageController mobilePageController;

    public PersonaPersonaController() {
        // Inform the Abstract parent controller of the concrete PersonaPersona Entity
        super(PersonaPersona.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        personaEntidadnegocioController.setSelected(null);
        estadoCivilIDController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the PersonaEntidadnegocio controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void preparePersonaEntidadnegocio(ActionEvent event) {
        PersonaPersona selected = this.getSelected();
        if (selected != null && personaEntidadnegocioController.getSelected() == null) {
            personaEntidadnegocioController.setSelected(selected.getPersonaEntidadnegocio());
        }
    }

    /**
     * Sets the "selected" attribute of the PersonaEstadocivil controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareEstadoCivilID(ActionEvent event) {
        PersonaPersona selected = this.getSelected();
        if (selected != null && estadoCivilIDController.getSelected() == null) {
            estadoCivilIDController.setSelected(selected.getEstadoCivilID());
        }
    }

}
