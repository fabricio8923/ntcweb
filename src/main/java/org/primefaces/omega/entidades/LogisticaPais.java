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
@Table(name = "logistica_pais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LogisticaPais.findAll", query = "SELECT l FROM LogisticaPais l")
    , @NamedQuery(name = "LogisticaPais.findByPaisID", query = "SELECT l FROM LogisticaPais l WHERE l.paisID = :paisID")
    , @NamedQuery(name = "LogisticaPais.findByNombre", query = "SELECT l FROM LogisticaPais l WHERE l.nombre = :nombre")
    , @NamedQuery(name = "LogisticaPais.findByCodigoISO", query = "SELECT l FROM LogisticaPais l WHERE l.codigoISO = :codigoISO")
    , @NamedQuery(name = "LogisticaPais.findByMoneda", query = "SELECT l FROM LogisticaPais l WHERE l.moneda = :moneda")
    , @NamedQuery(name = "LogisticaPais.findByZonaHoraria", query = "SELECT l FROM LogisticaPais l WHERE l.zonaHoraria = :zonaHoraria")
    , @NamedQuery(name = "LogisticaPais.findByCodigoPostal", query = "SELECT l FROM LogisticaPais l WHERE l.codigoPostal = :codigoPostal")
    , @NamedQuery(name = "LogisticaPais.findByInmutable", query = "SELECT l FROM LogisticaPais l WHERE l.inmutable = :inmutable")
    , @NamedQuery(name = "LogisticaPais.findByFechaCreacion", query = "SELECT l FROM LogisticaPais l WHERE l.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "LogisticaPais.findByFechaModificacion", query = "SELECT l FROM LogisticaPais l WHERE l.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "LogisticaPais.findByEstadoRegistro", query = "SELECT l FROM LogisticaPais l WHERE l.estadoRegistro = :estadoRegistro")})
public class LogisticaPais implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paisID")
    private Collection<LogisticaDepartamento> logisticaDepartamentoCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PaisID")
    private Integer paisID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 10)
    @Column(name = "CodigoISO")
    private String codigoISO;
    @Size(max = 4)
    @Column(name = "Moneda")
    private String moneda;
    @Column(name = "ZonaHoraria")
    private Integer zonaHoraria;
    @Size(max = 8)
    @Column(name = "CodigoPostal")
    private String codigoPostal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Inmutable")
    private boolean inmutable;
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

    public LogisticaPais() {
    }

    public LogisticaPais(Integer paisID) {
        this.paisID = paisID;
    }

    public LogisticaPais(Integer paisID, String nombre, boolean inmutable, Date fechaCreacion, boolean estadoRegistro) {
        this.paisID = paisID;
        this.nombre = nombre;
        this.inmutable = inmutable;
        this.fechaCreacion = fechaCreacion;
        this.estadoRegistro = estadoRegistro;
    }

    public Integer getPaisID() {
        return paisID;
    }

    public void setPaisID(Integer paisID) {
        this.paisID = paisID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
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

    public boolean getInmutable() {
        return inmutable;
    }

    public void setInmutable(boolean inmutable) {
        this.inmutable = inmutable;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paisID != null ? paisID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogisticaPais)) {
            return false;
        }
        LogisticaPais other = (LogisticaPais) object;
        if ((this.paisID == null && other.paisID != null) || (this.paisID != null && !this.paisID.equals(other.paisID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.primefaces.omega.entidades.LogisticaPais[ paisID=" + paisID + " ]";
    }

    @XmlTransient
    public Collection<LogisticaDepartamento> getLogisticaDepartamentoCollection() {
        return logisticaDepartamentoCollection;
    }

    public void setLogisticaDepartamentoCollection(Collection<LogisticaDepartamento> logisticaDepartamentoCollection) {
        this.logisticaDepartamentoCollection = logisticaDepartamentoCollection;
    }
    
}
