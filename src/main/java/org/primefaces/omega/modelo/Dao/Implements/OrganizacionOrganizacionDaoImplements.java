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
import org.primefaces.omega.modelo.OrganizacionCliente;
import org.primefaces.omega.modelo.OrganizacionOrganizacion;

/**
 *
 * @author fabricio
 */
public class OrganizacionOrganizacionDaoImplements implements OrganizacionOrganizacionDao {

    @Override
    public void InsertarOrganizacionOrganizacion(OrganizacionOrganizacion ObjOrganizacionOrganizaciones) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjOrganizacionOrganizaciones);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarOrganizacionOrganizacion(OrganizacionOrganizacion ObjOrganizacionOrganizaciones) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjOrganizacionOrganizaciones);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarOrganizacionOrganizacion(OrganizacionOrganizacion ObjOrganizacionOrganizaciones) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjOrganizacionOrganizaciones);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarOrganizacionOrganizacion(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaOrganizacionOrganizacion = null;
        try {
            ListaOrganizacionOrganizacion = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaOrganizacionOrganizacion;
    }

    @Override
    public ArrayList LoadTablaOrganizacionOrganizaciones() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From OrganizacionOrganizacion";
        ArrayList<OrganizacionOrganizacion> ListaOrganizacionOrganizacion = new ArrayList<>();

        try {

            ListaOrganizacionOrganizacion = (ArrayList<OrganizacionOrganizacion>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaOrganizacionOrganizacion;
    }

}
