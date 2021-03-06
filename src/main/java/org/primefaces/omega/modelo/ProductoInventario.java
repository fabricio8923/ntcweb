package org.primefaces.omega.modelo;
// Generated 30-may-2017 1:23:42 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ProductoInventario generated by hbm2java
 */
public class ProductoInventario  implements java.io.Serializable {


     private Integer inventarioId;
     private GeneralEstado generalEstado;
     private GeneralUnidadmedida generalUnidadmedida;
     private LogisticaLocacion logisticaLocacion;
     private OrganizacionTrabajador organizacionTrabajador;
     private ProductoAplicacion productoAplicacion;
     private ProductoProducto productoProducto;
     private String nombre;
     private String descripcion;
     private String abreviacion;
     private String numeroSerie;
     private String codigoBarras;
     private long cantidad;
     private long precioUnitario;
     private long costoUnidad;
     private Date fechaModificacion;
     private String usuarioModificacion;
     private boolean estadoRegistro;
     private Set organizacionDetordenservicios = new HashSet(0);
     private Set organizacionDetordentrabajos = new HashSet(0);

    public ProductoInventario() {
    }

	
    public ProductoInventario(GeneralEstado generalEstado, GeneralUnidadmedida generalUnidadmedida, LogisticaLocacion logisticaLocacion, OrganizacionTrabajador organizacionTrabajador, ProductoAplicacion productoAplicacion, ProductoProducto productoProducto, String nombre, String descripcion, String abreviacion, String numeroSerie, String codigoBarras, long cantidad, long precioUnitario, long costoUnidad, Date fechaModificacion, String usuarioModificacion, boolean estadoRegistro) {
        this.generalEstado = generalEstado;
        this.generalUnidadmedida = generalUnidadmedida;
        this.logisticaLocacion = logisticaLocacion;
        this.organizacionTrabajador = organizacionTrabajador;
        this.productoAplicacion = productoAplicacion;
        this.productoProducto = productoProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.abreviacion = abreviacion;
        this.numeroSerie = numeroSerie;
        this.codigoBarras = codigoBarras;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.costoUnidad = costoUnidad;
        this.fechaModificacion = fechaModificacion;
        this.usuarioModificacion = usuarioModificacion;
        this.estadoRegistro = estadoRegistro;
    }
    public ProductoInventario(GeneralEstado generalEstado, GeneralUnidadmedida generalUnidadmedida, LogisticaLocacion logisticaLocacion, OrganizacionTrabajador organizacionTrabajador, ProductoAplicacion productoAplicacion, ProductoProducto productoProducto, String nombre, String descripcion, String abreviacion, String numeroSerie, String codigoBarras, long cantidad, long precioUnitario, long costoUnidad, Date fechaModificacion, String usuarioModificacion, boolean estadoRegistro, Set organizacionDetordenservicios, Set organizacionDetordentrabajos) {
       this.generalEstado = generalEstado;
       this.generalUnidadmedida = generalUnidadmedida;
       this.logisticaLocacion = logisticaLocacion;
       this.organizacionTrabajador = organizacionTrabajador;
       this.productoAplicacion = productoAplicacion;
       this.productoProducto = productoProducto;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.abreviacion = abreviacion;
       this.numeroSerie = numeroSerie;
       this.codigoBarras = codigoBarras;
       this.cantidad = cantidad;
       this.precioUnitario = precioUnitario;
       this.costoUnidad = costoUnidad;
       this.fechaModificacion = fechaModificacion;
       this.usuarioModificacion = usuarioModificacion;
       this.estadoRegistro = estadoRegistro;
       this.organizacionDetordenservicios = organizacionDetordenservicios;
       this.organizacionDetordentrabajos = organizacionDetordentrabajos;
    }
   
    public Integer getInventarioId() {
        return this.inventarioId;
    }
    
    public void setInventarioId(Integer inventarioId) {
        this.inventarioId = inventarioId;
    }
    public GeneralEstado getGeneralEstado() {
        return this.generalEstado;
    }
    
    public void setGeneralEstado(GeneralEstado generalEstado) {
        this.generalEstado = generalEstado;
    }
    public GeneralUnidadmedida getGeneralUnidadmedida() {
        return this.generalUnidadmedida;
    }
    
    public void setGeneralUnidadmedida(GeneralUnidadmedida generalUnidadmedida) {
        this.generalUnidadmedida = generalUnidadmedida;
    }
    public LogisticaLocacion getLogisticaLocacion() {
        return this.logisticaLocacion;
    }
    
    public void setLogisticaLocacion(LogisticaLocacion logisticaLocacion) {
        this.logisticaLocacion = logisticaLocacion;
    }
    public OrganizacionTrabajador getOrganizacionTrabajador() {
        return this.organizacionTrabajador;
    }
    
    public void setOrganizacionTrabajador(OrganizacionTrabajador organizacionTrabajador) {
        this.organizacionTrabajador = organizacionTrabajador;
    }
    public ProductoAplicacion getProductoAplicacion() {
        return this.productoAplicacion;
    }
    
    public void setProductoAplicacion(ProductoAplicacion productoAplicacion) {
        this.productoAplicacion = productoAplicacion;
    }
    public ProductoProducto getProductoProducto() {
        return this.productoProducto;
    }
    
    public void setProductoProducto(ProductoProducto productoProducto) {
        this.productoProducto = productoProducto;
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
    public String getNumeroSerie() {
        return this.numeroSerie;
    }
    
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public String getCodigoBarras() {
        return this.codigoBarras;
    }
    
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    public long getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }
    public long getPrecioUnitario() {
        return this.precioUnitario;
    }
    
    public void setPrecioUnitario(long precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public long getCostoUnidad() {
        return this.costoUnidad;
    }
    
    public void setCostoUnidad(long costoUnidad) {
        this.costoUnidad = costoUnidad;
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
    public Set getOrganizacionDetordenservicios() {
        return this.organizacionDetordenservicios;
    }
    
    public void setOrganizacionDetordenservicios(Set organizacionDetordenservicios) {
        this.organizacionDetordenservicios = organizacionDetordenservicios;
    }
    public Set getOrganizacionDetordentrabajos() {
        return this.organizacionDetordentrabajos;
    }
    
    public void setOrganizacionDetordentrabajos(Set organizacionDetordentrabajos) {
        this.organizacionDetordentrabajos = organizacionDetordentrabajos;
    }




}


