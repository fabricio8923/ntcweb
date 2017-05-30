package org.primefaces.omega.component.controller;

import org.primefaces.omega.component.controller.util.MobilePageController;
import org.primefaces.omega.entidades.LogisticaDepartamento;
import org.primefaces.omega.component.facade.LogisticaDepartamentoFacade;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "logisticaDepartamentoController")
@ViewScoped
public class LogisticaDepartamentoController extends AbstractController<LogisticaDepartamento> {

    @Inject
    private LogisticaPaisController paisIDController;
    @Inject
    private MobilePageController mobilePageController;

    // Flags to indicate if child collections are empty
    private boolean isLogisticaProvinciaCollectionEmpty;

    public LogisticaDepartamentoController() {
        // Inform the Abstract parent controller of the concrete LogisticaDepartamento Entity
        super(LogisticaDepartamento.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        paisIDController.setSelected(null);
    }

    /**
     * Set the "is[ChildCollection]Empty" property for OneToMany fields.
     */
    @Override
    protected void setChildrenEmptyFlags() {
        this.setIsLogisticaProvinciaCollectionEmpty();
    }

    /**
     * Sets the "selected" attribute of the LogisticaPais controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void preparePaisID(ActionEvent event) {
        LogisticaDepartamento selected = this.getSelected();
        if (selected != null && paisIDController.getSelected() == null) {
            paisIDController.setSelected(selected.getPaisID());
        }
    }

    public boolean getIsLogisticaProvinciaCollectionEmpty() {
        return this.isLogisticaProvinciaCollectionEmpty;
    }

    private void setIsLogisticaProvinciaCollectionEmpty() {
        LogisticaDepartamento selected = this.getSelected();
        if (selected != null) {
            LogisticaDepartamentoFacade ejbFacade = (LogisticaDepartamentoFacade) this.getFacade();
            this.isLogisticaProvinciaCollectionEmpty = ejbFacade.isLogisticaProvinciaCollectionEmpty(selected);
        } else {
            this.isLogisticaProvinciaCollectionEmpty = true;
        }
    }

    /**
     * Sets the "items" attribute with a collection of LogisticaProvincia
     * entities that are retrieved from LogisticaDepartamento?cap_first and
     * returns the navigation outcome.
     *
     * @return navigation outcome for LogisticaProvincia page
     */
    public String navigateLogisticaProvinciaCollection() {
        LogisticaDepartamento selected = this.getSelected();
        if (selected != null) {
            LogisticaDepartamentoFacade ejbFacade = (LogisticaDepartamentoFacade) this.getFacade();
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("LogisticaProvincia_items", ejbFacade.findLogisticaProvinciaCollection(selected));
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/app/logisticaProvincia/index";
    }

}
