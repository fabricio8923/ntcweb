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
import org.primefaces.omega.modelo.Dao.Implements.LogisticaDepartamentoDaoImplements;
import org.primefaces.omega.modelo.LogisticaDepartamento;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class LogisticaDepartamentoControlador { 
    private List<LogisticaDepartamento> logisticadepartamento = null;
    private LogisticaDepartamento selectedlogisticadepartamento;
    private LogisticaDepartamentoDao objLogisticaDepartamentoDao= new LogisticaDepartamentoDaoImplements();
   
}
