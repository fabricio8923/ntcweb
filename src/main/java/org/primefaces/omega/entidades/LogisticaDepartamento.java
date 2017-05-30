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
@Table(name = "logistica_departamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LogisticaDepartamento.findAll", query = "SELECT l FROM LogisticaDepartamento l")
    , @NamedQuery(name = "LogisticaDepartamento.findByDepartamentoID", query = "SELECT l FROM LogisticaDepartamento l WHERE l.departamentoID = :departamentoID")
    , @NamedQuery(name = "LogisticaDepartamento.findByNombre", query = "SELECT l FROM LogisticaDepartamento l WHERE l.nombre = :nombre")
    , @NamedQuery(name = "LogisticaDepartamento.findByCodigo", query = "SELECT l FROM LogisticaDepartamento l WHERE l.codigo = :codigo")
    , @NamedQuery(name = "LogisticaDepartamento.findByZonaHoraria", query = "SELECT l FROM LogisticaDepartamento l WHERE l.zonaHoraria = :zonaHoraria")
    , @NamedQuery(name = "LogisticaDepartamento.findByCodigoPostal", query = "SELECT l FROM LogisticaDepartamento l WHERE l.codigoPostal = :codigoPostal")
    , @NamedQuery(name = "LogisticaDepartamento.findByFechaCreacion", query = "SELECT l FROM LogisticaDepartamento l WHERE l.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "LogisticaDepartamento.findByFechaModificacion", query = "SELECT l FROM LogisticaDepartamento l WHERE l.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "LogisticaDepartamento.findByEstadoRegistro", query = "SELECT l FROM LogisticaDepartamento l WHERE l.estadoRegistro = :estadoRegistro")})
public class LogisticaDepartamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DepartamentoID")
    private Integer departamentoID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 10)
    @Column(name = "Codigo")
    private String codigo;
    @Column(name = "ZonaHoraria")
    private Integer zonaHoraria;
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
    @JoinColumn(name = "PaisID", referencedColumnName = "PaisID")
    @ManyToOne(optional = false)
    private LogisticaPais paisID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departamentoID")
    private Collection<LogisticaProvincia> logisticaProvinciaCollection;

    public LogisticaDepartamento() {
    }

    public LogisticaDepartamento(Integer departamentoID) {
        this.departamentoID = departamentoID;
    }

    public LogisticaDepartamento(Integer departamentoID, String nombre, Date fechaCreacion, boolean estadoRegistro) {
        this.departamentoID = departamentoID;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.estadoRegistro = estadoRegistro;
    }

    public Integer getDepartamentoID() {
        return departamentoID;
    }

    public void setDepartamentoID(Integer departamentoID) {
        this.departamentoID = departamentoID;
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

    public Integer getZonaHoraria() {
        return zonaHoraria;
    }

    public void setZonaHoraria(Integer zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
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

    public LogisticaPais getPaisID() {
        return paisID;
    }

    public void setPaisID(LogisticaPais paisID) {
        this.paisID = paisID;
    }

    @XmlTransient
    public Collection<LogisticaProvincia> getLogisticaProvinciaCollection() {
        return logisticaProvinciaCollection;
    }

    public void setLogisticaProvinciaCollection(Collection<LogisticaProvincia> logisticaProvinciaCollection) {
        this.logisticaProvinciaCollection = logisticaProvinciaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departamentoID != null ? departamentoID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogisticaDepartamento)) {
            return false;
        }
        LogisticaDepartamento other = (LogisticaDepartamento) object;
        if ((this.departamentoID == null && other.departamentoID != null) || (this.departamentoID != null && !this.departamentoID.equals(other.departamentoID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.primefaces.omega.entidades.LogisticaDepartamento[ departamentoID=" + departamentoID + " ]";
    }
    
}
