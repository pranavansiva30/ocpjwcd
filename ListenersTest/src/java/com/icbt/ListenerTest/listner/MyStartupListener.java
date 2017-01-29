/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.ListenerTest.listner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author icbt
 */
public class MyStartupListener  implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Application Starting up....");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Application Shutting down....");
    }
    
    
}
