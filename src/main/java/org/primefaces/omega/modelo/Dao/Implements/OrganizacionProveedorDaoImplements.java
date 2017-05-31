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
import org.primefaces.omega.modelo.OrganizacionProveedor;

/**
 *
 * @author fabricio
 */
public class OrganizacionProveedorDaoImplements implements OrganizacionProveedorDao {

    @Override
    public void InsertarOrganizacionProveedor(OrganizacionProveedor ObjOrganizacionProveedores) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjOrganizacionProveedores);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }

    }

    @Override
    public void EliminarOrganizacionProveedor(OrganizacionProveedor ObjOrganizacionProveedores) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjOrganizacionProveedores);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarOrganizacionProveedor(OrganizacionProveedor ObjOrganizacionProveedores) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjOrganizacionProveedores);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarOrganizacionProveedor(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaOrganizacionProveedor = null;
        try {
            ListaOrganizacionProveedor = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaOrganizacionProveedor;
    }

    @Override
    public ArrayList LoadTablaOrganizacionProveedores() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From OrganizacionProveedor";
        ArrayList<OrganizacionProveedor> ListaOrganizacionProveedor = new ArrayList<>();

        try {

            ListaOrganizacionProveedor = (ArrayList<OrganizacionProveedor>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaOrganizacionProveedor;
    }

}
