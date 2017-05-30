/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.GeneralCategoriaactividad;

/**
 *
 * @author fabricio
 */
public interface GeneralCategoriaactividadDao {

    public void InsertarGeneralCategoriaactividad(GeneralCategoriaactividad ObjGeneralCategoriaactividades);

    public void EliminarGeneralCategoriaactividad(GeneralCategoriaactividad ObjGeneralCategoriaactividades);

    public void ActualizarGeneralCategoriaactividad(GeneralCategoriaactividad ObjGeneralCategoriaactividades);

    public ArrayList BuscarGeneralCategoriaactividad(String Consulta);

    public ArrayList LoadTablaGeneralCategoriaactividades();
}
