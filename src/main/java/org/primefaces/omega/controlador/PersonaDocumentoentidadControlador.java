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
import org.primefaces.omega.modelo.Dao.Implements.PersonaDocumentoentidadDaoImplements;
import org.primefaces.omega.modelo.PersonaDocumentoentidad;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class PersonaDocumentoentidadControlador { 
    private List<PersonaDocumentoentidad> personadocumentoentidad = null;
    private PersonaDocumentoentidad selectedpersonadocumentoentidad;
   
    private PersonaDocumentoentidadDao objPersonaDocumentoentidadDao= new PersonaDocumentoentidadDaoImplements();

    public PersonaDocumentoentidadControlador() {
    }

    public List<PersonaDocumentoentidad> getPersonadocumentoentidad() {
        return personadocumentoentidad;
    }

    
    public PersonaDocumentoentidad getSelectedpersonadocumentoentidad() {
        return selectedpersonadocumentoentidad;
    }

    public void setSelectedpersonadocumentoentidad(PersonaDocumentoentidad selectedpersonadocumentoentidad) {
        this.selectedpersonadocumentoentidad = selectedpersonadocumentoentidad;
    }

  
 
}
