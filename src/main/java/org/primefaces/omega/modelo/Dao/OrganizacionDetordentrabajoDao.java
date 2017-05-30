/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.OrganizacionDetordentrabajo;

/**
 *
 * @author fabricio
 */
public interface OrganizacionDetordentrabajoDao {

    public void InsertarOrganizacionDetordentrabajo(OrganizacionDetordentrabajo ObjOrganizacionDetordentrabajos);

    public void EliminarOrganizacionDetordentrabajo(OrganizacionDetordentrabajo ObjOrganizacionDetordentrabajos);

    public void ActualizarOrganizacionDetordentrabajo(OrganizacionDetordentrabajo ObjOrganizacionDetordentrabajos);

    public ArrayList BuscarOrganizacionDetordentrabajo(String Consulta);

    public ArrayList LoadTablaOrganizacionDetordentrabajos();
}
