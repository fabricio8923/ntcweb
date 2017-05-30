/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.component.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.primefaces.omega.entidades.LogisticaDistrito;
import org.primefaces.omega.entidades.LogisticaDistrito_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.primefaces.omega.entidades.LogisticaProvincia;

/**
 *
 * @author LuisFabricio
 */
@Stateless
public class LogisticaDistritoFacade extends AbstractFacade<LogisticaDistrito> {

    @PersistenceContext(unitName = "org.primefaces_omega_war_1.1.1-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LogisticaDistritoFacade() {
        super(LogisticaDistrito.class);
    }

    public boolean isProvinciaIDEmpty(LogisticaDistrito entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<LogisticaDistrito> logisticaDistrito = cq.from(LogisticaDistrito.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(logisticaDistrito, entity), cb.isNotNull(logisticaDistrito.get(LogisticaDistrito_.provinciaID)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public LogisticaProvincia findProvinciaID(LogisticaDistrito entity) {
        return this.getMergedEntity(entity).getProvinciaID();
    }
    
}
