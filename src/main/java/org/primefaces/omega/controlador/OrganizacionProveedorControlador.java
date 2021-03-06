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
import org.primefaces.omega.modelo.Dao.Implements.OrganizacionProveedorDaoImplements;
import org.primefaces.omega.modelo.OrganizacionProveedor;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class OrganizacionProveedorControlador {

    private List<OrganizacionProveedor> organizacionproveedor = null;
    private OrganizacionProveedor selectedorganizacionproveedor;
    private OrganizacionProveedorDao objOrganizacionProveedorDao = new OrganizacionProveedorDaoImplements();

    public OrganizacionProveedorControlador() {
    }

    public List<OrganizacionProveedor> getOrganizacionproveedor() {
        return organizacionproveedor = objOrganizacionProveedorDao.LoadTablaOrganizacionProveedores();
    }

    public OrganizacionProveedor getSelectedorganizacionproveedor() {
        return selectedorganizacionproveedor;
    }

    public void setSelectedorganizacionproveedor(OrganizacionProveedor selectedorganizacionproveedor) {
        this.selectedorganizacionproveedor = selectedorganizacionproveedor;
    }

    public void InsertarOrganizacionProveedor() {
        objOrganizacionProveedorDao.InsertarOrganizacionProveedor(selectedorganizacionproveedor);
    }

    public void ActualizarOrganizacionProveedor() {
        objOrganizacionProveedorDao.ActualizarOrganizacionProveedor(selectedorganizacionproveedor);
    }

    public void EliminarOrganizacionProveedor() {
        objOrganizacionProveedorDao.EliminarOrganizacionProveedor(selectedorganizacionproveedor);
    }

}
