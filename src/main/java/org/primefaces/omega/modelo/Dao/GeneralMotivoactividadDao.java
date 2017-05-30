/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.GeneralMotivoactividad;

/**
 *
 * @author fabricio
 */
public interface GeneralMotivoactividadDao {

    public void InsertarGeneralMotivoactividad(GeneralMotivoactividad ObjGeneralMotivoactividades);

    public void EliminarGeneralMotivoactividad(GeneralMotivoactividad ObjGeneralMotivoactividades);

    public void ActualizarGeneralMotivoactividad(GeneralMotivoactividad ObjGeneralMotivoactividades);

    public ArrayList BuscarGeneralMotivoactividad(String Consulta);

    public ArrayList LoadTablaGeneralMotivoactividades();
}
