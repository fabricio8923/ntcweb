/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.primefaces.omega.controlador;

import org.primefaces.omega.modelo.Dao.*;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.omega.modelo.Dao.Implements.LogisticaDistritoDaoImplements;
import org.primefaces.omega.modelo.LogisticaDistrito;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class LogisticaDistritoControlador { 
    private List<LogisticaDistrito> logisticadistrito = null;
    private LogisticaDistrito selectedlogisticadistrito;
    private LogisticaDistritoDao objLogisticaDistritoDao= new LogisticaDistritoDaoImplements();

    public LogisticaDistritoControlador() {
    }

    
    public List<LogisticaDistrito> getLogisticadistrito() {
        return logisticadistrito;
    }

    public LogisticaDistrito getSelectedlogisticadistrito() {
        return selectedlogisticadistrito;
    }

    public void setSelectedlogisticadistrito(LogisticaDistrito selectedlogisticadistrito) {
        this.selectedlogisticadistrito = selectedlogisticadistrito;
    }
       
    
}
