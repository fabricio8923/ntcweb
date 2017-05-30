/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.component.facade;

import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.primefaces.omega.entidades.PersonaEntidadnegocio;
import org.primefaces.omega.entidades.PersonaEntidadnegocio_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.primefaces.omega.entidades.PersonaDocumentoentidad;
import org.primefaces.omega.entidades.PersonaTipoentidad;
import org.primefaces.omega.entidades.PersonaPersona;
import org.primefaces.omega.entidades.PersonaDireccionentidad;

/**
 *
 * @author LuisFabricio
 */
@Stateless
public class PersonaEntidadnegocioFacade extends AbstractFacade<PersonaEntidadnegocio> {

    @PersistenceContext(unitName = "org.primefaces_omega_war_1.1.1-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaEntidadnegocioFacade() {
        super(PersonaEntidadnegocio.class);
    }

    public boolean isPersonaDocumentoentidadCollectionEmpty(PersonaEntidadnegocio entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PersonaEntidadnegocio> personaEntidadnegocio = cq.from(PersonaEntidadnegocio.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(personaEntidadnegocio, entity), cb.isNotEmpty(personaEntidadnegocio.get(PersonaEntidadnegocio_.personaDocumentoentidadCollection)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Collection<PersonaDocumentoentidad> findPersonaDocumentoentidadCollection(PersonaEntidadnegocio entity) {
        return this.getMergedEntity(entity).getPersonaDocumentoentidadCollection();
    }

    public boolean isTipoEntidadIDEmpty(PersonaEntidadnegocio entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PersonaEntidadnegocio> personaEntidadnegocio = cq.from(PersonaEntidadnegocio.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(personaEntidadnegocio, entity), cb.isNotNull(personaEntidadnegocio.get(PersonaEntidadnegocio_.tipoEntidadID)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PersonaTipoentidad findTipoEntidadID(PersonaEntidadnegocio entity) {
        return this.getMergedEntity(entity).getTipoEntidadID();
    }

    public boolean isPersonaPersonaEmpty(PersonaEntidadnegocio entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PersonaEntidadnegocio> personaEntidadnegocio = cq.from(PersonaEntidadnegocio.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(personaEntidadnegocio, entity), cb.isNotNull(personaEntidadnegocio.get(PersonaEntidadnegocio_.personaPersona)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PersonaPersona findPersonaPersona(PersonaEntidadnegocio entity) {
        return this.getMergedEntity(entity).getPersonaPersona();
    }

    public boolean isPersonaDireccionentidadCollectionEmpty(PersonaEntidadnegocio entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PersonaEntidadnegocio> personaEntidadnegocio = cq.from(PersonaEntidadnegocio.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(personaEntidadnegocio, entity), cb.isNotEmpty(personaEntidadnegocio.get(PersonaEntidadnegocio_.personaDireccionentidadCollection)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Collection<PersonaDireccionentidad> findPersonaDireccionentidadCollection(PersonaEntidadnegocio entity) {
        return this.getMergedEntity(entity).getPersonaDireccionentidadCollection();
    }
    
}
