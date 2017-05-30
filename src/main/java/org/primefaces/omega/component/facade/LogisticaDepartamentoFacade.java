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
import org.primefaces.omega.entidades.LogisticaDepartamento;
import org.primefaces.omega.entidades.LogisticaDepartamento_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.primefaces.omega.entidades.LogisticaPais;
import org.primefaces.omega.entidades.LogisticaProvincia;

/**
 *
 * @author LuisFabricio
 */
@Stateless
public class LogisticaDepartamentoFacade extends AbstractFacade<LogisticaDepartamento> {

    @PersistenceContext(unitName = "org.primefaces_omega_war_1.1.1-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LogisticaDepartamentoFacade() {
        super(LogisticaDepartamento.class);
    }

    public boolean isPaisIDEmpty(LogisticaDepartamento entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<LogisticaDepartamento> logisticaDepartamento = cq.from(LogisticaDepartamento.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(logisticaDepartamento, entity), cb.isNotNull(logisticaDepartamento.get(LogisticaDepartamento_.paisID)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public LogisticaPais findPaisID(LogisticaDepartamento entity) {
        return this.getMergedEntity(entity).getPaisID();
    }

    public boolean isLogisticaProvinciaCollectionEmpty(LogisticaDepartamento entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<LogisticaDepartamento> logisticaDepartamento = cq.from(LogisticaDepartamento.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(logisticaDepartamento, entity), cb.isNotEmpty(logisticaDepartamento.get(LogisticaDepartamento_.logisticaProvinciaCollection)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Collection<LogisticaProvincia> findLogisticaProvinciaCollection(LogisticaDepartamento entity) {
        return this.getMergedEntity(entity).getLogisticaProvinciaCollection();
    }
    
}
