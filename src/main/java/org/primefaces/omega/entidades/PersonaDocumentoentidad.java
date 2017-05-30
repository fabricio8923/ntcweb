/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.entidades;

import java.io.Serializable;
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
@Table(name = "persona_documentoentidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonaDocumentoentidad.findAll", query = "SELECT p FROM PersonaDocumentoentidad p")
    , @NamedQuery(name = "PersonaDocumentoentidad.findByDocumentoEntidadID", query = "SELECT p FROM PersonaDocumentoentidad p WHERE p.documentoEntidadID = :documentoEntidadID")
    , @NamedQuery(name = "PersonaDocumentoentidad.findByNombre", query = "SELECT p FROM PersonaDocumentoentidad p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "PersonaDocumentoentidad.findByDescripcion", query = "SELECT p FROM PersonaDocumentoentidad p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "PersonaDocumentoentidad.findByObservaion", query = "SELECT p FROM PersonaDocumentoentidad p WHERE p.observaion = :observaion")
    , @NamedQuery(name = "PersonaDocumentoentidad.findByRuta", query = "SELECT p FROM PersonaDocumentoentidad p WHERE p.ruta = :ruta")
    , @NamedQuery(name = "PersonaDocumentoentidad.findByExtension", query = "SELECT p FROM PersonaDocumentoentidad p WHERE p.extension = :extension")
    , @NamedQuery(name = "PersonaDocumentoentidad.findByFechaCreacion", query = "SELECT p FROM PersonaDocumentoentidad p WHERE p.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "PersonaDocumentoentidad.findByFechaModificacion", query = "SELECT p FROM PersonaDocumentoentidad p WHERE p.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "PersonaDocumentoentidad.findByEstadoRegistro", query = "SELECT p FROM PersonaDocumentoentidad p WHERE p.estadoRegistro = :estadoRegistro")})
public class PersonaDocumentoentidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DocumentoEntidadID")
    private Integer documentoEntidadID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "Descripcion")
    private String descripcion;
    @Size(max = 300)
    @Column(name = "Observaion")
    private String observaion;
    @Size(max = 200)
    @Column(name = "Ruta")
    private String ruta;
    @Size(max = 6)
    @Column(name = "Extension")
    private String extension;
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
    @JoinColumn(name = "EntidadNegocioID", referencedColumnName = "EntidadNegocioID")
    @ManyToOne(optional = false)
    private PersonaEntidadnegocio entidadNegocioID;
    @JoinColumn(name = "TipoDocumentoID", referencedColumnName = "TipoDocumentoID")
    @ManyToOne(optional = false)
    private PersonaTipodocumento tipoDocumentoID;

    public PersonaDocumentoentidad() {
    }

    public PersonaDocumentoentidad(Integer documentoEntidadID) {
        this.documentoEntidadID = documentoEntidadID;
    }

    public PersonaDocumentoentidad(Integer documentoEntidadID, String nombre, Date fechaCreacion, boolean estadoRegistro) {
        this.documentoEntidadID = documentoEntidadID;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.estadoRegistro = estadoRegistro;
    }

    public Integer getDocumentoEntidadID() {
        return documentoEntidadID;
    }

    public void setDocumentoEntidadID(Integer documentoEntidadID) {
        this.documentoEntidadID = documentoEntidadID;
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

    public String getObservaion() {
        return observaion;
    }

    public void setObservaion(String observaion) {
        this.observaion = observaion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
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

    public PersonaEntidadnegocio getEntidadNegocioID() {
        return entidadNegocioID;
    }

    public void setEntidadNegocioID(PersonaEntidadnegocio entidadNegocioID) {
        this.entidadNegocioID = entidadNegocioID;
    }

    public PersonaTipodocumento getTipoDocumentoID() {
        return tipoDocumentoID;
    }

    public void setTipoDocumentoID(PersonaTipodocumento tipoDocumentoID) {
        this.tipoDocumentoID = tipoDocumentoID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentoEntidadID != null ? documentoEntidadID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaDocumentoentidad)) {
            return false;
        }
        PersonaDocumentoentidad other = (PersonaDocumentoentidad) object;
        if ((this.documentoEntidadID == null && other.documentoEntidadID != null) || (this.documentoEntidadID != null && !this.documentoEntidadID.equals(other.documentoEntidadID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.primefaces.omega.entidades.PersonaDocumentoentidad[ documentoEntidadID=" + documentoEntidadID + " ]";
    }
    
}
