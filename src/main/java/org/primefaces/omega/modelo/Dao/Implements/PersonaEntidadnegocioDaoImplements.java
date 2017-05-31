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
import org.primefaces.omega.modelo.PersonaEntidadnegocio;

/**
 *
 * @author fabricio
 */
public class PersonaEntidadnegocioDaoImplements implements PersonaEntidadnegocioDao {

    @Override
    public void InsertarPersonaEntidadnegocio(PersonaEntidadnegocio ObjPersonaEntidadnegocios) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjPersonaEntidadnegocios);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarPersonaEntidadnegocio(PersonaEntidadnegocio ObjPersonaEntidadnegocios) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjPersonaEntidadnegocios);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarPersonaEntidadnegocio(PersonaEntidadnegocio ObjPersonaEntidadnegocios) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjPersonaEntidadnegocios);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarPersonaEntidadnegocio(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaPersonaEntidadnegocio = null;
        try {
            ListaPersonaEntidadnegocio = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaPersonaEntidadnegocio;
    }

    @Override
    public ArrayList LoadTablaPersonaEntidadnegocios() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From PersonaEntidadnegocio";
        ArrayList<PersonaEntidadnegocio> ListaPersonaEntidadnegocio = new ArrayList<>();

        try {

            ListaPersonaEntidadnegocio = (ArrayList<PersonaEntidadnegocio>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaPersonaEntidadnegocio;
    }

}
