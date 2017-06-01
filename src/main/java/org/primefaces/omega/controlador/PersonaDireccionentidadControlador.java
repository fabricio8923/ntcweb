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
import org.primefaces.omega.modelo.PersonaDireccionentidad;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class PersonaDireccionentidadControlador { 
    private List<PersonaDireccionentidad> personadireccionentidad = null;
    private PersonaDireccionentidad selectedpersonadireccionentidad;
    private PersonaDireccionentidadDao objPersonaDireccionentidadDao = new PersonaDireccionentidadDaoImplements();

    public PersonaDireccionentidadControlador() {
    }

    public List<PersonaDireccionentidad> getPersonadireccionentidad() {
        return personadireccionentidad;
    }
   

    public PersonaDireccionentidad getSelectedpersonadireccionentidad() {
        return selectedpersonadireccionentidad;
    }

    public void setSelectedpersonadireccionentidad(PersonaDireccionentidad selectedpersonadireccionentidad) {
        this.selectedpersonadireccionentidad = selectedpersonadireccionentidad;
    }
   

    
}
