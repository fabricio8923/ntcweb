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
@Table(name = "logistica_tipodireccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LogisticaTipodireccion.findAll", query = "SELECT l FROM LogisticaTipodireccion l")
    , @NamedQuery(name = "LogisticaTipodireccion.findByTipoDireccionID", query = "SELECT l FROM LogisticaTipodireccion l WHERE l.tipoDireccionID = :tipoDireccionID")
    , @NamedQuery(name = "LogisticaTipodireccion.findByNombre", query = "SELECT l FROM LogisticaTipodireccion l WHERE l.nombre = :nombre")
    , @NamedQuery(name = "LogisticaTipodireccion.findByDescripcion", query = "SELECT l FROM LogisticaTipodireccion l WHERE l.descripcion = :descripcion")
    , @NamedQuery(name = "LogisticaTipodireccion.findByAbreviacion", query = "SELECT l FROM LogisticaTipodireccion l WHERE l.abreviacion = :abreviacion")
    , @NamedQuery(name = "LogisticaTipodireccion.findByFechaCreacion", query = "SELECT l FROM LogisticaTipodireccion l WHERE l.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "LogisticaTipodireccion.findByFechaModificacion", query = "SELECT l FROM LogisticaTipodireccion l WHERE l.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "LogisticaTipodireccion.findByEstadoRegistro", query = "SELECT l FROM LogisticaTipodireccion l WHERE l.estadoRegistro = :estadoRegistro")})
public class LogisticaTipodireccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TipoDireccionID")
    private Integer tipoDireccionID;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoDireccionID")
    private Collection<PersonaDireccionentidad> personaDireccionentidadCollection;

    public LogisticaTipodireccion() {
    }

    public LogisticaTipodireccion(Integer tipoDireccionID) {
        this.tipoDireccionID = tipoDireccionID;
    }

    public LogisticaTipodireccion(Integer tipoDireccionID, String nombre, Date fechaCreacion, boolean estadoRegistro) {
        this.tipoDireccionID = tipoDireccionID;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.estadoRegistro = estadoRegistro;
    }

    public Integer getTipoDireccionID() {
        return tipoDireccionID;
    }

    public void setTipoDireccionID(Integer tipoDireccionID) {
        this.tipoDireccionID = tipoDireccionID;
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
    public Collection<PersonaDireccionentidad> getPersonaDireccionentidadCollection() {
        return personaDireccionentidadCollection;
    }

    public void setPersonaDireccionentidadCollection(Collection<PersonaDireccionentidad> personaDireccionentidadCollection) {
        this.personaDireccionentidadCollection = personaDireccionentidadCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoDireccionID != null ? tipoDireccionID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogisticaTipodireccion)) {
            return false;
        }
        LogisticaTipodireccion other = (LogisticaTipodireccion) object;
        if ((this.tipoDireccionID == null && other.tipoDireccionID != null) || (this.tipoDireccionID != null && !this.tipoDireccionID.equals(other.tipoDireccionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.primefaces.omega.entidades.LogisticaTipodireccion[ tipoDireccionID=" + tipoDireccionID + " ]";
    }
    
}
