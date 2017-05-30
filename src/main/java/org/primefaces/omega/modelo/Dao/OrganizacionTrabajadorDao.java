/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.OrganizacionTrabajador;

/**
 *
 * @author fabricio
 */
public interface OrganizacionTrabajadorDao {

    public void InsertarOrganizacionTrabajador(OrganizacionTrabajador ObjOrganizacionTrabajadores);

    public void EliminarOrganizacionTrabajador(OrganizacionTrabajador ObjOrganizacionTrabajadores);

    public void ActualizarOrganizacionTrabajador(OrganizacionTrabajador ObjOrganizacionTrabajadores);

    public ArrayList BuscarOrganizacionTrabajador(String Consulta);

    public ArrayList LoadTablaOrganizacionTrabajadores();
}
