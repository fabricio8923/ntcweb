package org.primefaces.omega.modelo;
// Generated 30-may-2017 1:23:42 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ProductoAtributo generated by hbm2java
 */
public class ProductoAtributo  implements java.io.Serializable {


     private Integer atributoId;
     private ProductoTipoatributo productoTipoatributo;
     private String nombre;
     private String descripcion;
     private String abreviacion;
     private Date fechaModificacion;
     private String usuarioModificacion;
     private boolean estadoRegistro;
     private Set productoProductoatributos = new HashSet(0);

    public ProductoAtributo() {
    }

	
    public ProductoAtributo(ProductoTipoatributo productoTipoatributo, String nombre, String descripcion, String abreviacion, Date fechaModificacion, String usuarioModificacion, boolean estadoRegistro) {
        this.productoTipoatributo = productoTipoatributo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.abreviacion = abreviacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioModificacion = usuarioModificacion;
        this.estadoRegistro = estadoRegistro;
    }
    public ProductoAtributo(ProductoTipoatributo productoTipoatributo, String nombre, String descripcion, String abreviacion, Date fechaModificacion, String usuarioModificacion, boolean estadoRegistro, Set productoProductoatributos) {
       this.productoTipoatributo = productoTipoatributo;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.abreviacion = abreviacion;
       this.fechaModificacion = fechaModificacion;
       this.usuarioModificacion = usuarioModificacion;
       this.estadoRegistro = estadoRegistro;
       this.productoProductoatributos = productoProductoatributos;
    }
   
    public Integer getAtributoId() {
        return this.atributoId;
    }
    
    public void setAtributoId(Integer atributoId) {
        this.atributoId = atributoId;
    }
    public ProductoTipoatributo getProductoTipoatributo() {
        return this.productoTipoatributo;
    }
    
    public void setProductoTipoatributo(ProductoTipoatributo productoTipoatributo) {
        this.productoTipoatributo = productoTipoatributo;
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
    public Set getProductoProductoatributos() {
        return this.productoProductoatributos;
    }
    
    public void setProductoProductoatributos(Set productoProductoatributos) {
        this.productoProductoatributos = productoProductoatributos;
    }




}


