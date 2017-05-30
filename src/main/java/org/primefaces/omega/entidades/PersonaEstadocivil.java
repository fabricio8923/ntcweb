/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LuisFabricio
 */
@Entity
@Table(name = "persona_estadocivil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonaEstadocivil.findAll", query = "SELECT p FROM PersonaEstadocivil p")
    , @NamedQuery(name = "PersonaEstadocivil.findByEstadoCivilID", query = "SELECT p FROM PersonaEstadocivil p WHERE p.estadoCivilID = :estadoCivilID")
    , @NamedQuery(name = "PersonaEstadocivil.findByNombre", query = "SELECT p FROM PersonaEstadocivil p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "PersonaEstadocivil.findByDescripcion", query = "SELECT p FROM PersonaEstadocivil p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "PersonaEstadocivil.findByAbreviacion", query = "SELECT p FROM PersonaEstadocivil p WHERE p.abreviacion = :abreviacion")
    , @NamedQuery(name = "PersonaEstadocivil.findByFechaCreacion", query = "SELECT p FROM PersonaEstadocivil p WHERE p.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "PersonaEstadocivil.findByFechaModificacion", query = "SELECT p FROM PersonaEstadocivil p WHERE p.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "PersonaEstadocivil.findByEstadoRegistro", query = "SELECT p FROM PersonaEstadocivil p WHERE p.estadoRegistro = :estadoRegistro")})
public class PersonaEstadocivil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EstadoCivilID")
    private Integer estadoCivilID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "Descripcion")
    private String descripcion;
    @Size(max = 200)
    @Column(name = "Abreviacion")
    private String abreviacion;
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
    @Column(name = "EstadoRegistro")
    private boolean estadoRegistro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadoCivilID")
    private Collection<PersonaPersona> personaPersonaCollection;

    public PersonaEstadocivil() {
    }

    public PersonaEstadocivil(Integer estadoCivilID) {
        this.estadoCivilID = estadoCivilID;
    }

    public PersonaEstadocivil(Integer estadoCivilID, String nombre, Date fechaCreacion, boolean estadoRegistro) {
        this.estadoCivilID = estadoCivilID;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.estadoRegistro = estadoRegistro;
    }

    public Integer getEstadoCivilID() {
        return estadoCivilID;
    }

    public void setEstadoCivilID(Integer estadoCivilID) {
        this.estadoCivilID = estadoCivilID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
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

    public boolean getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(boolean estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }

    @XmlTransient
    public Collection<PersonaPersona> getPersonaPersonaCollection() {
        return personaPersonaCollection;
    }

    public void setPersonaPersonaCollection(Collection<PersonaPersona> personaPersonaCollection) {
        this.personaPersonaCollection = personaPersonaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estadoCivilID != null ? estadoCivilID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaEstadocivil)) {
            return false;
        }
        PersonaEstadocivil other = (PersonaEstadocivil) object;
        if ((this.estadoCivilID == null && other.estadoCivilID != null) || (this.estadoCivilID != null && !this.estadoCivilID.equals(other.estadoCivilID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.primefaces.omega.entidades.PersonaEstadocivil[ estadoCivilID=" + estadoCivilID + " ]";
    }
    
}
