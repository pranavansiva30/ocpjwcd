/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.objectsettest.servlet;

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
public class ObjectSetServlet extends HttpServlet {
   

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username= request.getParameter("name");
         int age=Integer.parseInt(request.getParameter("age"));
       User user= new User();
       user.setAge(age);
       user.setName(username);
       request.setAttribute("user",user);
       request.getRequestDispatcher("view.jsp").forward(request,response);
       
         
         
        
        
        
    }

  
}

