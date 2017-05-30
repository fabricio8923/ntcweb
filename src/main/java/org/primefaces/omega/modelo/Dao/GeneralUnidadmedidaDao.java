/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.GeneralUnidadmedida;

/**
 *
 * @author fabricio
 */
public interface GeneralUnidadmedidaDao {

    public void InsertarGeneralUnidadmedida(GeneralUnidadmedida ObjGeneralUnidadmedidas);

    public void EliminarGeneralUnidadmedida(GeneralUnidadmedida ObjGeneralUnidadmedidas);

    public void ActualizarGeneralUnidadmedida(GeneralUnidadmedida ObjGeneralUnidadmedidas);

    public ArrayList BuscarGeneralUnidadmedida(String Consulta);

    public ArrayList LoadTablaGeneralUnidadmedidas();
}
