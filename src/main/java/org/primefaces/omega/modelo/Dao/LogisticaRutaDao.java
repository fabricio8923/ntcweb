/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.LogisticaRuta;

/**
 *
 * @author fabricio
 */
public interface LogisticaRutaDao {

    public void InsertarLogisticaRuta(LogisticaRuta ObjLogisticaRutas);

    public void EliminarLogisticaRuta(LogisticaRuta ObjLogisticaRutas);

    public void ActualizarLogisticaRuta(LogisticaRuta ObjLogisticaRutas);

    public ArrayList BuscarLogisticaRuta(String Consulta);

    public ArrayList LoadTablaLogisticaRutas();
}
