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
import org.primefaces.omega.modelo.OrganizacionRazonsocial;

/**
 *
 * @author fabricio
 */
public class OrganizacionRazonsocialDaoImplements implements OrganizacionRazonsocialDao {

    @Override
    public void InsertarOrganizacionRazonsocial(OrganizacionRazonsocial ObjOrganizacionRazonsociales) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjOrganizacionRazonsociales);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarOrganizacionRazonsocial(OrganizacionRazonsocial ObjOrganizacionRazonsociales) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjOrganizacionRazonsociales);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarOrganizacionRazonsocial(OrganizacionRazonsocial ObjOrganizacionRazonsociales) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjOrganizacionRazonsociales);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarOrganizacionRazonsocial(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaOrganizacionRazonsocial = null;
        try {
            ListaOrganizacionRazonsocial = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaOrganizacionRazonsocial;
    }

    @Override
    public ArrayList LoadTablaOrganizacionRazonsociales() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From OrganizacionRazonsocial";
        ArrayList<OrganizacionRazonsocial> ListaOrganizacionRazonsocial = new ArrayList<>();

        try {

            ListaOrganizacionRazonsocial = (ArrayList<OrganizacionRazonsocial>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaOrganizacionRazonsocial;
    }

}
