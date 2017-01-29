/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.filtertest.servlet;

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
public class TestServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Inside the servlet..");
        PrintWriter out=response.getWriter();
        out.println("filtering");
        //after this didnot send to client
        //out.flush();
        //out.close();
       
        
    }

   
}
