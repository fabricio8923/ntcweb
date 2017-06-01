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
import org.primefaces.omega.modelo.Dao.Implements.GeneralMotivoactividadDaoImplements;
import org.primefaces.omega.modelo.GeneralMotivoactividad;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class GeneralMotivoactividadControlador {

    private List<GeneralMotivoactividad> generalmotivoactividad = null;
    private GeneralMotivoactividad selectedgeneralmotivoactividad;
    private GeneralMotivoactividadDao objGeneralMotivoactividadDao = new GeneralMotivoactividadDaoImplements();

    public GeneralMotivoactividadControlador() {
    }

    public GeneralMotivoactividad getSelectedgeneralmotivoactividad() {
        return selectedgeneralmotivoactividad;
    }

    public void setSelectedgeneralmotivoactividad(GeneralMotivoactividad selectedgeneralmotivoactividad) {
        this.selectedgeneralmotivoactividad = selectedgeneralmotivoactividad;
    }

    public List<GeneralMotivoactividad> getGeneralmotivoactividad() {
        return generalmotivoactividad=objGeneralMotivoactividadDao.LoadTablaGeneralMotivoactividades();
    }

    public void InsertarGeneralMotivoactividad() {
        objGeneralMotivoactividadDao.InsertarGeneralMotivoactividad(selectedgeneralmotivoactividad);
    }

    public void ActualizarGeneralMotivoactividad() {
        objGeneralMotivoactividadDao.ActualizarGeneralMotivoactividad(selectedgeneralmotivoactividad);
    }

    public void EliminarGeneralMotivoactividad() {
        objGeneralMotivoactividadDao.EliminarGeneralMotivoactividad(selectedgeneralmotivoactividad);
    }
}
