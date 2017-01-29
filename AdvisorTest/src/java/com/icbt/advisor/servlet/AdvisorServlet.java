/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.advisor.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author icbt
 * 
 */
public class AdvisorServlet extends HttpServlet {
    String[] boyAdvices={"B1","B2","B3"};
     String[] girlAdvices={"G1","G2","G3"};

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String gender= request.getParameter("gender");
         PrintWriter out = response.getWriter();
         
         int randomNo=new Random().nextInt(3);
         String advice="";
         if("male".equals(gender)){
             
             advice=boyAdvices[randomNo];
         }
         else if("female".equals(gender)){
               advice=girlAdvices[randomNo];
         }
         else{
            advice="no advise";
         }
        
      request.setAttribute("advice",advice);
      request.getRequestDispatcher("view.jsp").forward(request,response);
    }

   
}
