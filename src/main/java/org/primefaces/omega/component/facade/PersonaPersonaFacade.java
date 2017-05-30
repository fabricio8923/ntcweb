/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.component.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.primefaces.omega.entidades.PersonaPersona;
import org.primefaces.omega.entidades.PersonaPersona_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.primefaces.omega.entidades.PersonaEntidadnegocio;
import org.primefaces.omega.entidades.PersonaEstadocivil;

/**
 *
 * @author LuisFabricio
 */
@Stateless
public class PersonaPersonaFacade extends AbstractFacade<PersonaPersona> {

    @PersistenceContext(unitName = "org.primefaces_omega_war_1.1.1-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaPersonaFacade() {
        super(PersonaPersona.class);
    }

    public boolean isPersonaEntidadnegocioEmpty(PersonaPersona entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PersonaPersona> personaPersona = cq.from(PersonaPersona.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(personaPersona, entity), cb.isNotNull(personaPersona.get(PersonaPersona_.personaEntidadnegocio)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PersonaEntidadnegocio findPersonaEntidadnegocio(PersonaPersona entity) {
        return this.getMergedEntity(entity).getPersonaEntidadnegocio();
    }

    public boolean isEstadoCivilIDEmpty(PersonaPersona entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PersonaPersona> personaPersona = cq.from(PersonaPersona.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(personaPersona, entity), cb.isNotNull(personaPersona.get(PersonaPersona_.estadoCivilID)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PersonaEstadocivil findEstadoCivilID(PersonaPersona entity) {
        return this.getMergedEntity(entity).getEstadoCivilID();
    }
    
}
