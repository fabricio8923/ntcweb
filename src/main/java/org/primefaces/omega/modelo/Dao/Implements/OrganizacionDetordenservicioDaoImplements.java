/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao.Implements;

import org.primefaces.omega.modelo.Dao.*;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.primefaces.omega.Util.NewHibernateUtil;
import org.primefaces.omega.modelo.OrganizacionDetordenservicio;
import org.primefaces.omega.modelo.OrganizacionServicio;

/**
 *
 * @author fabricio
 */
public class OrganizacionDetordenservicioDaoImplements implements OrganizacionDetordenservicioDao {

    @Override
    public void InsertarOrganizacionDetordenservicio(OrganizacionDetordenservicio ObjOrganizacionDetordenservicios) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjOrganizacionDetordenservicios);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarOrganizacionDetordenservicio(OrganizacionDetordenservicio ObjOrganizacionDetordenservicios) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjOrganizacionDetordenservicios);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarOrganizacionDetordenservicio(OrganizacionDetordenservicio ObjOrganizacionDetordenservicios) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjOrganizacionDetordenservicios);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarOrganizacionDetordenservicio(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaOrganizacionDetordenservicio = null;
        try {
            ListaOrganizacionDetordenservicio = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaOrganizacionDetordenservicio;
    }

    @Override
    public ArrayList LoadTablaOrganizacionDetordenservicios() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From OrganizacionDetordenservicio";
        ArrayList<OrganizacionDetordenservicio> ListaOrganizacionDetordenservicio = new ArrayList<>();

        try {

            ListaOrganizacionDetordenservicio = (ArrayList<OrganizacionDetordenservicio>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaOrganizacionDetordenservicio;
    }

}
