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
import org.primefaces.omega.modelo.LogisticaUsodireccion;

/**
 *
 * @author fabricio
 */
public class LogisticaUsodireccionDaoImplements implements LogisticaUsodireccionDao {

    @Override
    public void InsertarLogisticaUsodireccion(LogisticaUsodireccion ObjLogisticaUsodirecciones) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjLogisticaUsodirecciones);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarLogisticaUsodireccion(LogisticaUsodireccion ObjLogisticaUsodirecciones) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjLogisticaUsodirecciones);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarLogisticaUsodireccion(LogisticaUsodireccion ObjLogisticaUsodirecciones) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjLogisticaUsodirecciones);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarLogisticaUsodireccion(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaLogisticaUsodireccion = null;
        try {
            ListaLogisticaUsodireccion = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaLogisticaUsodireccion;
    }

    @Override
    public ArrayList LoadTablaLogisticaUsodirecciones() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From LogisticaUsodireccion";
        ArrayList<LogisticaUsodireccion> ListaLogisticaUsodireccion = new ArrayList<>();

        try {

            ListaLogisticaUsodireccion = (ArrayList<LogisticaUsodireccion>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaLogisticaUsodireccion;

    }

}
