/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.JSTLLoopTest.Servlet;

import com.icbt.JSTLTest.bean.Person;
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
public class JSTLLoopTestServlet extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         Person p=new Person();
       p.setName("pranavan");
       p.setAge("25");
       
         request.setAttribute("message","this is my message");
         request.setAttribute("person",p);
          String [] names={"Pranavan","Kumar","Prem","Ravi"};
        request.setAttribute("names", names);
       request.getRequestDispatcher("index.jsp").forward(request,response);
        
       
    }

    
}
