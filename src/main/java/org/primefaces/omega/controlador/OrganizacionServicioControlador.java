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
import org.primefaces.omega.modelo.Dao.Implements.OrganizacionServicioDaoImplements;
import org.primefaces.omega.modelo.OrganizacionServicio;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class OrganizacionServicioControlador {

    private List<OrganizacionServicio> organizacionservicio = null;
    private OrganizacionServicio selectedorganizacionservicio;
    private OrganizacionServicioDao objOrganizacionServicioDao = new OrganizacionServicioDaoImplements();

    public OrganizacionServicioControlador() {
    }

    public List<OrganizacionServicio> getOrganizacionservicio() {
        return organizacionservicio = objOrganizacionServicioDao.LoadTablaOrganizacionServicioes();
    }

    public OrganizacionServicio getSelectedorganizacionservicio() {
        return selectedorganizacionservicio;
    }

    public void setSelectedorganizacionservicio(OrganizacionServicio selectedorganizacionservicio) {
        this.selectedorganizacionservicio = selectedorganizacionservicio;
    }

    public void InsertarOrganizacionServicio() {
        objOrganizacionServicioDao.InsertarOrganizacionServicio(selectedorganizacionservicio);
    }

    public void ActualizarOrganizacionServicio() {
        objOrganizacionServicioDao.ActualizarOrganizacionServicio(selectedorganizacionservicio);
    }

    public void EliminarOrganizacionServicio() {
        objOrganizacionServicioDao.EliminarOrganizacionServicio(selectedorganizacionservicio);
    }

}
