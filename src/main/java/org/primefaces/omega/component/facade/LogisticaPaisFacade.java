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
import org.primefaces.omega.entidades.LogisticaPais;
import org.primefaces.omega.entidades.LogisticaPais_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.primefaces.omega.entidades.LogisticaDepartamento;

/**
 *
 * @author LuisFabricio
 */
@Stateless
public class LogisticaPaisFacade extends AbstractFacade<LogisticaPais> {

    @PersistenceContext(unitName = "org.primefaces_omega_war_1.1.1-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LogisticaPaisFacade() {
        super(LogisticaPais.class);
    }

    public boolean isLogisticaDepartamentoCollectionEmpty(LogisticaPais entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<LogisticaPais> logisticaPais = cq.from(LogisticaPais.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(logisticaPais, entity), cb.isNotEmpty(logisticaPais.get(LogisticaPais_.logisticaDepartamentoCollection)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Collection<LogisticaDepartamento> findLogisticaDepartamentoCollection(LogisticaPais entity) {
        return this.getMergedEntity(entity).getLogisticaDepartamentoCollection();
    }
    
}
