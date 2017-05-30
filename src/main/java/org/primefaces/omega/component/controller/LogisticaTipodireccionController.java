package org.primefaces.omega.component.controller;

import org.primefaces.omega.component.controller.util.MobilePageController;
import org.primefaces.omega.entidades.LogisticaTipodireccion;
import org.primefaces.omega.component.facade.LogisticaTipodireccionFacade;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "logisticaTipodireccionController")
@ViewScoped
public class LogisticaTipodireccionController extends AbstractController<LogisticaTipodireccion> {

    @Inject
    private MobilePageController mobilePageController;

    // Flags to indicate if child collections are empty
    private boolean isPersonaDireccionentidadCollectionEmpty;

    public LogisticaTipodireccionController() {
        // Inform the Abstract parent controller of the concrete LogisticaTipodireccion Entity
        super(LogisticaTipodireccion.class);
    }

    /**
     * Set the "is[ChildCollection]Empty" property for OneToMany fields.
     */
    @Override
    protected void setChildrenEmptyFlags() {
        this.setIsPersonaDireccionentidadCollectionEmpty();
    }

    public boolean getIsPersonaDireccionentidadCollectionEmpty() {
        return this.isPersonaDireccionentidadCollectionEmpty;
    }

    private void setIsPersonaDireccionentidadCollectionEmpty() {
        LogisticaTipodireccion selected = this.getSelected();
        if (selected != null) {
            LogisticaTipodireccionFacade ejbFacade = (LogisticaTipodireccionFacade) this.getFacade();
            this.isPersonaDireccionentidadCollectionEmpty = ejbFacade.isPersonaDireccionentidadCollectionEmpty(selected);
        } else {
            this.isPersonaDireccionentidadCollectionEmpty = true;
        }
    }

    /**
     * Sets the "items" attribute with a collection of PersonaDireccionentidad
     * entities that are retrieved from LogisticaTipodireccion?cap_first and
     * returns the navigation outcome.
     *
     * @return navigation outcome for PersonaDireccionentidad page
     */
    public String navigatePersonaDireccionentidadCollection() {
        LogisticaTipodireccion selected = this.getSelected();
        if (selected != null) {
            LogisticaTipodireccionFacade ejbFacade = (LogisticaTipodireccionFacade) this.getFacade();
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("PersonaDireccionentidad_items", ejbFacade.findPersonaDireccionentidadCollection(selected));
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/app/personaDireccionentidad/index";
    }

}
