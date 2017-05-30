package org.primefaces.omega.component.controller;

import org.primefaces.omega.component.controller.util.MobilePageController;
import org.primefaces.omega.entidades.LogisticaProvincia;
import org.primefaces.omega.component.facade.LogisticaProvinciaFacade;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "logisticaProvinciaController")
@ViewScoped
public class LogisticaProvinciaController extends AbstractController<LogisticaProvincia> {

    @Inject
    private LogisticaDepartamentoController departamentoIDController;
    @Inject
    private MobilePageController mobilePageController;

    // Flags to indicate if child collections are empty
    private boolean isLogisticaDistritoCollectionEmpty;

    public LogisticaProvinciaController() {
        // Inform the Abstract parent controller of the concrete LogisticaProvincia Entity
        super(LogisticaProvincia.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        departamentoIDController.setSelected(null);
    }

    /**
     * Set the "is[ChildCollection]Empty" property for OneToMany fields.
     */
    @Override
    protected void setChildrenEmptyFlags() {
        this.setIsLogisticaDistritoCollectionEmpty();
    }

    public boolean getIsLogisticaDistritoCollectionEmpty() {
        return this.isLogisticaDistritoCollectionEmpty;
    }

    private void setIsLogisticaDistritoCollectionEmpty() {
        LogisticaProvincia selected = this.getSelected();
        if (selected != null) {
            LogisticaProvinciaFacade ejbFacade = (LogisticaProvinciaFacade) this.getFacade();
            this.isLogisticaDistritoCollectionEmpty = ejbFacade.isLogisticaDistritoCollectionEmpty(selected);
        } else {
            this.isLogisticaDistritoCollectionEmpty = true;
        }
    }

    /**
     * Sets the "items" attribute with a collection of LogisticaDistrito
     * entities that are retrieved from LogisticaProvincia?cap_first and returns
     * the navigation outcome.
     *
     * @return navigation outcome for LogisticaDistrito page
     */
    public String navigateLogisticaDistritoCollection() {
        LogisticaProvincia selected = this.getSelected();
        if (selected != null) {
            LogisticaProvinciaFacade ejbFacade = (LogisticaProvinciaFacade) this.getFacade();
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("LogisticaDistrito_items", ejbFacade.findLogisticaDistritoCollection(selected));
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/app/logisticaDistrito/index";
    }

    /**
     * Sets the "selected" attribute of the LogisticaDepartamento controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareDepartamentoID(ActionEvent event) {
        LogisticaProvincia selected = this.getSelected();
        if (selected != null && departamentoIDController.getSelected() == null) {
            departamentoIDController.setSelected(selected.getDepartamentoID());
        }
    }

}
