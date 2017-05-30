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
@Table(name = "persona_tipoentidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonaTipoentidad.findAll", query = "SELECT p FROM PersonaTipoentidad p")
    , @NamedQuery(name = "PersonaTipoentidad.findByTipoEntidadID", query = "SELECT p FROM PersonaTipoentidad p WHERE p.tipoEntidadID = :tipoEntidadID")
    , @NamedQuery(name = "PersonaTipoentidad.findByNombre", query = "SELECT p FROM PersonaTipoentidad p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "PersonaTipoentidad.findByDescripcion", query = "SELECT p FROM PersonaTipoentidad p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "PersonaTipoentidad.findByAbreviacion", query = "SELECT p FROM PersonaTipoentidad p WHERE p.abreviacion = :abreviacion")
    , @NamedQuery(name = "PersonaTipoentidad.findByFechaCreacion", query = "SELECT p FROM PersonaTipoentidad p WHERE p.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "PersonaTipoentidad.findByFechaModificacion", query = "SELECT p FROM PersonaTipoentidad p WHERE p.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "PersonaTipoentidad.findByEstadoRegistro", query = "SELECT p FROM PersonaTipoentidad p WHERE p.estadoRegistro = :estadoRegistro")})
public class PersonaTipoentidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TipoEntidadID")
    private Integer tipoEntidadID;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoEntidadID")
    private Collection<PersonaEntidadnegocio> personaEntidadnegocioCollection;

    public PersonaTipoentidad() {
    }

    public PersonaTipoentidad(Integer tipoEntidadID) {
        this.tipoEntidadID = tipoEntidadID;
    }

    public PersonaTipoentidad(Integer tipoEntidadID, String nombre, Date fechaCreacion, boolean estadoRegistro) {
        this.tipoEntidadID = tipoEntidadID;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.estadoRegistro = estadoRegistro;
    }

    public Integer getTipoEntidadID() {
        return tipoEntidadID;
    }

    public void setTipoEntidadID(Integer tipoEntidadID) {
        this.tipoEntidadID = tipoEntidadID;
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
    public Collection<PersonaEntidadnegocio> getPersonaEntidadnegocioCollection() {
        return personaEntidadnegocioCollection;
    }

    public void setPersonaEntidadnegocioCollection(Collection<PersonaEntidadnegocio> personaEntidadnegocioCollection) {
        this.personaEntidadnegocioCollection = personaEntidadnegocioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoEntidadID != null ? tipoEntidadID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaTipoentidad)) {
            return false;
        }
        PersonaTipoentidad other = (PersonaTipoentidad) object;
        if ((this.tipoEntidadID == null && other.tipoEntidadID != null) || (this.tipoEntidadID != null && !this.tipoEntidadID.equals(other.tipoEntidadID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.primefaces.omega.entidades.PersonaTipoentidad[ tipoEntidadID=" + tipoEntidadID + " ]";
    }
    
}
