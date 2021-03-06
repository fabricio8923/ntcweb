package org.primefaces.omega.modelo;
// Generated 30-may-2017 1:23:42 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * OrganizacionTrabajador generated by hbm2java
 */
public class OrganizacionTrabajador  implements java.io.Serializable {


     private int trabajadorId;
     private OrganizacionOrganizacion organizacionOrganizacion;
     private PersonaPersona personaPersona;
     private String codigo;
     private String titulo;
     private short horasTrabajo;
     private short horasVacacion;
     private Date fechaIngreso;
     private Date fechaFin;
     private Date fechaCreacion;
     private Date fechaModificacion;
     private String usuarioModificacion;
     private boolean estadoRegistro;
     private Set organizacionOrdenservicios = new HashSet(0);
     private Set productoResponsableactivos = new HashSet(0);
     private Set productoActivos = new HashSet(0);
     private Set productoInventarios = new HashSet(0);
     private Set organizacionDetordenservicios = new HashSet(0);
     private Set organizacionDetordentrabajos = new HashSet(0);
     private Set organizacionOrdentrabajos = new HashSet(0);

    public OrganizacionTrabajador() {
    }

	
    public OrganizacionTrabajador(int trabajadorId, OrganizacionOrganizacion organizacionOrganizacion, PersonaPersona personaPersona, String codigo, String titulo, short horasTrabajo, short horasVacacion, Date fechaIngreso, Date fechaFin, Date fechaCreacion, Date fechaModificacion, String usuarioModificacion, boolean estadoRegistro) {
        this.trabajadorId = trabajadorId;
        this.organizacionOrganizacion = organizacionOrganizacion;
        this.personaPersona = personaPersona;
        this.codigo = codigo;
        this.titulo = titulo;
        this.horasTrabajo = horasTrabajo;
        this.horasVacacion = horasVacacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaFin = fechaFin;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioModificacion = usuarioModificacion;
        this.estadoRegistro = estadoRegistro;
    }
    public OrganizacionTrabajador(int trabajadorId, OrganizacionOrganizacion organizacionOrganizacion, PersonaPersona personaPersona, String codigo, String titulo, short horasTrabajo, short horasVacacion, Date fechaIngreso, Date fechaFin, Date fechaCreacion, Date fechaModificacion, String usuarioModificacion, boolean estadoRegistro, Set organizacionOrdenservicios, Set productoResponsableactivos, Set productoActivos, Set productoInventarios, Set organizacionDetordenservicios, Set organizacionDetordentrabajos, Set organizacionOrdentrabajos) {
       this.trabajadorId = trabajadorId;
       this.organizacionOrganizacion = organizacionOrganizacion;
       this.personaPersona = personaPersona;
       this.codigo = codigo;
       this.titulo = titulo;
       this.horasTrabajo = horasTrabajo;
       this.horasVacacion = horasVacacion;
       this.fechaIngreso = fechaIngreso;
       this.fechaFin = fechaFin;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
       this.usuarioModificacion = usuarioModificacion;
       this.estadoRegistro = estadoRegistro;
       this.organizacionOrdenservicios = organizacionOrdenservicios;
       this.productoResponsableactivos = productoResponsableactivos;
       this.productoActivos = productoActivos;
       this.productoInventarios = productoInventarios;
       this.organizacionDetordenservicios = organizacionDetordenservicios;
       this.organizacionDetordentrabajos = organizacionDetordentrabajos;
       this.organizacionOrdentrabajos = organizacionOrdentrabajos;
    }
   
    public int getTrabajadorId() {
        return this.trabajadorId;
    }
    
    public void setTrabajadorId(int trabajadorId) {
        this.trabajadorId = trabajadorId;
    }
    public OrganizacionOrganizacion getOrganizacionOrganizacion() {
        return this.organizacionOrganizacion;
    }
    
    public void setOrganizacionOrganizacion(OrganizacionOrganizacion organizacionOrganizacion) {
        this.organizacionOrganizacion = organizacionOrganizacion;
    }
    public PersonaPersona getPersonaPersona() {
        return this.personaPersona;
    }
    
    public void setPersonaPersona(PersonaPersona personaPersona) {
        this.personaPersona = personaPersona;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public short getHorasTrabajo() {
        return this.horasTrabajo;
    }
    
    public void setHorasTrabajo(short horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }
    public short getHorasVacacion() {
        return this.horasVacacion;
    }
    
    public void setHorasVacacion(short horasVacacion) {
        this.horasVacacion = horasVacacion;
    }
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
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
    public Set getOrganizacionOrdenservicios() {
        return this.organizacionOrdenservicios;
    }
    
    public void setOrganizacionOrdenservicios(Set organizacionOrdenservicios) {
        this.organizacionOrdenservicios = organizacionOrdenservicios;
    }
    public Set getProductoResponsableactivos() {
        return this.productoResponsableactivos;
    }
    
    public void setProductoResponsableactivos(Set productoResponsableactivos) {
        this.productoResponsableactivos = productoResponsableactivos;
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
    public Set getOrganizacionOrdentrabajos() {
        return this.organizacionOrdentrabajos;
    }
    
    public void setOrganizacionOrdentrabajos(Set organizacionOrdentrabajos) {
        this.organizacionOrdentrabajos = organizacionOrdentrabajos;
    }




}


