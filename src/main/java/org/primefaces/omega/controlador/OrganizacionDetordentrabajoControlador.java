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
import org.primefaces.omega.modelo.Dao.Implements.OrganizacionDetordentrabajoDaoImplements;
import org.primefaces.omega.modelo.OrganizacionDetordentrabajo;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class OrganizacionDetordentrabajoControlador { 
    private List<OrganizacionDetordentrabajo> organizaciondetordentrabajo = null;
    private OrganizacionDetordentrabajo selectedorganizaciondetordentrabajo;
    private OrganizacionDetordentrabajoDao objOrganizacionDetordentrabajoDao= new OrganizacionDetordentrabajoDaoImplements();

    public OrganizacionDetordentrabajoControlador() {
    }

    
    public List<OrganizacionDetordentrabajo> getOrganizaciondetordentrabajo() {
        return organizaciondetordentrabajo;
    }

    
    public OrganizacionDetordentrabajo getSelectedorganizaciondetordentrabajo() {
        return selectedorganizaciondetordentrabajo;
    }

    public void setSelectedorganizaciondetordentrabajo(OrganizacionDetordentrabajo selectedorganizaciondetordentrabajo) {
        this.selectedorganizaciondetordentrabajo = selectedorganizaciondetordentrabajo;
    }
    
    
    
}
