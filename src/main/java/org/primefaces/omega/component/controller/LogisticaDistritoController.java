package org.primefaces.omega.component.controller;

import org.primefaces.omega.component.controller.util.MobilePageController;
import org.primefaces.omega.entidades.LogisticaDistrito;
import org.primefaces.omega.component.facade.LogisticaDistritoFacade;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "logisticaDistritoController")
@ViewScoped
public class LogisticaDistritoController extends AbstractController<LogisticaDistrito> {

    @Inject
    private LogisticaProvinciaController provinciaIDController;
    @Inject
    private MobilePageController mobilePageController;

    public LogisticaDistritoController() {
        // Inform the Abstract parent controller of the concrete LogisticaDistrito Entity
        super(LogisticaDistrito.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        provinciaIDController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the LogisticaProvincia controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareProvinciaID(ActionEvent event) {
        LogisticaDistrito selected = this.getSelected();
        if (selected != null && provinciaIDController.getSelected() == null) {
            provinciaIDController.setSelected(selected.getProvinciaID());
        }
    }

}
