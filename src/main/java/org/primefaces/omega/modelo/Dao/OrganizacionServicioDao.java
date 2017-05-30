/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.OrganizacionServicio;

/**
 *
 * @author fabricio
 */
public interface OrganizacionServicioDao {

    public void InsertarOrganizacionServicio(OrganizacionServicio ObjOrganizacionServicios);

    public void EliminarOrganizacionServicio(OrganizacionServicio ObjOrganizacionServicios);

    public void ActualizarOrganizacionServicio(OrganizacionServicio ObjOrganizacionServicios);

    public ArrayList BuscarOrganizacionServicio(String Consulta);

    public ArrayList LoadTablaOrganizacionServicioes();
}
