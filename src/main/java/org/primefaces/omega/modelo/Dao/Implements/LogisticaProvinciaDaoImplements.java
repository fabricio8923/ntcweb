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
import org.primefaces.omega.modelo.LogisticaProvincia;

/**
 *
 * @author fabricio
 */
public class LogisticaProvinciaDaoImplements implements LogisticaProvinciaDao {

    @Override
    public void InsertarLogisticaProvincia(LogisticaProvincia ObjLogisticaProvincias) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjLogisticaProvincias);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarLogisticaProvincia(LogisticaProvincia ObjLogisticaProvincias) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjLogisticaProvincias);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarLogisticaProvincia(LogisticaProvincia ObjLogisticaProvincias) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjLogisticaProvincias);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarLogisticaProvincia(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaLogisticaProvincia = null;
        try {
            ListaLogisticaProvincia = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaLogisticaProvincia;
    }

    @Override
    public ArrayList LoadTablaLogisticaProvincias() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From LogisticaProvincia";
        ArrayList<LogisticaProvincia> ListaLogisticaProvincia = new ArrayList<>();

        try {

            ListaLogisticaProvincia = (ArrayList<LogisticaProvincia>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaLogisticaProvincia;
    }

}
