/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.bookstore.listener;

import com.icbt.bookstore.db.DbConnector;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author icbt
 */
public class StartupListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        String dburl = context.getInitParameter("dburl");
        String dbusername = context.getInitParameter("dbusername");
        String dbpassword;
        dbpassword = context.getInitParameter("dbpassword");
        System.out.println(dburl + dbusername + dbpassword);
        System.out.println("Application Starting up....");
        DbConnector.createConnection(dburl, dbusername, dbpassword);
        //DbConnector.closeConnection();
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Application Shutting down....");
    }
}
