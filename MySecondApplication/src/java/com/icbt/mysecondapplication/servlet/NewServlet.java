/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.mysecondapplication.servlet;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DateTimeDV;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author icbt
 */
public class NewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        PrintWriter out=response.getWriter();
        
        Calendar calendar=Calendar.getInstance();
        
        if(calendar.get(Calendar.AM_PM)==Calendar.AM)
        {
             out.println("good morning");
        }
        else{
             out.println("good evening");
        }
       
      
        
        
    }

    
}
