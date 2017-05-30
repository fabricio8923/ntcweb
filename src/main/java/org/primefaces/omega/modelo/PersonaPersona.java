package org.primefaces.omega.modelo;
// Generated 30-may-2017 1:23:42 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * PersonaPersona generated by hbm2java
 */
public class PersonaPersona  implements java.io.Serializable {


     private int entidadNegocioId;
     private PersonaEntidadnegocio personaEntidadnegocio;
     private PersonaEstadocivil personaEstadocivil;
     private String nombre;
     private String primerApellido;
     private String segundoApellido;
     private String sufijo;
     private char sexo;
     private Date fechaCreacion;
     private Date fechaModificacion;
     private String usuarioModificacion;
     private boolean estadoRegistro;
     private Set organizacionTrabajadors = new HashSet(0);
     private Set organizacionOrdentrabajos = new HashSet(0);
     private Set organizacionOrdenservicios = new HashSet(0);

    public PersonaPersona() {
    }

	
    public PersonaPersona(PersonaEntidadnegocio personaEntidadnegocio, PersonaEstadocivil personaEstadocivil, String nombre, String primerApellido, String segundoApellido, String sufijo, char sexo, Date fechaCreacion, Date fechaModificacion, String usuarioModificacion, boolean estadoRegistro) {
        this.personaEntidadnegocio = personaEntidadnegocio;
        this.personaEstadocivil = personaEstadocivil;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.sufijo = sufijo;
        this.sexo = sexo;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioModificacion = usuarioModificacion;
        this.estadoRegistro = estadoRegistro;
    }
    public PersonaPersona(PersonaEntidadnegocio personaEntidadnegocio, PersonaEstadocivil personaEstadocivil, String nombre, String primerApellido, String segundoApellido, String sufijo, char sexo, Date fechaCreacion, Date fechaModificacion, String usuarioModificacion, boolean estadoRegistro, Set organizacionTrabajadors, Set organizacionOrdentrabajos, Set organizacionOrdenservicios) {
       this.personaEntidadnegocio = personaEntidadnegocio;
       this.personaEstadocivil = personaEstadocivil;
       this.nombre = nombre;
       this.primerApellido = primerApellido;
       this.segundoApellido = segundoApellido;
       this.sufijo = sufijo;
       this.sexo = sexo;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
       this.usuarioModificacion = usuarioModificacion;
       this.estadoRegistro = estadoRegistro;
       this.organizacionTrabajadors = organizacionTrabajadors;
       this.organizacionOrdentrabajos = organizacionOrdentrabajos;
       this.organizacionOrdenservicios = organizacionOrdenservicios;
    }
   
    public int getEntidadNegocioId() {
        return this.entidadNegocioId;
    }
    
    public void setEntidadNegocioId(int entidadNegocioId) {
        this.entidadNegocioId = entidadNegocioId;
    }
    public PersonaEntidadnegocio getPersonaEntidadnegocio() {
        return this.personaEntidadnegocio;
    }
    
    public void setPersonaEntidadnegocio(PersonaEntidadnegocio personaEntidadnegocio) {
        this.personaEntidadnegocio = personaEntidadnegocio;
    }
    public PersonaEstadocivil getPersonaEstadocivil() {
        return this.personaEstadocivil;
    }
    
    public void setPersonaEstadocivil(PersonaEstadocivil personaEstadocivil) {
        this.personaEstadocivil = personaEstadocivil;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPrimerApellido() {
        return this.primerApellido;
    }
    
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public String getSegundoApellido() {
        return this.segundoApellido;
    }
    
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    public String getSufijo() {
        return this.sufijo;
    }
    
    public void setSufijo(String sufijo) {
        this.sufijo = sufijo;
    }
    public char getSexo() {
        return this.sexo;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
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
    public Set getOrganizacionTrabajadors() {
        return this.organizacionTrabajadors;
    }
    
    public void setOrganizacionTrabajadors(Set organizacionTrabajadors) {
        this.organizacionTrabajadors = organizacionTrabajadors;
    }
    public Set getOrganizacionOrdentrabajos() {
        return this.organizacionOrdentrabajos;
    }
    
    public void setOrganizacionOrdentrabajos(Set organizacionOrdentrabajos) {
        this.organizacionOrdentrabajos = organizacionOrdentrabajos;
    }
    public Set getOrganizacionOrdenservicios() {
        return this.organizacionOrdenservicios;
    }
    
    public void setOrganizacionOrdenservicios(Set organizacionOrdenservicios) {
        this.organizacionOrdenservicios = organizacionOrdenservicios;
    }




}


