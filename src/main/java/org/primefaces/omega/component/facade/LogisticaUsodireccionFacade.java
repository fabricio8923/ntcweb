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
import org.primefaces.omega.entidades.LogisticaUsodireccion;
import org.primefaces.omega.entidades.LogisticaUsodireccion_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.primefaces.omega.entidades.PersonaDireccionentidad;

/**
 *
 * @author LuisFabricio
 */
@Stateless
public class LogisticaUsodireccionFacade extends AbstractFacade<LogisticaUsodireccion> {

    @PersistenceContext(unitName = "org.primefaces_omega_war_1.1.1-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LogisticaUsodireccionFacade() {
        super(LogisticaUsodireccion.class);
    }

    public boolean isPersonaDireccionentidadCollectionEmpty(LogisticaUsodireccion entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<LogisticaUsodireccion> logisticaUsodireccion = cq.from(LogisticaUsodireccion.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(logisticaUsodireccion, entity), cb.isNotEmpty(logisticaUsodireccion.get(LogisticaUsodireccion_.personaDireccionentidadCollection)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Collection<PersonaDireccionentidad> findPersonaDireccionentidadCollection(LogisticaUsodireccion entity) {
        return this.getMergedEntity(entity).getPersonaDireccionentidadCollection();
    }
    
}
