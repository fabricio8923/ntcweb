package org.primefaces.omega.modelo;
// Generated 30-may-2017 1:23:42 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ProductoTiporelacion generated by hbm2java
 */
public class ProductoTiporelacion  implements java.io.Serializable {


     private Integer tipoRelacionId;
     private String nombre;
     private String descripcion;
     private String abreviacion;
     private Date fechaModificacion;
     private String usuarioModificacion;
     private boolean estadoRegistro;
     private Set productoRelacionproductos = new HashSet(0);

    public ProductoTiporelacion() {
    }

	
    public ProductoTiporelacion(String nombre, String descripcion, String abreviacion, Date fechaModificacion, String usuarioModificacion, boolean estadoRegistro) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.abreviacion = abreviacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioModificacion = usuarioModificacion;
        this.estadoRegistro = estadoRegistro;
    }
    public ProductoTiporelacion(String nombre, String descripcion, String abreviacion, Date fechaModificacion, String usuarioModificacion, boolean estadoRegistro, Set productoRelacionproductos) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.abreviacion = abreviacion;
       this.fechaModificacion = fechaModificacion;
       this.usuarioModificacion = usuarioModificacion;
       this.estadoRegistro = estadoRegistro;
       this.productoRelacionproductos = productoRelacionproductos;
    }
   
    public Integer getTipoRelacionId() {
        return this.tipoRelacionId;
    }
    
    public void setTipoRelacionId(Integer tipoRelacionId) {
        this.tipoRelacionId = tipoRelacionId;
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
    public boolean isEstadoRegistro() {
        return this.estadoRegistro;
    }
    
    public void setEstadoRegistro(boolean estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }
    public Set getProductoRelacionproductos() {
        return this.productoRelacionproductos;
    }
    
    public void setProductoRelacionproductos(Set productoRelacionproductos) {
        this.productoRelacionproductos = productoRelacionproductos;
    }




}


