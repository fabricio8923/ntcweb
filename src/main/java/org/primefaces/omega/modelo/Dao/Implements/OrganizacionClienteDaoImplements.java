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

/**
 *
 * @author fabricio
 */
public class OrganizacionClienteDaoImplements implements OrganizacionClienteDao {

    @Override
    public void InsertarOrganizacionCliente(OrganizacionCliente ObjOrganizacionClientes) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjOrganizacionClientes);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarOrganizacionCliente(OrganizacionCliente ObjOrganizacionClientes) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjOrganizacionClientes);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarOrganizacionCliente(OrganizacionCliente ObjOrganizacionClientes) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjOrganizacionClientes);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarOrganizacionCliente(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaOrganizacionCliente = null;
        try {
            ListaOrganizacionCliente = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaOrganizacionCliente;
    }

    @Override
    public ArrayList LoadTablaOrganizacionClientes() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From OrganizacionCliente";
        ArrayList<OrganizacionCliente> ListaOrganizacionCliente = new ArrayList<>();

        try {

            ListaOrganizacionCliente = (ArrayList<OrganizacionCliente>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaOrganizacionCliente;
    }

}
