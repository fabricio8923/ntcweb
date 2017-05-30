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
@Table(name = "logistica_usodireccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LogisticaUsodireccion.findAll", query = "SELECT l FROM LogisticaUsodireccion l")
    , @NamedQuery(name = "LogisticaUsodireccion.findByUsoDireccionID", query = "SELECT l FROM LogisticaUsodireccion l WHERE l.usoDireccionID = :usoDireccionID")
    , @NamedQuery(name = "LogisticaUsodireccion.findByNombre", query = "SELECT l FROM LogisticaUsodireccion l WHERE l.nombre = :nombre")
    , @NamedQuery(name = "LogisticaUsodireccion.findByDescripcion", query = "SELECT l FROM LogisticaUsodireccion l WHERE l.descripcion = :descripcion")
    , @NamedQuery(name = "LogisticaUsodireccion.findByAbreviacion", query = "SELECT l FROM LogisticaUsodireccion l WHERE l.abreviacion = :abreviacion")
    , @NamedQuery(name = "LogisticaUsodireccion.findByFechaCreacion", query = "SELECT l FROM LogisticaUsodireccion l WHERE l.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "LogisticaUsodireccion.findByFechaModificacion", query = "SELECT l FROM LogisticaUsodireccion l WHERE l.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "LogisticaUsodireccion.findByEstadoRegistro", query = "SELECT l FROM LogisticaUsodireccion l WHERE l.estadoRegistro = :estadoRegistro")})
public class LogisticaUsodireccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UsoDireccionID")
    private Integer usoDireccionID;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usoDireccionID")
    private Collection<PersonaDireccionentidad> personaDireccionentidadCollection;

    public LogisticaUsodireccion() {
    }

    public LogisticaUsodireccion(Integer usoDireccionID) {
        this.usoDireccionID = usoDireccionID;
    }

    public LogisticaUsodireccion(Integer usoDireccionID, String nombre, Date fechaCreacion, boolean estadoRegistro) {
        this.usoDireccionID = usoDireccionID;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.estadoRegistro = estadoRegistro;
    }

    public Integer getUsoDireccionID() {
        return usoDireccionID;
    }

    public void setUsoDireccionID(Integer usoDireccionID) {
        this.usoDireccionID = usoDireccionID;
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
        hash += (usoDireccionID != null ? usoDireccionID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogisticaUsodireccion)) {
            return false;
        }
        LogisticaUsodireccion other = (LogisticaUsodireccion) object;
        if ((this.usoDireccionID == null && other.usoDireccionID != null) || (this.usoDireccionID != null && !this.usoDireccionID.equals(other.usoDireccionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.primefaces.omega.entidades.LogisticaUsodireccion[ usoDireccionID=" + usoDireccionID + " ]";
    }
    
}
