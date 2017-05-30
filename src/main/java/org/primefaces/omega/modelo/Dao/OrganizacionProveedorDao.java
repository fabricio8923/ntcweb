/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.OrganizacionProveedor;

/**
 *
 * @author fabricio
 */
public interface OrganizacionProveedorDao {

    public void InsertarOrganizacionProveedor(OrganizacionProveedor ObjOrganizacionProveedores);

    public void EliminarOrganizacionProveedor(OrganizacionProveedor ObjOrganizacionProveedores);

    public void ActualizarOrganizacionProveedor(OrganizacionProveedor ObjOrganizacionProveedores);

    public ArrayList BuscarOrganizacionProveedor(String Consulta);

    public ArrayList LoadTablaOrganizacionProveedores();
}
