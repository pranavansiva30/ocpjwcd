/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.flushtest.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author icbt
 */
public class FlushTestServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        PrintWriter out = response.getWriter();
        
       out.println("hi");
       out.flush();
       
       response.sendRedirect("http://www.google.lk");
        //
    }

  

 
}
