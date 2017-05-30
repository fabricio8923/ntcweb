/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.entidades;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "persona_direccionentidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonaDireccionentidad.findAll", query = "SELECT p FROM PersonaDireccionentidad p")
    , @NamedQuery(name = "PersonaDireccionentidad.findByDireccionEntidadID", query = "SELECT p FROM PersonaDireccionentidad p WHERE p.direccionEntidadID = :direccionEntidadID")
    , @NamedQuery(name = "PersonaDireccionentidad.findByNombre", query = "SELECT p FROM PersonaDireccionentidad p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "PersonaDireccionentidad.findByDescripcion", query = "SELECT p FROM PersonaDireccionentidad p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "PersonaDireccionentidad.findByLatitud", query = "SELECT p FROM PersonaDireccionentidad p WHERE p.latitud = :latitud")
    , @NamedQuery(name = "PersonaDireccionentidad.findByLongitud", query = "SELECT p FROM PersonaDireccionentidad p WHERE p.longitud = :longitud")
    , @NamedQuery(name = "PersonaDireccionentidad.findByFechaCreacion", query = "SELECT p FROM PersonaDireccionentidad p WHERE p.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "PersonaDireccionentidad.findByFechaModificacion", query = "SELECT p FROM PersonaDireccionentidad p WHERE p.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "PersonaDireccionentidad.findByEstadoRegistro", query = "SELECT p FROM PersonaDireccionentidad p WHERE p.estadoRegistro = :estadoRegistro")})
public class PersonaDireccionentidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DireccionEntidadID")
    private Integer direccionEntidadID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 200)
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Latitud")
    private BigInteger latitud;
    @Column(name = "Longitud")
    private BigInteger longitud;
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
    @JoinColumn(name = "DistritoID", referencedColumnName = "DistritoID")
    @ManyToOne
    private LogisticaDistrito distritoID;
    @JoinColumn(name = "EntidadNegocioID", referencedColumnName = "EntidadNegocioID")
    @ManyToOne(optional = false)
    private PersonaEntidadnegocio entidadNegocioID;
    @JoinColumn(name = "TipoDireccionID", referencedColumnName = "TipoDireccionID")
    @ManyToOne(optional = false)
    private LogisticaTipodireccion tipoDireccionID;
    @JoinColumn(name = "UsoDireccionID", referencedColumnName = "UsoDireccionID")
    @ManyToOne(optional = false)
    private LogisticaUsodireccion usoDireccionID;

    public PersonaDireccionentidad() {
    }

    public PersonaDireccionentidad(Integer direccionEntidadID) {
        this.direccionEntidadID = direccionEntidadID;
    }

    public PersonaDireccionentidad(Integer direccionEntidadID, String nombre, Date fechaCreacion, boolean estadoRegistro) {
        this.direccionEntidadID = direccionEntidadID;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.estadoRegistro = estadoRegistro;
    }

    public Integer getDireccionEntidadID() {
        return direccionEntidadID;
    }

    public void setDireccionEntidadID(Integer direccionEntidadID) {
        this.direccionEntidadID = direccionEntidadID;
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

    public BigInteger getLatitud() {
        return latitud;
    }

    public void setLatitud(BigInteger latitud) {
        this.latitud = latitud;
    }

    public BigInteger getLongitud() {
        return longitud;
    }

    public void setLongitud(BigInteger longitud) {
        this.longitud = longitud;
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

    public LogisticaDistrito getDistritoID() {
        return distritoID;
    }

    public void setDistritoID(LogisticaDistrito distritoID) {
        this.distritoID = distritoID;
    }

    public PersonaEntidadnegocio getEntidadNegocioID() {
        return entidadNegocioID;
    }

    public void setEntidadNegocioID(PersonaEntidadnegocio entidadNegocioID) {
        this.entidadNegocioID = entidadNegocioID;
    }

    public LogisticaTipodireccion getTipoDireccionID() {
        return tipoDireccionID;
    }

    public void setTipoDireccionID(LogisticaTipodireccion tipoDireccionID) {
        this.tipoDireccionID = tipoDireccionID;
    }

    public LogisticaUsodireccion getUsoDireccionID() {
        return usoDireccionID;
    }

    public void setUsoDireccionID(LogisticaUsodireccion usoDireccionID) {
        this.usoDireccionID = usoDireccionID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (direccionEntidadID != null ? direccionEntidadID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaDireccionentidad)) {
            return false;
        }
        PersonaDireccionentidad other = (PersonaDireccionentidad) object;
        if ((this.direccionEntidadID == null && other.direccionEntidadID != null) || (this.direccionEntidadID != null && !this.direccionEntidadID.equals(other.direccionEntidadID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.primefaces.omega.entidades.PersonaDireccionentidad[ direccionEntidadID=" + direccionEntidadID + " ]";
    }
    
}
