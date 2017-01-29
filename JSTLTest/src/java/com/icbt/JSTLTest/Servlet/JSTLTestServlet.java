/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.JSTLTest.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author icbt
 */
public class JSTLTestServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String [] names={"Taniya","Tan","Taniyaka","kumar"};
        request.setAttribute("names", names);
       request.getRequestDispatcher("index.jsp").forward(request,response);
       
    }

   
}
