package org.primefaces.omega.component.controller;

import org.primefaces.omega.component.controller.util.MobilePageController;
import org.primefaces.omega.entidades.PersonaDireccionentidad;
import org.primefaces.omega.component.facade.PersonaDireccionentidadFacade;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "personaDireccionentidadController")
@ViewScoped
public class PersonaDireccionentidadController extends AbstractController<PersonaDireccionentidad> {

    @Inject
    private LogisticaDistritoController distritoIDController;
    @Inject
    private PersonaEntidadnegocioController entidadNegocioIDController;
    @Inject
    private LogisticaTipodireccionController tipoDireccionIDController;
    @Inject
    private LogisticaUsodireccionController usoDireccionIDController;
    @Inject
    private MobilePageController mobilePageController;

    public PersonaDireccionentidadController() {
        // Inform the Abstract parent controller of the concrete PersonaDireccionentidad Entity
        super(PersonaDireccionentidad.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        distritoIDController.setSelected(null);
        entidadNegocioIDController.setSelected(null);
        tipoDireccionIDController.setSelected(null);
        usoDireccionIDController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the LogisticaDistrito controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareDistritoID(ActionEvent event) {
        PersonaDireccionentidad selected = this.getSelected();
        if (selected != null && distritoIDController.getSelected() == null) {
            distritoIDController.setSelected(selected.getDistritoID());
        }
    }

    /**
     * Sets the "selected" attribute of the PersonaEntidadnegocio controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareEntidadNegocioID(ActionEvent event) {
        PersonaDireccionentidad selected = this.getSelected();
        if (selected != null && entidadNegocioIDController.getSelected() == null) {
            entidadNegocioIDController.setSelected(selected.getEntidadNegocioID());
        }
    }

    /**
     * Sets the "selected" attribute of the LogisticaTipodireccion controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareTipoDireccionID(ActionEvent event) {
        PersonaDireccionentidad selected = this.getSelected();
        if (selected != null && tipoDireccionIDController.getSelected() == null) {
            tipoDireccionIDController.setSelected(selected.getTipoDireccionID());
        }
    }

    /**
     * Sets the "selected" attribute of the LogisticaUsodireccion controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareUsoDireccionID(ActionEvent event) {
        PersonaDireccionentidad selected = this.getSelected();
        if (selected != null && usoDireccionIDController.getSelected() == null) {
            usoDireccionIDController.setSelected(selected.getUsoDireccionID());
        }
    }

}
