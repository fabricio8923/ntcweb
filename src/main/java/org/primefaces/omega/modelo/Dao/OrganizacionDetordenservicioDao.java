/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.OrganizacionDetordenservicio;

/**
 *
 * @author fabricio
 */
public interface OrganizacionDetordenservicioDao {

    public void InsertarOrganizacionDetordenservicio(OrganizacionDetordenservicio ObjOrganizacionDetordenservicios);

    public void EliminarOrganizacionDetordenservicio(OrganizacionDetordenservicio ObjOrganizacionDetordenservicios);

    public void ActualizarOrganizacionDetordenservicio(OrganizacionDetordenservicio ObjOrganizacionDetordenservicios);

    public ArrayList BuscarOrganizacionDetordenservicio(String Consulta);

    public ArrayList LoadTablaOrganizacionDetordenservicios();
}
