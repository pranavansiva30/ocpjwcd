/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.testparameter;

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
public class TestParameterServlet extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name=request.getParameter("name");
         String age=request.getParameter("age");
        
       String header=request.getHeader("user-agent");
        String method=request.getMethod();
        
        PrintWriter out = response.getWriter();
        out.println("Name is:"+name);
        out.println("Age is:"+age);
        
         out.println("Header is:"+header);
           out.println("Method is:"+method);
            out.println(request.isSecure());
       
       
    }

 
}
