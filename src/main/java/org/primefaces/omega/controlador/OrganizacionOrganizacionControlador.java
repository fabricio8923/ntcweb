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
import org.primefaces.omega.modelo.Dao.Implements.OrganizacionOrganizacionDaoImplements;
import org.primefaces.omega.modelo.OrganizacionOrganizacion;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class OrganizacionOrganizacionControlador {

    private List<OrganizacionOrganizacion> organizacionorganizacion = null;
    private OrganizacionOrganizacion selectedorganizacionorganizacion;
    private OrganizacionOrganizacionDao objOrganizacionOrganizacionDao = new OrganizacionOrganizacionDaoImplements();

    public OrganizacionOrganizacionControlador() {
    }

    public List<OrganizacionOrganizacion> getOrganizacionorganizacion() {
        return organizacionorganizacion = objOrganizacionOrganizacionDao.LoadTablaOrganizacionOrganizaciones();
    }

    public OrganizacionOrganizacion getSelectedorganizacionorganizacion() {
        return selectedorganizacionorganizacion;
    }

    public void setSelectedorganizacionorganizacion(OrganizacionOrganizacion selectedorganizacionorganizacion) {
        this.selectedorganizacionorganizacion = selectedorganizacionorganizacion;
    }

    public void InsertarOrganizacionOrganizacion() {
        objOrganizacionOrganizacionDao.InsertarOrganizacionOrganizacion(selectedorganizacionorganizacion);
    }

    public void ActualizarOrganizacionOrganizacion() {
        objOrganizacionOrganizacionDao.ActualizarOrganizacionOrganizacion(selectedorganizacionorganizacion);
    }

    public void EliminarOrganizacionOrganizacion() {
        objOrganizacionOrganizacionDao.EliminarOrganizacionOrganizacion(selectedorganizacionorganizacion);
    }

}
