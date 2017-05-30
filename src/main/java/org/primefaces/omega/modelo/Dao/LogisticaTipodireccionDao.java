/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.LogisticaTipodireccion;

/**
 *
 * @author fabricio
 */
public interface LogisticaTipodireccionDao {

    public void InsertarLogisticaTipodireccion(LogisticaTipodireccion ObjLogisticaTipodirecciones);

    public void EliminarLogisticaTipodireccion(LogisticaTipodireccion ObjLogisticaTipodirecciones);

    public void ActualizarLogisticaTipodireccion(LogisticaTipodireccion ObjLogisticaTipodirecciones);

    public ArrayList BuscarLogisticaTipodireccion(String Consulta);

    public ArrayList LoadTablaLogisticaTipodirecciones();
}
