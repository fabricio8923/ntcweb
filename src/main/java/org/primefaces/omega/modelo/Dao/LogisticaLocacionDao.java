/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.LogisticaLocacion;

/**
 *
 * @author fabricio
 */
public interface LogisticaLocacionDao {

    public void InsertarLogisticaLocacion(LogisticaLocacion ObjLogisticaLocaciones);

    public void EliminarLogisticaLocacion(LogisticaLocacion ObjLogisticaLocaciones);

    public void ActualizarLogisticaLocacion(LogisticaLocacion ObjLogisticaLocaciones);

    public ArrayList BuscarLogisticaLocacion(String Consulta);

    public ArrayList LoadTablaLogisticaLocaciones();
}
