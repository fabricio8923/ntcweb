package org.primefaces.omega.modelo;
// Generated 30-may-2017 1:23:42 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * OrganizacionDetordentrabajo generated by hbm2java
 */
public class OrganizacionDetordentrabajo  implements java.io.Serializable {


     private Integer detOrdenTrabajoId;
     private GeneralEstado generalEstado;
     private GeneralMotivoactividad generalMotivoactividad;
     private OrganizacionOrdentrabajo organizacionOrdentrabajo;
     private OrganizacionServicio organizacionServicio;
     private OrganizacionTrabajador organizacionTrabajador;
     private ProductoInventario productoInventario;
     private String descripcion;
     private Date fechaEstimada;
     private Date fechaInicio;
     private Date fechaFin;
     private Date validoDesde;
     private Date validoHasta;
     private String observacion;
     private String ruta;
     private Date fechaCreacion;
     private Date fechaModificacion;
     private String usuarioModificacion;
     private boolean estadoRegistro;

    public OrganizacionDetordentrabajo() {
    }

    public OrganizacionDetordentrabajo(GeneralEstado generalEstado, GeneralMotivoactividad generalMotivoactividad, OrganizacionOrdentrabajo organizacionOrdentrabajo, OrganizacionServicio organizacionServicio, OrganizacionTrabajador organizacionTrabajador, ProductoInventario productoInventario, String descripcion, Date fechaEstimada, Date fechaInicio, Date fechaFin, Date validoDesde, Date validoHasta, String observacion, String ruta, Date fechaCreacion, Date fechaModificacion, String usuarioModificacion, boolean estadoRegistro) {
       this.generalEstado = generalEstado;
       this.generalMotivoactividad = generalMotivoactividad;
       this.organizacionOrdentrabajo = organizacionOrdentrabajo;
       this.organizacionServicio = organizacionServicio;
       this.organizacionTrabajador = organizacionTrabajador;
       this.productoInventario = productoInventario;
       this.descripcion = descripcion;
       this.fechaEstimada = fechaEstimada;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
       this.validoDesde = validoDesde;
       this.validoHasta = validoHasta;
       this.observacion = observacion;
       this.ruta = ruta;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
       this.usuarioModificacion = usuarioModificacion;
       this.estadoRegistro = estadoRegistro;
    }
   
    public Integer getDetOrdenTrabajoId() {
        return this.detOrdenTrabajoId;
    }
    
    public void setDetOrdenTrabajoId(Integer detOrdenTrabajoId) {
        this.detOrdenTrabajoId = detOrdenTrabajoId;
    }
    public GeneralEstado getGeneralEstado() {
        return this.generalEstado;
    }
    
    public void setGeneralEstado(GeneralEstado generalEstado) {
        this.generalEstado = generalEstado;
    }
    public GeneralMotivoactividad getGeneralMotivoactividad() {
        return this.generalMotivoactividad;
    }
    
    public void setGeneralMotivoactividad(GeneralMotivoactividad generalMotivoactividad) {
        this.generalMotivoactividad = generalMotivoactividad;
    }
    public OrganizacionOrdentrabajo getOrganizacionOrdentrabajo() {
        return this.organizacionOrdentrabajo;
    }
    
    public void setOrganizacionOrdentrabajo(OrganizacionOrdentrabajo organizacionOrdentrabajo) {
        this.organizacionOrdentrabajo = organizacionOrdentrabajo;
    }
    public OrganizacionServicio getOrganizacionServicio() {
        return this.organizacionServicio;
    }
    
    public void setOrganizacionServicio(OrganizacionServicio organizacionServicio) {
        this.organizacionServicio = organizacionServicio;
    }
    public OrganizacionTrabajador getOrganizacionTrabajador() {
        return this.organizacionTrabajador;
    }
    
    public void setOrganizacionTrabajador(OrganizacionTrabajador organizacionTrabajador) {
        this.organizacionTrabajador = organizacionTrabajador;
    }
    public ProductoInventario getProductoInventario() {
        return this.productoInventario;
    }
    
    public void setProductoInventario(ProductoInventario productoInventario) {
        this.productoInventario = productoInventario;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaEstimada() {
        return this.fechaEstimada;
    }
    
    public void setFechaEstimada(Date fechaEstimada) {
        this.fechaEstimada = fechaEstimada;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public Date getValidoDesde() {
        return this.validoDesde;
    }
    
    public void setValidoDesde(Date validoDesde) {
        this.validoDesde = validoDesde;
    }
    public Date getValidoHasta() {
        return this.validoHasta;
    }
    
    public void setValidoHasta(Date validoHasta) {
        this.validoHasta = validoHasta;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public String getRuta() {
        return this.ruta;
    }
    
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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




}


