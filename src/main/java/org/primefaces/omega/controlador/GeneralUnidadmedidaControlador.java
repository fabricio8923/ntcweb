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
import org.primefaces.omega.modelo.Dao.Implements.GeneralUnidadmedidaDaoImplements;
import org.primefaces.omega.modelo.GeneralUnidadmedida;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class GeneralUnidadmedidaControlador { 
    private List<GeneralUnidadmedida> generalunidadmedida = null;
    private GeneralUnidadmedida selectedgeneralunidadmedida;
    private GeneralUnidadmedidaDao objGeneralUnidadmedidaDao= new GeneralUnidadmedidaDaoImplements();
   

   
}
