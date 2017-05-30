/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.GeneralEstado;

/**
 *
 * @author fabricio
 */
public interface GeneralEstadoDao {

    public void InsertarGeneralEstado(GeneralEstado ObjGeneralEstadoes);

    public void EliminarGeneralEstado(GeneralEstado ObjGeneralEstadoes);

    public void ActualizarGeneralEstado(GeneralEstado ObjGeneralEstadoes);

    public ArrayList BuscarGeneralEstado(String Consulta);

    public ArrayList LoadTablaGeneralEstadoes();
}
