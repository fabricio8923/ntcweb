/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.controlador;

import org.primefaces.omega.modelo.Dao.*;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.omega.modelo.Dao.Implements.OrganizacionRazonsocialDaoImplements;
import org.primefaces.omega.modelo.OrganizacionRazonsocial;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class OrganizacionRazonsocialControlador {

    private List<OrganizacionRazonsocial> organizacionrazonsocial = null;
    private OrganizacionRazonsocial selectedorganizacionrazonsocial;
    private OrganizacionRazonsocialDao objOrganizacionRazonsocialDao = new OrganizacionRazonsocialDaoImplements();

    public OrganizacionRazonsocialControlador() {
    }

    public List<OrganizacionRazonsocial> getOrganizacionrazonsocial() {
        return organizacionrazonsocial = objOrganizacionRazonsocialDao.LoadTablaOrganizacionRazonsociales();
    }

    public OrganizacionRazonsocial getSelectedorganizacionrazonsocial() {
        return selectedorganizacionrazonsocial;
    }

    public void setSelectedorganizacionrazonsocial(OrganizacionRazonsocial selectedorganizacionrazonsocial) {
        this.selectedorganizacionrazonsocial = selectedorganizacionrazonsocial;
    }

    public void InsertarOrganizacionRazonsocial() {
        objOrganizacionRazonsocialDao.InsertarOrganizacionRazonsocial(selectedorganizacionrazonsocial);
    }

    public void ActualizarOrganizacionRazonsocial() {
        objOrganizacionRazonsocialDao.ActualizarOrganizacionRazonsocial(selectedorganizacionrazonsocial);
    }

    public void EliminarOrganizacionRazonsocial() {
        objOrganizacionRazonsocialDao.EliminarOrganizacionRazonsocial(selectedorganizacionrazonsocial);
    }

}
