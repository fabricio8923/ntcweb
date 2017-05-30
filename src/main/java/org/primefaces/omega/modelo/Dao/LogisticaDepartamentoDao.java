/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.LogisticaDepartamento;

/**
 *
 * @author fabricio
 */
public interface LogisticaDepartamentoDao {

    public void InsertarLogisticaDepartamento(LogisticaDepartamento ObjLogisticaDepartamentos);

    public void EliminarLogisticaDepartamento(LogisticaDepartamento ObjLogisticaDepartamentos);

    public void ActualizarLogisticaDepartamento(LogisticaDepartamento ObjLogisticaDepartamentos);

    public ArrayList BuscarLogisticaDepartamento(String Consulta);

    public ArrayList LoadTablaLogisticaDepartamentos();
}
