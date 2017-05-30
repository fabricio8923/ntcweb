package org.primefaces.omega.component.controller;

import org.primefaces.omega.component.controller.util.MobilePageController;
import org.primefaces.omega.entidades.LogisticaPais;
import org.primefaces.omega.component.facade.LogisticaPaisFacade;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "logisticaPaisController")
@ViewScoped
public class LogisticaPaisController extends AbstractController<LogisticaPais> {

    @Inject
    private MobilePageController mobilePageController;

    // Flags to indicate if child collections are empty
    private boolean isLogisticaDepartamentoCollectionEmpty;

    public LogisticaPaisController() {
        // Inform the Abstract parent controller of the concrete LogisticaPais Entity
        super(LogisticaPais.class);
    }

    /**
     * Set the "is[ChildCollection]Empty" property for OneToMany fields.
     */
    @Override
    protected void setChildrenEmptyFlags() {
        this.setIsLogisticaDepartamentoCollectionEmpty();
    }

    public boolean getIsLogisticaDepartamentoCollectionEmpty() {
        return this.isLogisticaDepartamentoCollectionEmpty;
    }

    private void setIsLogisticaDepartamentoCollectionEmpty() {
        LogisticaPais selected = this.getSelected();
        if (selected != null) {
            LogisticaPaisFacade ejbFacade = (LogisticaPaisFacade) this.getFacade();
            this.isLogisticaDepartamentoCollectionEmpty = ejbFacade.isLogisticaDepartamentoCollectionEmpty(selected);
        } else {
            this.isLogisticaDepartamentoCollectionEmpty = true;
        }
    }

    /**
     * Sets the "items" attribute with a collection of LogisticaDepartamento
     * entities that are retrieved from LogisticaPais?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for LogisticaDepartamento page
     */
    public String navigateLogisticaDepartamentoCollection() {
        LogisticaPais selected = this.getSelected();
        if (selected != null) {
            LogisticaPaisFacade ejbFacade = (LogisticaPaisFacade) this.getFacade();
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("LogisticaDepartamento_items", ejbFacade.findLogisticaDepartamentoCollection(selected));
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/app/logisticaDepartamento/index";
    }

}
