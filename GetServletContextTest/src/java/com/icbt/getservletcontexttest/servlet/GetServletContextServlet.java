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

/**
 *
 * @author icbt
 */
public class GetServletContextServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       PrintWriter out=response.getWriter();
       ServletContext ctx=getServletContext();
       ctx.setAttribute("name", "pranavan");
        ctx.setAttribute("myage", 100);
        ServletConfig config=getServletConfig();
        out.print(config.getServletName());
        
         out.print(config.getInitParameter("adminEmail"));
         out.print( ctx.getInitParameter("adminEmail"));
       
        
    }

   
}
