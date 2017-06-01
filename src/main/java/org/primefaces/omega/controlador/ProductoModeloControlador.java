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
import org.primefaces.omega.modelo.ProductoModelo;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class ProductoModeloControlador { 
    private List<PersonaPersona> persona = null;
    private PersonaPersona selectedPersona;
    private PersonaEntidadnegocio selectEntidadnegocio;
   
    private PersonaEntidadnegocioDao objEntidadNegocioDao= new PersonaEntidadnegocioDaoImplements();
    private PersonaPersonaDao objPersonaDao = new PersonaPersonaDaoImplements();

    
}
