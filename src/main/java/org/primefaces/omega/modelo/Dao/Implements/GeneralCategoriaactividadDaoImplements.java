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
import org.primefaces.omega.modelo.GeneralCategoriaactividad;

/**
 *
 * @author fabricio
 */
public class GeneralCategoriaactividadDaoImplements implements GeneralCategoriaactividadDao {

    public int valor;

    @Override
    public void InsertarGeneralCategoriaactividad(GeneralCategoriaactividad ObjGeneralCategoriaactividades) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjGeneralCategoriaactividades);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarGeneralCategoriaactividad(GeneralCategoriaactividad ObjGeneralCategoriaactividades) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjGeneralCategoriaactividades);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarGeneralCategoriaactividad(GeneralCategoriaactividad ObjGeneralCategoriaactividades) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjGeneralCategoriaactividades);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }

    }

    @Override
    public ArrayList BuscarGeneralCategoriaactividad(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaGeneralCategoriaactividad = null;
        try {
            ListaGeneralCategoriaactividad = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaGeneralCategoriaactividad;
    }

    @Override
    public ArrayList LoadTablaGeneralCategoriaactividades() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From GeneralCategoriaactividad";
        ArrayList<GeneralCategoriaactividad> ListaGeneralCategoriaactividad = new ArrayList<>();

        try {

            ListaGeneralCategoriaactividad = (ArrayList<GeneralCategoriaactividad>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaGeneralCategoriaactividad;
    }
}
