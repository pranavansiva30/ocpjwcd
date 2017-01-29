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

/**
 *
 * @author icbt
 */
public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //invalidate the session
        request.getSession().invalidate();
        
        //redirect to index page
        
        response.sendRedirect("index.jsp");
       
        
    }

   
}
