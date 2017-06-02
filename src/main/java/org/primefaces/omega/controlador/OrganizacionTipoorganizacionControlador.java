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
import org.primefaces.omega.modelo.Dao.Implements.OrganizacionTipoorganizacionDaoImplements;
import org.primefaces.omega.modelo.OrganizacionTipoorganizacion;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class OrganizacionTipoorganizacionControlador {

    private List<OrganizacionTipoorganizacion> organizaciontipoorganizacion = null;
    private OrganizacionTipoorganizacion selectedorganizaciontipoorganizacion;
    private OrganizacionTipoorganizacionDao objOrganizacionTipoorganizacionDao = new OrganizacionTipoorganizacionDaoImplements();

    public OrganizacionTipoorganizacionControlador() {
    }

    public List<OrganizacionTipoorganizacion> getOrganizaciontipoorganizacion() {
        return organizaciontipoorganizacion = objOrganizacionTipoorganizacionDao.LoadTablaOrganizacionTipoorganizaciones();
    }

    public OrganizacionTipoorganizacion getSelectedorganizaciontipoorganizacion() {
        return selectedorganizaciontipoorganizacion;
    }

    public void setSelectedorganizaciontipoorganizacion(OrganizacionTipoorganizacion selectedorganizaciontipoorganizacion) {
        this.selectedorganizaciontipoorganizacion = selectedorganizaciontipoorganizacion;
    }

    public void InsertarOrganizacionTipoorganizacion() {
        objOrganizacionTipoorganizacionDao.InsertarOrganizacionTipoorganizacion(selectedorganizaciontipoorganizacion);
    }

    public void ActualizarOrganizacionTipoorganizacion() {
        objOrganizacionTipoorganizacionDao.ActualizarOrganizacionTipoorganizacion(selectedorganizaciontipoorganizacion);
    }

    public void EliminarOrganizacionTipoorganizacion() {
        objOrganizacionTipoorganizacionDao.EliminarOrganizacionTipoorganizacion(selectedorganizaciontipoorganizacion);
    }

}
