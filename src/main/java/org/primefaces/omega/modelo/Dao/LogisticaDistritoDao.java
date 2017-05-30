/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.LogisticaDistrito;

/**
 *
 * @author fabricio
 */
public interface LogisticaDistritoDao {

    public void InsertarLogisticaDistrito(LogisticaDistrito ObjLogisticaDistritos);

    public void EliminarLogisticaDistrito(LogisticaDistrito ObjLogisticaDistritos);

    public void ActualizarLogisticaDistrito(LogisticaDistrito ObjLogisticaDistritos);

    public ArrayList BuscarLogisticaDistrito(String Consulta);

    public ArrayList LoadTablaLogisticaDistritos();
}
