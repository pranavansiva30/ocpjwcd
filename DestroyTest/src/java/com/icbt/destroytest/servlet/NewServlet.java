/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.destroytest.servlet;

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
public class NewServlet extends HttpServlet {

  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       System.out.println("Inside the get method...");
       
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Initializing...");
    }

    @Override
    public void destroy() {
        System.out.println("Destroying...");
        
    }

   

   
}