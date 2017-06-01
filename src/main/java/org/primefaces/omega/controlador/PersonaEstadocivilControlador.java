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
import org.primefaces.omega.modelo.PersonaEstadocivil;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class PersonaEstadocivilControlador { 
    private List<PersonaEstadocivil> personaestadocivil = null;
    private PersonaEstadocivil selectedpersonaestadocivil;
 
    private PersonaEstadocivilDao objPersonaEstadocivilDao= new PersonaEstadocivilImplements;

    public PersonaEstadocivilControlador() {
    }

    public List<PersonaEstadocivil> getPersonaestadocivil() {
        return personaestadocivil;
    }

    public PersonaEstadocivil getSelectedpersonaestadocivil() {
        return selectedpersonaestadocivil;
    }

    public void setSelectedpersonaestadocivil(PersonaEstadocivil selectedpersonaestadocivil) {
        this.selectedpersonaestadocivil = selectedpersonaestadocivil;
    }

  
}
