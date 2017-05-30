/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.LogisticaProvincia;

/**
 *
 * @author fabricio
 */
public interface LogisticaProvinciaDao {

    public void InsertarLogisticaProvincia(LogisticaProvincia ObjLogisticaProvincias);

    public void EliminarLogisticaProvincia(LogisticaProvincia ObjLogisticaProvincias);

    public void ActualizarLogisticaProvincia(LogisticaProvincia ObjLogisticaProvincias);

    public ArrayList BuscarLogisticaProvincia(String Consulta);

    public ArrayList LoadTablaLogisticaProvincias();
}
