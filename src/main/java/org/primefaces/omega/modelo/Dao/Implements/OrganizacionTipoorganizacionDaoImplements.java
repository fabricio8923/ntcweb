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
import org.primefaces.omega.modelo.OrganizacionTipoorganizacion;

/**
 *
 * @author fabricio
 */
public class OrganizacionTipoorganizacionDaoImplements implements OrganizacionTipoorganizacionDao {

    @Override
    public void InsertarOrganizacionTipoorganizacion(OrganizacionTipoorganizacion ObjOrganizacionTipoorganizaciones) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjOrganizacionTipoorganizaciones);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarOrganizacionTipoorganizacion(OrganizacionTipoorganizacion ObjOrganizacionTipoorganizaciones) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjOrganizacionTipoorganizaciones);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarOrganizacionTipoorganizacion(OrganizacionTipoorganizacion ObjOrganizacionTipoorganizaciones) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjOrganizacionTipoorganizaciones);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarOrganizacionTipoorganizacion(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaOrganizacionTipoorganizacion = null;
        try {
            ListaOrganizacionTipoorganizacion = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaOrganizacionTipoorganizacion;
    }

    @Override
    public ArrayList LoadTablaOrganizacionTipoorganizaciones() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From OrganizacionTipoorganizacion";
        ArrayList<OrganizacionTipoorganizacion> ListaOrganizacionTipoorganizacion = new ArrayList<>();

        try {

            ListaOrganizacionTipoorganizacion = (ArrayList<OrganizacionTipoorganizacion>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaOrganizacionTipoorganizacion;
    }

}
