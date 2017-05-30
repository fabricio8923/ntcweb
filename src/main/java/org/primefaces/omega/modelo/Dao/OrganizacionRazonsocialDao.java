/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.OrganizacionRazonsocial;

/**
 *
 * @author fabricio
 */
public interface OrganizacionRazonsocialDao {

    public void InsertarOrganizacionRazonsocial(OrganizacionRazonsocial ObjOrganizacionRazonsociales);

    public void EliminarOrganizacionRazonsocial(OrganizacionRazonsocial ObjOrganizacionRazonsociales);

    public void ActualizarOrganizacionRazonsocial(OrganizacionRazonsocial ObjOrganizacionRazonsociales);

    public ArrayList BuscarOrganizacionRazonsocial(String Consulta);

    public ArrayList LoadTablaOrganizacionRazonsociales();
}
