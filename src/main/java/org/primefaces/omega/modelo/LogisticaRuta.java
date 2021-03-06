package org.primefaces.omega.modelo;
// Generated 30-may-2017 1:23:42 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * LogisticaRuta generated by hbm2java
 */
public class LogisticaRuta  implements java.io.Serializable {


     private Integer rutaId;
     private GeneralUnidadmedida generalUnidadmedida;
     private LogisticaLocacion logisticaLocacionByLocacionDestinoId;
     private LogisticaLocacion logisticaLocacionByLocacionOrigenId;
     private OrganizacionOrganizacion organizacionOrganizacion;
     private String nombre;
     private String descripcion;
     private long distancia;
     private Date fechaCreacion;
     private Date fechaModificacion;
     private boolean estadoRegistro;

    public LogisticaRuta() {
    }

	
    public LogisticaRuta(GeneralUnidadmedida generalUnidadmedida, LogisticaLocacion logisticaLocacionByLocacionDestinoId, LogisticaLocacion logisticaLocacionByLocacionOrigenId, OrganizacionOrganizacion organizacionOrganizacion, String nombre, String descripcion, long distancia, Date fechaCreacion, boolean estadoRegistro) {
        this.generalUnidadmedida = generalUnidadmedida;
        this.logisticaLocacionByLocacionDestinoId = logisticaLocacionByLocacionDestinoId;
        this.logisticaLocacionByLocacionOrigenId = logisticaLocacionByLocacionOrigenId;
        this.organizacionOrganizacion = organizacionOrganizacion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.distancia = distancia;
        this.fechaCreacion = fechaCreacion;
        this.estadoRegistro = estadoRegistro;
    }
    public LogisticaRuta(GeneralUnidadmedida generalUnidadmedida, LogisticaLocacion logisticaLocacionByLocacionDestinoId, LogisticaLocacion logisticaLocacionByLocacionOrigenId, OrganizacionOrganizacion organizacionOrganizacion, String nombre, String descripcion, long distancia, Date fechaCreacion, Date fechaModificacion, boolean estadoRegistro) {
       this.generalUnidadmedida = generalUnidadmedida;
       this.logisticaLocacionByLocacionDestinoId = logisticaLocacionByLocacionDestinoId;
       this.logisticaLocacionByLocacionOrigenId = logisticaLocacionByLocacionOrigenId;
       this.organizacionOrganizacion = organizacionOrganizacion;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.distancia = distancia;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
       this.estadoRegistro = estadoRegistro;
    }
   
    public Integer getRutaId() {
        return this.rutaId;
    }
    
    public void setRutaId(Integer rutaId) {
        this.rutaId = rutaId;
    }
    public GeneralUnidadmedida getGeneralUnidadmedida() {
        return this.generalUnidadmedida;
    }
    
    public void setGeneralUnidadmedida(GeneralUnidadmedida generalUnidadmedida) {
        this.generalUnidadmedida = generalUnidadmedida;
    }
    public LogisticaLocacion getLogisticaLocacionByLocacionDestinoId() {
        return this.logisticaLocacionByLocacionDestinoId;
    }
    
    public void setLogisticaLocacionByLocacionDestinoId(LogisticaLocacion logisticaLocacionByLocacionDestinoId) {
        this.logisticaLocacionByLocacionDestinoId = logisticaLocacionByLocacionDestinoId;
    }
    public LogisticaLocacion getLogisticaLocacionByLocacionOrigenId() {
        return this.logisticaLocacionByLocacionOrigenId;
    }
    
    public void setLogisticaLocacionByLocacionOrigenId(LogisticaLocacion logisticaLocacionByLocacionOrigenId) {
        this.logisticaLocacionByLocacionOrigenId = logisticaLocacionByLocacionOrigenId;
    }
    public OrganizacionOrganizacion getOrganizacionOrganizacion() {
        return this.organizacionOrganizacion;
    }
    
    public void setOrganizacionOrganizacion(OrganizacionOrganizacion organizacionOrganizacion) {
        this.organizacionOrganizacion = organizacionOrganizacion;
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
    public long getDistancia() {
        return this.distancia;
    }
    
    public void setDistancia(long distancia) {
        this.distancia = distancia;
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
    public boolean isEstadoRegistro() {
        return this.estadoRegistro;
    }
    
    public void setEstadoRegistro(boolean estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }




}


