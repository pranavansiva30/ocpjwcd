/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.bookstore.Servlet;

import com.icbt.bookstore.bean.User;
import com.icbt.bookstore.db.DataPersistor;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author icbt
 */
public class RegistrationServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String firstname=request.getParameter("firstname");
          String lastname=request.getParameter("lastname");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String email=request.getParameter("email");
       
        if(firstname==null ||lastname==null ||username==null ||password==null ||email==null ||firstname.trim().length()==0||lastname.trim().length()==0||username.trim().length()==0
                ||password.trim().length()==0 ||firstname.trim().length()==0 ||email.trim().length()==0)
        {
            request.setAttribute("error","all fields mandotary");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
        
        User user=new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setUserlevel("user");
       
       
        DataPersistor dataPersistor=new DataPersistor();
        dataPersistor.InsertUser(user);
          ResultSet rs=dataPersistor.GetUsers();
             response.setContentType("text/html");
          PrintWriter out = response.getWriter();
        try {
            while( rs.next()){
                 //Retrieve by column name
            username= rs.getString("username");
            password = rs.getString("password");
            firstname= rs.getString("firstname");
            email=rs.getString("email");
            lastname = rs.getString("lastname");
       
            //Display values
            out.println("username: " +username+ "<br>");
            out.println(",password: " +password+ "<br>");
            out.println(",firstname: " + firstname + "<br>");
            out.println(", email: " + email + "<br>");
             out.println(",lastname: " + lastname + "<br>");
              

         // Clean-up environment
        

            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            out.println("</body></html>");
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        }
      
        
        
    }

  

