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
import org.primefaces.omega.entidades.PersonaEstadocivil;
import org.primefaces.omega.entidades.PersonaEstadocivil_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.primefaces.omega.entidades.PersonaPersona;

/**
 *
 * @author LuisFabricio
 */
@Stateless
public class PersonaEstadocivilFacade extends AbstractFacade<PersonaEstadocivil> {

    @PersistenceContext(unitName = "org.primefaces_omega_war_1.1.1-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaEstadocivilFacade() {
        super(PersonaEstadocivil.class);
    }

    public boolean isPersonaPersonaCollectionEmpty(PersonaEstadocivil entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PersonaEstadocivil> personaEstadocivil = cq.from(PersonaEstadocivil.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(personaEstadocivil, entity), cb.isNotEmpty(personaEstadocivil.get(PersonaEstadocivil_.personaPersonaCollection)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Collection<PersonaPersona> findPersonaPersonaCollection(PersonaEstadocivil entity) {
        return this.getMergedEntity(entity).getPersonaPersonaCollection();
    }
    
}
