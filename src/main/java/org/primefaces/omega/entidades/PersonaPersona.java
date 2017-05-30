/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LuisFabricio
 */
@Entity
@Table(name = "persona_persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonaPersona.findAll", query = "SELECT p FROM PersonaPersona p")
    , @NamedQuery(name = "PersonaPersona.findByEntidadNegocioID", query = "SELECT p FROM PersonaPersona p WHERE p.entidadNegocioID = :entidadNegocioID")
    , @NamedQuery(name = "PersonaPersona.findByNombre", query = "SELECT p FROM PersonaPersona p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "PersonaPersona.findByPrimerApellido", query = "SELECT p FROM PersonaPersona p WHERE p.primerApellido = :primerApellido")
    , @NamedQuery(name = "PersonaPersona.findBySegundoApellido", query = "SELECT p FROM PersonaPersona p WHERE p.segundoApellido = :segundoApellido")
    , @NamedQuery(name = "PersonaPersona.findBySufijo", query = "SELECT p FROM PersonaPersona p WHERE p.sufijo = :sufijo")
    , @NamedQuery(name = "PersonaPersona.findBySexo", query = "SELECT p FROM PersonaPersona p WHERE p.sexo = :sexo")
    , @NamedQuery(name = "PersonaPersona.findByFechaCreacion", query = "SELECT p FROM PersonaPersona p WHERE p.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "PersonaPersona.findByFechaModificacion", query = "SELECT p FROM PersonaPersona p WHERE p.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "PersonaPersona.findByUsuarioModificacion", query = "SELECT p FROM PersonaPersona p WHERE p.usuarioModificacion = :usuarioModificacion")
    , @NamedQuery(name = "PersonaPersona.findByEstadoRegistro", query = "SELECT p FROM PersonaPersona p WHERE p.estadoRegistro = :estadoRegistro")})
public class PersonaPersona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EntidadNegocioID")
    private Integer entidadNegocioID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PrimerApellido")
    private String primerApellido;
    @Size(max = 50)
    @Column(name = "SegundoApellido")
    private String segundoApellido;
    @Size(max = 50)
    @Column(name = "Sufijo")
    private String sufijo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Sexo")
    private Character sexo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "FechaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "UsuarioModificacion")
    private String usuarioModificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstadoRegistro")
    private boolean estadoRegistro;
    @JoinColumn(name = "EntidadNegocioID", referencedColumnName = "EntidadNegocioID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private PersonaEntidadnegocio personaEntidadnegocio;
    @JoinColumn(name = "EstadoCivilID", referencedColumnName = "EstadoCivilID")
    @ManyToOne(optional = false)
    private PersonaEstadocivil estadoCivilID;

    public PersonaPersona() {
    }

    public PersonaPersona(Integer entidadNegocioID) {
        this.entidadNegocioID = entidadNegocioID;
    }

    public PersonaPersona(Integer entidadNegocioID, String nombre, String primerApellido, Character sexo, Date fechaCreacion, String usuarioModificacion, boolean estadoRegistro) {
        this.entidadNegocioID = entidadNegocioID;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.sexo = sexo;
        this.fechaCreacion = fechaCreacion;
        this.usuarioModificacion = usuarioModificacion;
        this.estadoRegistro = estadoRegistro;
    }

    public Integer getEntidadNegocioID() {
        return entidadNegocioID;
    }

    public void setEntidadNegocioID(Integer entidadNegocioID) {
        this.entidadNegocioID = entidadNegocioID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSufijo() {
        return sufijo;
    }

    public void setSufijo(String sufijo) {
        this.sufijo = sufijo;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public boolean getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(boolean estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }

    public PersonaEntidadnegocio getPersonaEntidadnegocio() {
        return personaEntidadnegocio;
    }

    public void setPersonaEntidadnegocio(PersonaEntidadnegocio personaEntidadnegocio) {
        this.personaEntidadnegocio = personaEntidadnegocio;
    }

    public PersonaEstadocivil getEstadoCivilID() {
        return estadoCivilID;
    }

    public void setEstadoCivilID(PersonaEstadocivil estadoCivilID) {
        this.estadoCivilID = estadoCivilID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entidadNegocioID != null ? entidadNegocioID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaPersona)) {
            return false;
        }
        PersonaPersona other = (PersonaPersona) object;
        if ((this.entidadNegocioID == null && other.entidadNegocioID != null) || (this.entidadNegocioID != null && !this.entidadNegocioID.equals(other.entidadNegocioID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.primefaces.omega.entidades.PersonaPersona[ entidadNegocioID=" + entidadNegocioID + " ]";
    }
    
}
