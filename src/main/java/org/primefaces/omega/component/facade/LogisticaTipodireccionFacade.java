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
import org.primefaces.omega.entidades.LogisticaTipodireccion;
import org.primefaces.omega.entidades.LogisticaTipodireccion_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.primefaces.omega.entidades.PersonaDireccionentidad;

/**
 *
 * @author LuisFabricio
 */
@Stateless
public class LogisticaTipodireccionFacade extends AbstractFacade<LogisticaTipodireccion> {

    @PersistenceContext(unitName = "org.primefaces_omega_war_1.1.1-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LogisticaTipodireccionFacade() {
        super(LogisticaTipodireccion.class);
    }

    public boolean isPersonaDireccionentidadCollectionEmpty(LogisticaTipodireccion entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<LogisticaTipodireccion> logisticaTipodireccion = cq.from(LogisticaTipodireccion.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(logisticaTipodireccion, entity), cb.isNotEmpty(logisticaTipodireccion.get(LogisticaTipodireccion_.personaDireccionentidadCollection)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Collection<PersonaDireccionentidad> findPersonaDireccionentidadCollection(LogisticaTipodireccion entity) {
        return this.getMergedEntity(entity).getPersonaDireccionentidadCollection();
    }
    
}
