/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.component.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.primefaces.omega.entidades.PersonaDocumentoentidad;
import org.primefaces.omega.entidades.PersonaDocumentoentidad_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.primefaces.omega.entidades.PersonaEntidadnegocio;
import org.primefaces.omega.entidades.PersonaTipodocumento;

/**
 *
 * @author LuisFabricio
 */
@Stateless
public class PersonaDocumentoentidadFacade extends AbstractFacade<PersonaDocumentoentidad> {

    @PersistenceContext(unitName = "org.primefaces_omega_war_1.1.1-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaDocumentoentidadFacade() {
        super(PersonaDocumentoentidad.class);
    }

    public boolean isEntidadNegocioIDEmpty(PersonaDocumentoentidad entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PersonaDocumentoentidad> personaDocumentoentidad = cq.from(PersonaDocumentoentidad.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(personaDocumentoentidad, entity), cb.isNotNull(personaDocumentoentidad.get(PersonaDocumentoentidad_.entidadNegocioID)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PersonaEntidadnegocio findEntidadNegocioID(PersonaDocumentoentidad entity) {
        return this.getMergedEntity(entity).getEntidadNegocioID();
    }

    public boolean isTipoDocumentoIDEmpty(PersonaDocumentoentidad entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PersonaDocumentoentidad> personaDocumentoentidad = cq.from(PersonaDocumentoentidad.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(personaDocumentoentidad, entity), cb.isNotNull(personaDocumentoentidad.get(PersonaDocumentoentidad_.tipoDocumentoID)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PersonaTipodocumento findTipoDocumentoID(PersonaDocumentoentidad entity) {
        return this.getMergedEntity(entity).getTipoDocumentoID();
    }
    
}
