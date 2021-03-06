/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.controlador;

import org.primefaces.omega.modelo.Dao.*;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.omega.modelo.Dao.Implements.LogisticaProvinciaDaoImplements;
import org.primefaces.omega.modelo.LogisticaProvincia;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class LogisticaProvinciaControlador {

    private List<LogisticaProvincia> logisticaprovincia = null;
    private LogisticaProvincia selectedlogisticaprovincia;
    private LogisticaProvinciaDao objLogisticaProvinciaDao = new LogisticaProvinciaDaoImplements();

    public LogisticaProvinciaControlador() {
    }

    public List<LogisticaProvincia> getLogisticaprovincia() {
        return logisticaprovincia = objLogisticaProvinciaDao.LoadTablaLogisticaProvincias();
    }

    public LogisticaProvincia getSelectedlogisticaprovincia() {
        return selectedlogisticaprovincia;
    }

    public void setSelectedlogisticaprovincia(LogisticaProvincia selectedlogisticaprovincia) {
        this.selectedlogisticaprovincia = selectedlogisticaprovincia;
    }

    public void InsertarLogisticaProvincia() {
        objLogisticaProvinciaDao.InsertarLogisticaProvincia(selectedlogisticaprovincia);
    }

    public void ActualizarLogisticaProvincia() {
        objLogisticaProvinciaDao.ActualizarLogisticaProvincia(selectedlogisticaprovincia);
    }

    public void EliminarLogisticaProvincia() {
        objLogisticaProvinciaDao.EliminarLogisticaProvincia(selectedlogisticaprovincia);
    }

}
