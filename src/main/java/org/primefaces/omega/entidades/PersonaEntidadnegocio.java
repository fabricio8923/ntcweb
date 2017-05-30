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
import javax.persistence.OneToOne;
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
@Table(name = "persona_entidadnegocio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonaEntidadnegocio.findAll", query = "SELECT p FROM PersonaEntidadnegocio p")
    , @NamedQuery(name = "PersonaEntidadnegocio.findByEntidadNegocioID", query = "SELECT p FROM PersonaEntidadnegocio p WHERE p.entidadNegocioID = :entidadNegocioID")
    , @NamedQuery(name = "PersonaEntidadnegocio.findByNombre", query = "SELECT p FROM PersonaEntidadnegocio p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "PersonaEntidadnegocio.findByDescripcion", query = "SELECT p FROM PersonaEntidadnegocio p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "PersonaEntidadnegocio.findByAbreviacion", query = "SELECT p FROM PersonaEntidadnegocio p WHERE p.abreviacion = :abreviacion")
    , @NamedQuery(name = "PersonaEntidadnegocio.findByFechaNacimiento", query = "SELECT p FROM PersonaEntidadnegocio p WHERE p.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "PersonaEntidadnegocio.findByFechaCese", query = "SELECT p FROM PersonaEntidadnegocio p WHERE p.fechaCese = :fechaCese")
    , @NamedQuery(name = "PersonaEntidadnegocio.findByFechaCreacion", query = "SELECT p FROM PersonaEntidadnegocio p WHERE p.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "PersonaEntidadnegocio.findByFechaModificacion", query = "SELECT p FROM PersonaEntidadnegocio p WHERE p.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "PersonaEntidadnegocio.findByEstadoRegistro", query = "SELECT p FROM PersonaEntidadnegocio p WHERE p.estadoRegistro = :estadoRegistro")})
public class PersonaEntidadnegocio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EntidadNegocioID")
    private Integer entidadNegocioID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
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
    @Column(name = "FechaNacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column(name = "FechaCese")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCese;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entidadNegocioID")
    private Collection<PersonaDocumentoentidad> personaDocumentoentidadCollection;
    @JoinColumn(name = "TipoEntidadID", referencedColumnName = "TipoEntidadID")
    @ManyToOne(optional = false)
    private PersonaTipoentidad tipoEntidadID;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "personaEntidadnegocio")
    private PersonaPersona personaPersona;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entidadNegocioID")
    private Collection<PersonaDireccionentidad> personaDireccionentidadCollection;

    public PersonaEntidadnegocio() {
    }

    public PersonaEntidadnegocio(Integer entidadNegocioID) {
        this.entidadNegocioID = entidadNegocioID;
    }

    public PersonaEntidadnegocio(Integer entidadNegocioID, String nombre, Date fechaNacimiento, Date fechaCreacion, boolean estadoRegistro) {
        this.entidadNegocioID = entidadNegocioID;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaCreacion = fechaCreacion;
        this.estadoRegistro = estadoRegistro;
    }

    public Integer getEntidadNegocioID() {
        return entidadNegocioID;
    }

    public void setEntidadNegocioID(Integer entidadNegocioID) {
        this.entidadNegocioID = entidadNegocioID;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaCese() {
        return fechaCese;
    }

    public void setFechaCese(Date fechaCese) {
        this.fechaCese = fechaCese;
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

    public PersonaTipoentidad getTipoEntidadID() {
        return tipoEntidadID;
    }

    public void setTipoEntidadID(PersonaTipoentidad tipoEntidadID) {
        this.tipoEntidadID = tipoEntidadID;
    }

    public PersonaPersona getPersonaPersona() {
        return personaPersona;
    }

    public void setPersonaPersona(PersonaPersona personaPersona) {
        this.personaPersona = personaPersona;
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
        hash += (entidadNegocioID != null ? entidadNegocioID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaEntidadnegocio)) {
            return false;
        }
        PersonaEntidadnegocio other = (PersonaEntidadnegocio) object;
        if ((this.entidadNegocioID == null && other.entidadNegocioID != null) || (this.entidadNegocioID != null && !this.entidadNegocioID.equals(other.entidadNegocioID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.primefaces.omega.entidades.PersonaEntidadnegocio[ entidadNegocioID=" + entidadNegocioID + " ]";
    }
    
}
