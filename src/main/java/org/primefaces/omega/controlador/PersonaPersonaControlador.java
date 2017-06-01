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
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import org.primefaces.omega.modelo.Dao.Implements.PersonaEntidadnegocioDaoImplements;
import org.primefaces.omega.modelo.Dao.Implements.PersonaPersonaDaoImplements;
import org.primefaces.omega.modelo.PersonaEntidadnegocio;
import org.primefaces.omega.modelo.PersonaPersona;
import org.primefaces.omega.modelo.PersonaTipoentidad;

/**
 *
 * @author fabricio
 */

@ManagedBean(name = "PersonaBean")
@ViewScoped
public class PersonaPersonaControlador {

    private List<PersonaPersona> persona = null;
    private PersonaPersona selectedPersona;
    private PersonaEntidadnegocio selectEntidadnegocio;
   
    private PersonaEntidadnegocioDao objEntidadNegocioDao= new PersonaEntidadnegocioDaoImplements();
    private PersonaPersonaDao objPersonaDao = new PersonaPersonaDaoImplements();

    public PersonaPersonaControlador() {
       this.selectedPersona = new PersonaPersona();
       this.selectEntidadnegocio= new PersonaEntidadnegocio();
    }

    
    public PersonaEntidadnegocio getSelectEntidadnegocio() {
        return selectEntidadnegocio;
    }

    public void setSelectEntidadnegocio(PersonaEntidadnegocio selectEntidadnegocio) {
        this.selectEntidadnegocio = selectEntidadnegocio;
    }

    public PersonaPersona getSelectedPersona() {
        return selectedPersona;
    }

    public void setSelectedPersona(PersonaPersona selectedPersona) {
        this.selectedPersona = selectedPersona;
    }

    public List<PersonaPersona> getPersona() {
        return objPersonaDao.LoadTablaPersonaPersonas();
    }

    public void InsertarEntidadyPersona( ActionEvent evt) {
        String Nombrecompleto= selectedPersona.getNombre()+", "+selectedPersona.getPrimerApellido()+
                ", "+selectedPersona.getSegundoApellido();
        selectEntidadnegocio.setNombre(Nombrecompleto);
        PersonaTipoentidad objPersonaTipoentidad= new PersonaTipoentidad();
        objPersonaTipoentidad.setTipoEntidadId(1);
        int entidadnegocioid=2;
        selectEntidadnegocio.setPersonaTipoentidad(objPersonaTipoentidad);
        
        objEntidadNegocioDao.InsertarPersonaEntidadnegocio(selectEntidadnegocio);
        selectedPersona.setEntidadNegocioId(entidadnegocioid);
        selectEntidadnegocio.setEntidadNegocioId(entidadnegocioid);
        selectedPersona.setPersonaEntidadnegocio(selectEntidadnegocio);
        selectedPersona.setFechaCreacion( new Date());
        selectedPersona.setUsuarioModificacion("User");
        selectedPersona.setEstadoRegistro(true);
        
        if (entidadnegocioid != 0) {
            //selectedPersona.setPersonaEntidadnegocio(selectEntidadnegocio);
            objPersonaDao.InsertarPersonaPersona(selectedPersona);
        }

    }
}
