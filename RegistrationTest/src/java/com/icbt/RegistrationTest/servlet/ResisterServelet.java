/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.RegistrationTest.servlet;

import com.icbt.RegistrationTest.model.BeanModel;
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
public class ResisterServelet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String username= request.getParameter("userName");
          String email= request.getParameter("email");
         int age=Integer.parseInt(request.getParameter("age"));
         
          BeanModel bean= new BeanModel();
       bean.setAge(age);
       bean.setUsername(username);
       bean.setEmail(email);
       request.setAttribute("Bean",bean);
       request.getRequestDispatcher("view.jsp").forward(request,response);
        
        
    }

   
}
