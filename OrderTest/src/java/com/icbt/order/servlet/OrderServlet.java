/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.order.servlet;

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
public class OrderServlet extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
         String type= request.getParameter("type");
        String size= request.getParameter("size");
        PrintWriter out = response.getWriter();
        
         out.println("Food type is:" + type);
         out.println("Size is:" + size);
        
        
       
      
    }

  
}
