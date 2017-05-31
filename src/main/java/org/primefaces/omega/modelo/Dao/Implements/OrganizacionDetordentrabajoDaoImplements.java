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
import org.primefaces.omega.modelo.OrganizacionDetordentrabajo;

/**
 *
 * @author fabricio
 */
public class OrganizacionDetordentrabajoDaoImplements implements OrganizacionDetordentrabajoDao {

    @Override
    public void InsertarOrganizacionDetordentrabajo(OrganizacionDetordentrabajo ObjOrganizacionDetordentrabajos) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjOrganizacionDetordentrabajos);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarOrganizacionDetordentrabajo(OrganizacionDetordentrabajo ObjOrganizacionDetordentrabajos) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjOrganizacionDetordentrabajos);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarOrganizacionDetordentrabajo(OrganizacionDetordentrabajo ObjOrganizacionDetordentrabajos) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjOrganizacionDetordentrabajos);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarOrganizacionDetordentrabajo(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaOrganizacionDetordentrabajo = null;
        try {
            ListaOrganizacionDetordentrabajo = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaOrganizacionDetordentrabajo;
    }

    @Override
    public ArrayList LoadTablaOrganizacionDetordentrabajos() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From OrganizacionDetordentrabajo";
        ArrayList<OrganizacionDetordentrabajo> ListaOrganizacionDetordentrabajo = new ArrayList<>();

        try {

            ListaOrganizacionDetordentrabajo = (ArrayList<OrganizacionDetordentrabajo>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaOrganizacionDetordentrabajo;
    }

}
