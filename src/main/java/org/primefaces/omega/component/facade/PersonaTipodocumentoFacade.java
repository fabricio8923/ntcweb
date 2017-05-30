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
import org.primefaces.omega.entidades.PersonaTipodocumento;
import org.primefaces.omega.entidades.PersonaTipodocumento_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.primefaces.omega.entidades.PersonaDocumentoentidad;

/**
 *
 * @author LuisFabricio
 */
@Stateless
public class PersonaTipodocumentoFacade extends AbstractFacade<PersonaTipodocumento> {

    @PersistenceContext(unitName = "org.primefaces_omega_war_1.1.1-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaTipodocumentoFacade() {
        super(PersonaTipodocumento.class);
    }

    public boolean isPersonaDocumentoentidadCollectionEmpty(PersonaTipodocumento entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PersonaTipodocumento> personaTipodocumento = cq.from(PersonaTipodocumento.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(personaTipodocumento, entity), cb.isNotEmpty(personaTipodocumento.get(PersonaTipodocumento_.personaDocumentoentidadCollection)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Collection<PersonaDocumentoentidad> findPersonaDocumentoentidadCollection(PersonaTipodocumento entity) {
        return this.getMergedEntity(entity).getPersonaDocumentoentidadCollection();
    }
    
}
