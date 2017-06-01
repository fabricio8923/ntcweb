/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.primefaces.omega.controlador;

import java.util.List;
import org.primefaces.omega.modelo.Dao.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.omega.modelo.Dao.Implements.GeneralEstadoDaoImplements;
import org.primefaces.omega.modelo.GeneralEstado;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class GeneralEstadoControlador { 
    private List<GeneralEstado> generalestado = null;
    private GeneralEstado selectedgeneralestado;
    private GeneralEstadoDao objGeneralEstadoDao= new GeneralEstadoDaoImplements();
  

   
}
