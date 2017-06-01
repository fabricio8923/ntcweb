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
import org.primefaces.omega.modelo.Dao.Implements.PersonaTipodocumentoDaoImplements;
import org.primefaces.omega.modelo.PersonaTipodocumento;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class PersonaTipodocumentoControlador { 
    private List<PersonaTipodocumento> personatipodocumento = null;
    private PersonaTipodocumento selectedpersonatipodocumento;
   
    private PersonaTipodocumentoDao objPersonaTipodocumentoDao= new PersonaTipodocumentoDaoImplements();

    public PersonaTipodocumentoControlador() {
    }

    public List<PersonaTipodocumento> getPersonatipodocumento() {
        return personatipodocumento = objPersonaTipodocumentoDao.LoadTablaPersonaTipodocumentos();
    }

    public PersonaTipodocumento getSelectedpersonatipodocumento() {
        return selectedpersonatipodocumento;
    }

    public void setSelectedpersonatipodocumento(PersonaTipodocumento selectedpersonatipodocumento) {
        this.selectedpersonatipodocumento = selectedpersonatipodocumento;
    }
   
    public void InsertarPersonaTipodocumento(){
    objPersonaTipodocumentoDao.InsertarPersonaTipodocumento(selectedpersonatipodocumento);
    }
    public void ActualizarPersonaTipodocumento(){
    objPersonaTipodocumentoDao.ActualizarPersonaTipodocumento(selectedpersonatipodocumento);
    }
    public void EliminarPersonaTipodocumento(){
    objPersonaTipodocumentoDao.EliminarPersonaTipodocumento(selectedpersonatipodocumento);
    }
   
    
}
