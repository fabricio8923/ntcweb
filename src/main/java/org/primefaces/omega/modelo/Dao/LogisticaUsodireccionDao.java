/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.LogisticaUsodireccion;

/**
 *
 * @author fabricio
 */
public interface LogisticaUsodireccionDao {

    public void InsertarLogisticaUsodireccion(LogisticaUsodireccion ObjLogisticaUsodirecciones);

    public void EliminarLogisticaUsodireccion(LogisticaUsodireccion ObjLogisticaUsodirecciones);

    public void ActualizarLogisticaUsodireccion(LogisticaUsodireccion ObjLogisticaUsodirecciones);

    public ArrayList BuscarLogisticaUsodireccion(String Consulta);

    public ArrayList LoadTablaLogisticaUsodirecciones();
}
