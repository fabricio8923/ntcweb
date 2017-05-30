/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author fabricio
 */
public class NewHibernateUtil {
    
    private final static NewHibernateUtil instance = new NewHibernateUtil();
    private static SessionFactory factory;
 
    private NewHibernateUtil() {
               
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
                configure("hibernate.cfg.xml").
                build();
        factory =new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory(); ;
    }
 
    public static Session getSession() {
        return getInstance().factory.getCurrentSession();
    }
 
    private static NewHibernateUtil getInstance() {
        return instance;
    }

   
}
