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
import org.primefaces.omega.entidades.LogisticaProvincia;
import org.primefaces.omega.entidades.LogisticaProvincia_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.primefaces.omega.entidades.LogisticaDistrito;
import org.primefaces.omega.entidades.LogisticaDepartamento;

/**
 *
 * @author LuisFabricio
 */
@Stateless
public class LogisticaProvinciaFacade extends AbstractFacade<LogisticaProvincia> {

    @PersistenceContext(unitName = "org.primefaces_omega_war_1.1.1-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LogisticaProvinciaFacade() {
        super(LogisticaProvincia.class);
    }

    public boolean isLogisticaDistritoCollectionEmpty(LogisticaProvincia entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<LogisticaProvincia> logisticaProvincia = cq.from(LogisticaProvincia.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(logisticaProvincia, entity), cb.isNotEmpty(logisticaProvincia.get(LogisticaProvincia_.logisticaDistritoCollection)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Collection<LogisticaDistrito> findLogisticaDistritoCollection(LogisticaProvincia entity) {
        return this.getMergedEntity(entity).getLogisticaDistritoCollection();
    }

    public boolean isDepartamentoIDEmpty(LogisticaProvincia entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<LogisticaProvincia> logisticaProvincia = cq.from(LogisticaProvincia.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(logisticaProvincia, entity), cb.isNotNull(logisticaProvincia.get(LogisticaProvincia_.departamentoID)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public LogisticaDepartamento findDepartamentoID(LogisticaProvincia entity) {
        return this.getMergedEntity(entity).getDepartamentoID();
    }
    
}
