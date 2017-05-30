/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.OrganizacionTipoorganizacion;

/**
 *
 * @author fabricio
 */
public interface OrganizacionTipoorganizacionDao {

    public void InsertarOrganizacionTipoorganizacion(OrganizacionTipoorganizacion ObjOrganizacionTipoorganizaciones);

    public void EliminarOrganizacionTipoorganizacion(OrganizacionTipoorganizacion ObjOrganizacionTipoorganizaciones);

    public void ActualizarOrganizacionTipoorganizacion(OrganizacionTipoorganizacion ObjOrganizacionTipoorganizaciones);

    public ArrayList BuscarOrganizacionTipoorganizacion(String Consulta);

    public ArrayList LoadTablaOrganizacionTipoorganizaciones();
}
