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
    private PersonaEntidadnegocioDao objPersonaEntidadnegocioDao= new PersonaEntidadnegocioDaoImplements();
    

  
}
