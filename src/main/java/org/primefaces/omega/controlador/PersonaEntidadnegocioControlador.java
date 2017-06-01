/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.primefaces.omega.controlador;

import org.primefaces.omega.modelo.Dao.*;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import org.primefaces.omega.modelo.PersonaEntidadnegocio;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class PersonaEntidadnegocioControlador { 
    private List<PersonaEntidadnegocio> personaentidadnegocio = null;
    private PersonaEntidadnegocio selectedpersonaentidadnegocio;
    
    private PersonaEntidadnegocioDao objPersonaEntidadnegocioDao= new PersonaEntidadnegocioDaoImplements;

    public PersonaEntidadnegocioControlador() {
    }

    public List<PersonaEntidadnegocio> getPersonaentidadnegocio() {
        return personaentidadnegocio;
    }

    public PersonaEntidadnegocio getSelectedpersonaentidadnegocio() {
        return selectedpersonaentidadnegocio;
    }

    public void setSelectedpersonaentidadnegocio(PersonaEntidadnegocio selectedpersonaentidadnegocio) {
        this.selectedpersonaentidadnegocio = selectedpersonaentidadnegocio;
    }
    
    
}
