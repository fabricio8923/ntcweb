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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "logistica_distrito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LogisticaDistrito.findAll", query = "SELECT l FROM LogisticaDistrito l")
    , @NamedQuery(name = "LogisticaDistrito.findByDistritoID", query = "SELECT l FROM LogisticaDistrito l WHERE l.distritoID = :distritoID")
    , @NamedQuery(name = "LogisticaDistrito.findByNombre", query = "SELECT l FROM LogisticaDistrito l WHERE l.nombre = :nombre")
    , @NamedQuery(name = "LogisticaDistrito.findByCodigo", query = "SELECT l FROM LogisticaDistrito l WHERE l.codigo = :codigo")
    , @NamedQuery(name = "LogisticaDistrito.findByCodigoPostal", query = "SELECT l FROM LogisticaDistrito l WHERE l.codigoPostal = :codigoPostal")
    , @NamedQuery(name = "LogisticaDistrito.findByFechaCreacion", query = "SELECT l FROM LogisticaDistrito l WHERE l.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "LogisticaDistrito.findByFechaModificacion", query = "SELECT l FROM LogisticaDistrito l WHERE l.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "LogisticaDistrito.findByEstadoRegistro", query = "SELECT l FROM LogisticaDistrito l WHERE l.estadoRegistro = :estadoRegistro")})
public class LogisticaDistrito implements Serializable {

    @OneToMany(mappedBy = "distritoID")
    private Collection<PersonaDireccionentidad> personaDireccionentidadCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DistritoID")
    private Integer distritoID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 10)
    @Column(name = "Codigo")
    private String codigo;
    @Size(max = 8)
    @Column(name = "CodigoPostal")
    private String codigoPostal;
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
    @JoinColumn(name = "ProvinciaID", referencedColumnName = "ProvinciaID")
    @ManyToOne(optional = false)
    private LogisticaProvincia provinciaID;

    public LogisticaDistrito() {
    }

    public LogisticaDistrito(Integer distritoID) {
        this.distritoID = distritoID;
    }

    public LogisticaDistrito(Integer distritoID, String nombre, Date fechaCreacion, boolean estadoRegistro) {
        this.distritoID = distritoID;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.estadoRegistro = estadoRegistro;
    }

    public Integer getDistritoID() {
        return distritoID;
    }

    public void setDistritoID(Integer distritoID) {
        this.distritoID = distritoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
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

    public LogisticaProvincia getProvinciaID() {
        return provinciaID;
    }

    public void setProvinciaID(LogisticaProvincia provinciaID) {
        this.provinciaID = provinciaID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (distritoID != null ? distritoID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogisticaDistrito)) {
            return false;
        }
        LogisticaDistrito other = (LogisticaDistrito) object;
        if ((this.distritoID == null && other.distritoID != null) || (this.distritoID != null && !this.distritoID.equals(other.distritoID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.primefaces.omega.entidades.LogisticaDistrito[ distritoID=" + distritoID + " ]";
    }

    @XmlTransient
    public Collection<PersonaDireccionentidad> getPersonaDireccionentidadCollection() {
        return personaDireccionentidadCollection;
    }

    public void setPersonaDireccionentidadCollection(Collection<PersonaDireccionentidad> personaDireccionentidadCollection) {
        this.personaDireccionentidadCollection = personaDireccionentidadCollection;
    }
    
}
