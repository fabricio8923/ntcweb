/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.component.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.primefaces.omega.entidades.PersonaDireccionentidad;
import org.primefaces.omega.entidades.PersonaDireccionentidad_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.primefaces.omega.entidades.LogisticaDistrito;
import org.primefaces.omega.entidades.PersonaEntidadnegocio;
import org.primefaces.omega.entidades.LogisticaTipodireccion;
import org.primefaces.omega.entidades.LogisticaUsodireccion;

/**
 *
 * @author LuisFabricio
 */
@Stateless
public class PersonaDireccionentidadFacade extends AbstractFacade<PersonaDireccionentidad> {

    @PersistenceContext(unitName = "org.primefaces_omega_war_1.1.1-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaDireccionentidadFacade() {
        super(PersonaDireccionentidad.class);
    }

    public boolean isDistritoIDEmpty(PersonaDireccionentidad entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PersonaDireccionentidad> personaDireccionentidad = cq.from(PersonaDireccionentidad.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(personaDireccionentidad, entity), cb.isNotNull(personaDireccionentidad.get(PersonaDireccionentidad_.distritoID)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public LogisticaDistrito findDistritoID(PersonaDireccionentidad entity) {
        return this.getMergedEntity(entity).getDistritoID();
    }

    public boolean isEntidadNegocioIDEmpty(PersonaDireccionentidad entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PersonaDireccionentidad> personaDireccionentidad = cq.from(PersonaDireccionentidad.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(personaDireccionentidad, entity), cb.isNotNull(personaDireccionentidad.get(PersonaDireccionentidad_.entidadNegocioID)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PersonaEntidadnegocio findEntidadNegocioID(PersonaDireccionentidad entity) {
        return this.getMergedEntity(entity).getEntidadNegocioID();
    }

    public boolean isTipoDireccionIDEmpty(PersonaDireccionentidad entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PersonaDireccionentidad> personaDireccionentidad = cq.from(PersonaDireccionentidad.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(personaDireccionentidad, entity), cb.isNotNull(personaDireccionentidad.get(PersonaDireccionentidad_.tipoDireccionID)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public LogisticaTipodireccion findTipoDireccionID(PersonaDireccionentidad entity) {
        return this.getMergedEntity(entity).getTipoDireccionID();
    }

    public boolean isUsoDireccionIDEmpty(PersonaDireccionentidad entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PersonaDireccionentidad> personaDireccionentidad = cq.from(PersonaDireccionentidad.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(personaDireccionentidad, entity), cb.isNotNull(personaDireccionentidad.get(PersonaDireccionentidad_.usoDireccionID)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public LogisticaUsodireccion findUsoDireccionID(PersonaDireccionentidad entity) {
        return this.getMergedEntity(entity).getUsoDireccionID();
    }
    
}
