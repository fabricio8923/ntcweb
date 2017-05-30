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
import org.primefaces.omega.entidades.PersonaTipoentidad;
import org.primefaces.omega.entidades.PersonaTipoentidad_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.primefaces.omega.entidades.PersonaEntidadnegocio;

/**
 *
 * @author LuisFabricio
 */
@Stateless
public class PersonaTipoentidadFacade extends AbstractFacade<PersonaTipoentidad> {

    @PersistenceContext(unitName = "org.primefaces_omega_war_1.1.1-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaTipoentidadFacade() {
        super(PersonaTipoentidad.class);
    }

    public boolean isPersonaEntidadnegocioCollectionEmpty(PersonaTipoentidad entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PersonaTipoentidad> personaTipoentidad = cq.from(PersonaTipoentidad.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(personaTipoentidad, entity), cb.isNotEmpty(personaTipoentidad.get(PersonaTipoentidad_.personaEntidadnegocioCollection)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Collection<PersonaEntidadnegocio> findPersonaEntidadnegocioCollection(PersonaTipoentidad entity) {
        return this.getMergedEntity(entity).getPersonaEntidadnegocioCollection();
    }
    
}
