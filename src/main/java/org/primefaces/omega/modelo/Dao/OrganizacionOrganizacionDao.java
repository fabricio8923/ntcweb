/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.OrganizacionOrganizacion;

/**
 *
 * @author fabricio
 */
public interface OrganizacionOrganizacionDao {

    public void InsertarOrganizacionOrganizacion(OrganizacionOrganizacion ObjOrganizacionOrganizaciones);

    public void EliminarOrganizacionOrganizacion(OrganizacionOrganizacion ObjOrganizacionOrganizaciones);

    public void ActualizarOrganizacionOrganizacion(OrganizacionOrganizacion ObjOrganizacionOrganizaciones);

    public ArrayList BuscarOrganizacionOrganizacion(String Consulta);

    public ArrayList LoadTablaOrganizacionOrganizaciones();
}
