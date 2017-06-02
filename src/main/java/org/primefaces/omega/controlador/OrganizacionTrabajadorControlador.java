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
import org.primefaces.omega.modelo.Dao.Implements.OrganizacionTrabajadorDaoImplements;
import org.primefaces.omega.modelo.OrganizacionTrabajador;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class OrganizacionTrabajadorControlador {

    private List<OrganizacionTrabajador> organizaciontrabajador = null;
    private OrganizacionTrabajador selectedorganizaciontrabajador;
    private OrganizacionTrabajadorDao objOrganizacionTrabajadorDao = new OrganizacionTrabajadorDaoImplements();

    public OrganizacionTrabajadorControlador() {
    }

    public List<OrganizacionTrabajador> getOrganizaciontrabajador() {
        return organizaciontrabajador = objOrganizacionTrabajadorDao.LoadTablaOrganizacionTrabajadores();
    }

    public OrganizacionTrabajador getSelectedorganizaciontrabajador() {
        return selectedorganizaciontrabajador;
    }

    public void setSelectedorganizaciontrabajador(OrganizacionTrabajador selectedorganizaciontrabajador) {
        this.selectedorganizaciontrabajador = selectedorganizaciontrabajador;
    }

    public void InsertarOrganizacionTrabajador() {
        objOrganizacionTrabajadorDao.InsertarOrganizacionTrabajador(selectedorganizaciontrabajador);
    }

    public void ActualizarOrganizacionTrabajador() {
        objOrganizacionTrabajadorDao.ActualizarOrganizacionTrabajador(selectedorganizaciontrabajador);
    }

    public void EliminarOrganizacionTrabajador() {
        objOrganizacionTrabajadorDao.EliminarOrganizacionTrabajador(selectedorganizaciontrabajador);
    }

}
