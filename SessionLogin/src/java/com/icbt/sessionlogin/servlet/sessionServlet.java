/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.sessionlogin.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author icbt
 */
public class sessionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String username= request.getParameter("username");
        String password= request.getParameter("password");
         PrintWriter out = response.getWriter();
          if("icbt".equals(username) && "icbt".equals(password)){
        HttpSession session=request.getSession();
        session.setAttribute("name",username);
        request.getRequestDispatcher("home.jsp").forward(request,response);
          }
          else{
               response.sendRedirect("index.jsp");
          }
           
         
      
       
       
    }

  
}
