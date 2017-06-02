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
import org.primefaces.omega.modelo.Dao.Implements.PersonaTipoentidadDaoImplements;
import org.primefaces.omega.modelo.PersonaTipoentidad;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class PersonaTipoentidadControlador { 
    private List<PersonaTipoentidad> personatipoentidad = null;
    private PersonaTipoentidad selectedpersonatipoentidad;
  
    private PersonaTipoentidadDao objPersonaTipoentidadDao= new PersonaTipoentidadDaoImplements();

    public PersonaTipoentidadControlador() {
    }

    public List<PersonaTipoentidad> getPersonatipoentidad() {
        return personatipoentidad;
    }

    public PersonaTipoentidad getSelectedpersonatipoentidad() {
        return selectedpersonatipoentidad;
    }

    public void setSelectedpersonatipoentidad(PersonaTipoentidad selectedpersonatipoentidad) {
        this.selectedpersonatipoentidad = selectedpersonatipoentidad;
    }
   
   
}
