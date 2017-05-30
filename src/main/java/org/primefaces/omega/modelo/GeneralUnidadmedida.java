package org.primefaces.omega.modelo;
// Generated 30-may-2017 1:23:42 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * GeneralUnidadmedida generated by hbm2java
 */
public class GeneralUnidadmedida  implements java.io.Serializable {


     private Integer unidadMedidaId;
     private String nombre;
     private String descripcion;
     private String abreviacion;
     private Date fechaModificacion;
     private String usuarioModificacion;
     private boolean unidadMedidaRegistro;
     private Set logisticaRutas = new HashSet(0);
     private Set productoActivos = new HashSet(0);
     private Set productoInventarios = new HashSet(0);

    public GeneralUnidadmedida() {
    }

	
    public GeneralUnidadmedida(String nombre, String descripcion, String abreviacion, Date fechaModificacion, String usuarioModificacion, boolean unidadMedidaRegistro) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.abreviacion = abreviacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioModificacion = usuarioModificacion;
        this.unidadMedidaRegistro = unidadMedidaRegistro;
    }
    public GeneralUnidadmedida(String nombre, String descripcion, String abreviacion, Date fechaModificacion, String usuarioModificacion, boolean unidadMedidaRegistro, Set logisticaRutas, Set productoActivos, Set productoInventarios) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.abreviacion = abreviacion;
       this.fechaModificacion = fechaModificacion;
       this.usuarioModificacion = usuarioModificacion;
       this.unidadMedidaRegistro = unidadMedidaRegistro;
       this.logisticaRutas = logisticaRutas;
       this.productoActivos = productoActivos;
       this.productoInventarios = productoInventarios;
    }
   
    public Integer getUnidadMedidaId() {
        return this.unidadMedidaId;
    }
    
    public void setUnidadMedidaId(Integer unidadMedidaId) {
        this.unidadMedidaId = unidadMedidaId;
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
    public boolean isUnidadMedidaRegistro() {
        return this.unidadMedidaRegistro;
    }
    
    public void setUnidadMedidaRegistro(boolean unidadMedidaRegistro) {
        this.unidadMedidaRegistro = unidadMedidaRegistro;
    }
    public Set getLogisticaRutas() {
        return this.logisticaRutas;
    }
    
    public void setLogisticaRutas(Set logisticaRutas) {
        this.logisticaRutas = logisticaRutas;
    }
    public Set getProductoActivos() {
        return this.productoActivos;
    }
    
    public void setProductoActivos(Set productoActivos) {
        this.productoActivos = productoActivos;
    }
    public Set getProductoInventarios() {
        return this.productoInventarios;
    }
    
    public void setProductoInventarios(Set productoInventarios) {
        this.productoInventarios = productoInventarios;
    }




}


