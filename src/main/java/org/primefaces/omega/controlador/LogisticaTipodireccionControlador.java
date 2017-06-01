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
import org.primefaces.omega.modelo.Dao.Implements.LogisticaTipodireccionDaoImplements;
import org.primefaces.omega.modelo.LogisticaTipodireccion;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class LogisticaTipodireccionControlador {

    private List<LogisticaTipodireccion> logisticatipodireccion = null;
    private LogisticaTipodireccion selectedlogisticatipodireccion;
    private LogisticaTipodireccionDao objLogisticaTipodireccionDao = new LogisticaTipodireccionDaoImplements();

    public LogisticaTipodireccionControlador() {
    }

    
    public List<LogisticaTipodireccion> getLogisticatipodireccion() {
        return logisticatipodireccion;
    }

    
    public LogisticaTipodireccion getSelectedlogisticatipodireccion() {
        return selectedlogisticatipodireccion;
    }

    public void setSelectedlogisticatipodireccion(LogisticaTipodireccion selectedlogisticatipodireccion) {
        this.selectedlogisticatipodireccion = selectedlogisticatipodireccion;
    }

    
}
