/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.PersonaDireccionentidad;

/**
 *
 * @author fabricio
 */
public interface PersonaDireccionentidadDao {

    public void InsertarPersonaDireccionentidad(PersonaDireccionentidad ObjPersonaDireccionentidades);

    public void EliminarPersonaDireccionentidad(PersonaDireccionentidad ObjPersonaDireccionentidades);

    public void ActualizarPersonaDireccionentidad(PersonaDireccionentidad ObjPersonaDireccionentidades);

    public ArrayList BuscarPersonaDireccionentidad(String Consulta);

    public ArrayList LoadTablaPersonaDireccionentidades();
}
