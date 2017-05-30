package org.primefaces.omega.component.controller;

import org.primefaces.omega.component.controller.util.MobilePageController;
import org.primefaces.omega.entidades.LogisticaUsodireccion;
import org.primefaces.omega.component.facade.LogisticaUsodireccionFacade;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
@Named(value="logisticaUsodireccionController")
@ViewScoped
public class LogisticaUsodireccionController extends AbstractController<LogisticaUsodireccion> {

    @Inject
    private MobilePageController mobilePageController;

    // Flags to indicate if child collections are empty
    private boolean isPersonaDireccionentidadCollectionEmpty;

    public LogisticaUsodireccionController() {
        // Inform the Abstract parent controller of the concrete LogisticaUsodireccion Entity
        super(LogisticaUsodireccion.class);
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
        LogisticaUsodireccion selected = this.getSelected();
        if (selected != null) {
            LogisticaUsodireccionFacade ejbFacade = (LogisticaUsodireccionFacade) this.getFacade();
            this.isPersonaDireccionentidadCollectionEmpty = ejbFacade.isPersonaDireccionentidadCollectionEmpty(selected);
        } else {
            this.isPersonaDireccionentidadCollectionEmpty = true;
        }
    }

    /**
    * Sets the "items" attribute with a collection of PersonaDireccionentidad entities that are retrieved from LogisticaUsodireccion?cap_first
     * and returns the navigation outcome.
     *
     * @return  navigation outcome for PersonaDireccionentidad page
     */
    public String navigatePersonaDireccionentidadCollection() {
        LogisticaUsodireccion selected = this.getSelected();
        if (selected != null) {
            LogisticaUsodireccionFacade ejbFacade = (LogisticaUsodireccionFacade) this.getFacade();
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("PersonaDireccionentidad_items", ejbFacade.findPersonaDireccionentidadCollection(selected));
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/app/personaDireccionentidad/index";
    }

}
