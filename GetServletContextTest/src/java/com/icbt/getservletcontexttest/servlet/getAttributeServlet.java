/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.getservletcontexttest.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool;
import sun.security.krb5.Config;

/**
 *
 * @author icbt
 */
public class getAttributeServlet extends HttpServlet {

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        ServletContext ctx2=getServletContext();
        String name=(String) ctx2.getAttribute("name");
        
        PrintWriter out=response.getWriter();
        out.println("name: "+name);
        out.print(ctx2.getAttribute("myage"));
         
        
        }
    }

   

