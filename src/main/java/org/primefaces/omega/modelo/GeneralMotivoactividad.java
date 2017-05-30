package org.primefaces.omega.modelo;
// Generated 30-may-2017 1:23:42 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * GeneralMotivoactividad generated by hbm2java
 */
public class GeneralMotivoactividad  implements java.io.Serializable {


     private Integer motivoActividadId;
     private GeneralCategoriaactividad generalCategoriaactividad;
     private String nombre;
     private String descripcion;
     private String abreviacion;
     private Date fechaModificacion;
     private String usuarioModificacion;
     private boolean motivoActividadRegistro;
     private Set organizacionDetordentrabajos = new HashSet(0);
     private Set organizacionDetordenservicios = new HashSet(0);

    public GeneralMotivoactividad() {
    }

	
    public GeneralMotivoactividad(GeneralCategoriaactividad generalCategoriaactividad, String nombre, String descripcion, String abreviacion, Date fechaModificacion, String usuarioModificacion, boolean motivoActividadRegistro) {
        this.generalCategoriaactividad = generalCategoriaactividad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.abreviacion = abreviacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioModificacion = usuarioModificacion;
        this.motivoActividadRegistro = motivoActividadRegistro;
    }
    public GeneralMotivoactividad(GeneralCategoriaactividad generalCategoriaactividad, String nombre, String descripcion, String abreviacion, Date fechaModificacion, String usuarioModificacion, boolean motivoActividadRegistro, Set organizacionDetordentrabajos, Set organizacionDetordenservicios) {
       this.generalCategoriaactividad = generalCategoriaactividad;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.abreviacion = abreviacion;
       this.fechaModificacion = fechaModificacion;
       this.usuarioModificacion = usuarioModificacion;
       this.motivoActividadRegistro = motivoActividadRegistro;
       this.organizacionDetordentrabajos = organizacionDetordentrabajos;
       this.organizacionDetordenservicios = organizacionDetordenservicios;
    }
   
    public Integer getMotivoActividadId() {
        return this.motivoActividadId;
    }
    
    public void setMotivoActividadId(Integer motivoActividadId) {
        this.motivoActividadId = motivoActividadId;
    }
    public GeneralCategoriaactividad getGeneralCategoriaactividad() {
        return this.generalCategoriaactividad;
    }
    
    public void setGeneralCategoriaactividad(GeneralCategoriaactividad generalCategoriaactividad) {
        this.generalCategoriaactividad = generalCategoriaactividad;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getAbreviacion() {
        return this.abreviacion;
    }
    
    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public String getUsuarioModificacion() {
        return this.usuarioModificacion;
    }
    
    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }
    public boolean isMotivoActividadRegistro() {
        return this.motivoActividadRegistro;
    }
    
    public void setMotivoActividadRegistro(boolean motivoActividadRegistro) {
        this.motivoActividadRegistro = motivoActividadRegistro;
    }
    public Set getOrganizacionDetordentrabajos() {
        return this.organizacionDetordentrabajos;
    }
    
    public void setOrganizacionDetordentrabajos(Set organizacionDetordentrabajos) {
        this.organizacionDetordentrabajos = organizacionDetordentrabajos;
    }
    public Set getOrganizacionDetordenservicios() {
        return this.organizacionDetordenservicios;
    }
    
    public void setOrganizacionDetordenservicios(Set organizacionDetordenservicios) {
        this.organizacionDetordenservicios = organizacionDetordenservicios;
    }




}

