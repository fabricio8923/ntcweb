/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.LogisticaPais;

/**
 *
 * @author fabricio
 */
public interface LogisticaPaisDao {

    public void InsertarLogisticaPais(LogisticaPais ObjLogisticaPaises);

    public void EliminarLogisticaPais(LogisticaPais ObjLogisticaPaises);

    public void ActualizarLogisticaPais(LogisticaPais ObjLogisticaPaises);

    public ArrayList BuscarLogisticaPais(String Consulta);

    public ArrayList LoadTablaLogisticaPaises();
}
