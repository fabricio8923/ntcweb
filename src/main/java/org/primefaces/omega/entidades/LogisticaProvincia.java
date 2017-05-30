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
@Table(name = "logistica_provincia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LogisticaProvincia.findAll", query = "SELECT l FROM LogisticaProvincia l")
    , @NamedQuery(name = "LogisticaProvincia.findByProvinciaID", query = "SELECT l FROM LogisticaProvincia l WHERE l.provinciaID = :provinciaID")
    , @NamedQuery(name = "LogisticaProvincia.findByNombre", query = "SELECT l FROM LogisticaProvincia l WHERE l.nombre = :nombre")
    , @NamedQuery(name = "LogisticaProvincia.findByCodigo", query = "SELECT l FROM LogisticaProvincia l WHERE l.codigo = :codigo")
    , @NamedQuery(name = "LogisticaProvincia.findByCodigoPostal", query = "SELECT l FROM LogisticaProvincia l WHERE l.codigoPostal = :codigoPostal")
    , @NamedQuery(name = "LogisticaProvincia.findByFechaCreacion", query = "SELECT l FROM LogisticaProvincia l WHERE l.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "LogisticaProvincia.findByFechaModificacion", query = "SELECT l FROM LogisticaProvincia l WHERE l.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "LogisticaProvincia.findByEstadoRegistro", query = "SELECT l FROM LogisticaProvincia l WHERE l.estadoRegistro = :estadoRegistro")})
public class LogisticaProvincia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProvinciaID")
    private Integer provinciaID;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "provinciaID")
    private Collection<LogisticaDistrito> logisticaDistritoCollection;
    @JoinColumn(name = "DepartamentoID", referencedColumnName = "DepartamentoID")
    @ManyToOne(optional = false)
    private LogisticaDepartamento departamentoID;

    public LogisticaProvincia() {
    }

    public LogisticaProvincia(Integer provinciaID) {
        this.provinciaID = provinciaID;
    }

    public LogisticaProvincia(Integer provinciaID, String nombre, Date fechaCreacion, boolean estadoRegistro) {
        this.provinciaID = provinciaID;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.estadoRegistro = estadoRegistro;
    }

    public Integer getProvinciaID() {
        return provinciaID;
    }

    public void setProvinciaID(Integer provinciaID) {
        this.provinciaID = provinciaID;
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

    @XmlTransient
    public Collection<LogisticaDistrito> getLogisticaDistritoCollection() {
        return logisticaDistritoCollection;
    }

    public void setLogisticaDistritoCollection(Collection<LogisticaDistrito> logisticaDistritoCollection) {
        this.logisticaDistritoCollection = logisticaDistritoCollection;
    }

    public LogisticaDepartamento getDepartamentoID() {
        return departamentoID;
    }

    public void setDepartamentoID(LogisticaDepartamento departamentoID) {
        this.departamentoID = departamentoID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (provinciaID != null ? provinciaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogisticaProvincia)) {
            return false;
        }
        LogisticaProvincia other = (LogisticaProvincia) object;
        if ((this.provinciaID == null && other.provinciaID != null) || (this.provinciaID != null && !this.provinciaID.equals(other.provinciaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.primefaces.omega.entidades.LogisticaProvincia[ provinciaID=" + provinciaID + " ]";
    }
    
}
