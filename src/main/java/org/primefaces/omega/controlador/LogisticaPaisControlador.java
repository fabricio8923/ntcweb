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
import org.primefaces.omega.modelo.Dao.Implements.LogisticaPaisDaoImplements;
import org.primefaces.omega.modelo.Dao.Implements.PersonaEntidadnegocioDaoImplements;
import org.primefaces.omega.modelo.LogisticaPais;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class LogisticaPaisControlador {

    private List<LogisticaPais> logisticapais = null;
    private LogisticaPais selectedlogisticapais;
    private LogisticaPaisDao objLogisticaPaisDao = new LogisticaPaisDaoImplements();

    public LogisticaPaisControlador() {
    }

    public List<LogisticaPais> getLogisticapais() {
        return logisticapais = objLogisticaPaisDao.LoadTablaLogisticaPaises();
    }

    public LogisticaPais getSelectedlogisticapais() {
        return selectedlogisticapais;
    }

    public void setSelectedlogisticapais(LogisticaPais selectedlogisticapais) {
        this.selectedlogisticapais = selectedlogisticapais;
    }

    public void InsertarLogisticaPais() {
        objLogisticaPaisDao.InsertarLogisticaPais(selectedlogisticapais);
    }

    public void ActualizarLogisticaPais() {
        objLogisticaPaisDao.ActualizarLogisticaPais(selectedlogisticapais);
    }

    public void EliminarLogisticaPais() {
        objLogisticaPaisDao.EliminarLogisticaPais(selectedlogisticapais);
    }
}
