package org.primefaces.omega.component.controller;

import org.primefaces.omega.component.controller.util.MobilePageController;
import org.primefaces.omega.entidades.PersonaDocumentoentidad;
import org.primefaces.omega.component.facade.PersonaDocumentoentidadFacade;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "personaDocumentoentidadController")
@ViewScoped
public class PersonaDocumentoentidadController extends AbstractController<PersonaDocumentoentidad> {

    @Inject
    private PersonaEntidadnegocioController entidadNegocioIDController;
    @Inject
    private PersonaTipodocumentoController tipoDocumentoIDController;
    @Inject
    private MobilePageController mobilePageController;

    public PersonaDocumentoentidadController() {
        // Inform the Abstract parent controller of the concrete PersonaDocumentoentidad Entity
        super(PersonaDocumentoentidad.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        entidadNegocioIDController.setSelected(null);
        tipoDocumentoIDController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the PersonaEntidadnegocio controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareEntidadNegocioID(ActionEvent event) {
        PersonaDocumentoentidad selected = this.getSelected();
        if (selected != null && entidadNegocioIDController.getSelected() == null) {
            entidadNegocioIDController.setSelected(selected.getEntidadNegocioID());
        }
    }

    /**
     * Sets the "selected" attribute of the PersonaTipodocumento controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareTipoDocumentoID(ActionEvent event) {
        PersonaDocumentoentidad selected = this.getSelected();
        if (selected != null && tipoDocumentoIDController.getSelected() == null) {
            tipoDocumentoIDController.setSelected(selected.getTipoDocumentoID());
        }
    }

}
