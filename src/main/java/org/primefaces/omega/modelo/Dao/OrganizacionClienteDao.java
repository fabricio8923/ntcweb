/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.OrganizacionCliente;

/**
 *
 * @author fabricio
 */
public interface OrganizacionClienteDao {

    public void InsertarOrganizacionCliente(OrganizacionCliente ObjOrganizacionClientes);

    public void EliminarOrganizacionCliente(OrganizacionCliente ObjOrganizacionClientes);

    public void ActualizarOrganizacionCliente(OrganizacionCliente ObjOrganizacionClientes);

    public ArrayList BuscarOrganizacionCliente(String Consulta);

    public ArrayList LoadTablaOrganizacionClientes();
}
