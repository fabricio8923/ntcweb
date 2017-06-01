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
import org.primefaces.omega.modelo.Dao.Implements.OrganizacionDetordenservicioDaoImplements;
import org.primefaces.omega.modelo.OrganizacionDetordenservicio;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class OrganizacionDetordenservicioControlador { 
    private List<OrganizacionDetordenservicio> organizaciondetordenservicio = null;
    private OrganizacionDetordenservicio selectedorganizaciondetordenservicio;
    private OrganizacionDetordenservicioDao objOrganizacionDetordenservicioDao= new OrganizacionDetordenservicioDaoImplements();

    public OrganizacionDetordenservicioControlador() {
    }

    
    public List<OrganizacionDetordenservicio> getOrganizaciondetordenservicio() {
        return organizaciondetordenservicio;
    }

    
    public OrganizacionDetordenservicio getSelectedorganizaciondetordenservicio() {
        return selectedorganizaciondetordenservicio;
    }

    public void setSelectedorganizaciondetordenservicio(OrganizacionDetordenservicio selectedorganizaciondetordenservicio) {
        this.selectedorganizaciondetordenservicio = selectedorganizaciondetordenservicio;
    }
   
    

   
}
