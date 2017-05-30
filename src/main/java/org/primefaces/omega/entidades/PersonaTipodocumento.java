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
@Table(name = "persona_tipodocumento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonaTipodocumento.findAll", query = "SELECT p FROM PersonaTipodocumento p")
    , @NamedQuery(name = "PersonaTipodocumento.findByTipoDocumentoID", query = "SELECT p FROM PersonaTipodocumento p WHERE p.tipoDocumentoID = :tipoDocumentoID")
    , @NamedQuery(name = "PersonaTipodocumento.findByNombre", query = "SELECT p FROM PersonaTipodocumento p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "PersonaTipodocumento.findByDescripcion", query = "SELECT p FROM PersonaTipodocumento p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "PersonaTipodocumento.findByAbreviacion", query = "SELECT p FROM PersonaTipodocumento p WHERE p.abreviacion = :abreviacion")
    , @NamedQuery(name = "PersonaTipodocumento.findByFechaCreacion", query = "SELECT p FROM PersonaTipodocumento p WHERE p.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "PersonaTipodocumento.findByFechaModificacion", query = "SELECT p FROM PersonaTipodocumento p WHERE p.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "PersonaTipodocumento.findByEstadoRegistro", query = "SELECT p FROM PersonaTipodocumento p WHERE p.estadoRegistro = :estadoRegistro")})
public class PersonaTipodocumento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TipoDocumentoID")
    private Integer tipoDocumentoID;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoDocumentoID")
    private Collection<PersonaDocumentoentidad> personaDocumentoentidadCollection;

    public PersonaTipodocumento() {
    }

    public PersonaTipodocumento(Integer tipoDocumentoID) {
        this.tipoDocumentoID = tipoDocumentoID;
    }

    public PersonaTipodocumento(Integer tipoDocumentoID, String nombre, Date fechaCreacion, boolean estadoRegistro) {
        this.tipoDocumentoID = tipoDocumentoID;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.estadoRegistro = estadoRegistro;
    }

    public Integer getTipoDocumentoID() {
        return tipoDocumentoID;
    }

    public void setTipoDocumentoID(Integer tipoDocumentoID) {
        this.tipoDocumentoID = tipoDocumentoID;
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
    public Collection<PersonaDocumentoentidad> getPersonaDocumentoentidadCollection() {
        return personaDocumentoentidadCollection;
    }

    public void setPersonaDocumentoentidadCollection(Collection<PersonaDocumentoentidad> personaDocumentoentidadCollection) {
        this.personaDocumentoentidadCollection = personaDocumentoentidadCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoDocumentoID != null ? tipoDocumentoID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaTipodocumento)) {
            return false;
        }
        PersonaTipodocumento other = (PersonaTipodocumento) object;
        if ((this.tipoDocumentoID == null && other.tipoDocumentoID != null) || (this.tipoDocumentoID != null && !this.tipoDocumentoID.equals(other.tipoDocumentoID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.primefaces.omega.entidades.PersonaTipodocumento[ tipoDocumentoID=" + tipoDocumentoID + " ]";
    }
    
}
