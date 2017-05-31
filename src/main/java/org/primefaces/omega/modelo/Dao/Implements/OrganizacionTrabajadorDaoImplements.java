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
import org.primefaces.omega.modelo.OrganizacionTrabajador;

/**
 *
 * @author fabricio
 */
public class OrganizacionTrabajadorDaoImplements implements OrganizacionTrabajadorDao {

    @Override
    public void InsertarOrganizacionTrabajador(OrganizacionTrabajador ObjOrganizacionTrabajadores) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjOrganizacionTrabajadores);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarOrganizacionTrabajador(OrganizacionTrabajador ObjOrganizacionTrabajadores) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjOrganizacionTrabajadores);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarOrganizacionTrabajador(OrganizacionTrabajador ObjOrganizacionTrabajadores) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjOrganizacionTrabajadores);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarOrganizacionTrabajador(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaOrganizacionTrabajador = null;
        try {
            ListaOrganizacionTrabajador = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaOrganizacionTrabajador;
    }

    @Override
    public ArrayList LoadTablaOrganizacionTrabajadores() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From OrganizacionTrabajador";
        ArrayList<OrganizacionTrabajador> ListaOrganizacionTrabajador = new ArrayList<>();

        try {

            ListaOrganizacionTrabajador = (ArrayList<OrganizacionTrabajador>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaOrganizacionTrabajador;
    }

}
