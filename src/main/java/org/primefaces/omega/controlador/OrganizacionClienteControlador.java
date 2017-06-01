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
import org.primefaces.omega.modelo.Dao.Implements.OrganizacionClienteDaoImplements;
import org.primefaces.omega.modelo.OrganizacionCliente;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class OrganizacionClienteControlador {

    private List<OrganizacionCliente> organizacioncliente = null;
    private OrganizacionCliente selectedorganizacioncliente;
    private OrganizacionClienteDao objOrganizacionClienteDao = new OrganizacionClienteDaoImplements();

    public OrganizacionClienteControlador() {
    }

    public List<OrganizacionCliente> getOrganizacioncliente() {
        return organizacioncliente = objOrganizacionClienteDao.LoadTablaOrganizacionClientes();
    }

    public OrganizacionCliente getSelectedorganizacioncliente() {
        return selectedorganizacioncliente;
    }

    public void setSelectedorganizacioncliente(OrganizacionCliente selectedorganizacioncliente) {
        this.selectedorganizacioncliente = selectedorganizacioncliente;
    }

    public void InsertarOrganizacionCliente() {
        objOrganizacionClienteDao.InsertarOrganizacionCliente(selectedorganizacioncliente);
    }

    public void ActualizarOrganizacionCliente() {
        objOrganizacionClienteDao.ActualizarOrganizacionCliente(selectedorganizacioncliente);
    }

    public void EliminarOrganizacionCliente() {
        objOrganizacionClienteDao.EliminarOrganizacionCliente(selectedorganizacioncliente);
    }

}
