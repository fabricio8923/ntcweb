/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.PersonaTipoentidad;

/**
 *
 * @author fabricio
 */
public interface PersonaTipoentidadDao {

    public void InsertarPersonaTipoentidad(PersonaTipoentidad ObjPersonaTipoentidades);

    public void EliminarPersonaTipoentidad(PersonaTipoentidad ObjPersonaTipoentidades);

    public void ActualizarPersonaTipoentidad(PersonaTipoentidad ObjPersonaTipoentidades);

    public ArrayList BuscarPersonaTipoentidad(String Consulta);

    public ArrayList LoadTablaPersonaTipoentidades();
}
