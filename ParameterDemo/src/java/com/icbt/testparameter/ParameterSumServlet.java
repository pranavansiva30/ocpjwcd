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
public class ParameterSumServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String param1 = request.getParameter("param1");
        String param2 = request.getParameter("param2");
        String param3 = request.getParameter("param3");
        PrintWriter out = response.getWriter();

        if (param1 != null && param2 != null && param3 != null) {
            try {
                int sum = Integer.parseInt(param1) + Integer.parseInt(param2) + Integer.parseInt(param3);

                out.println("Sum is:" + sum);
            } catch (NumberFormatException e) {
                out.print("Invalid parameter");

            }
        } else {
            out.print("Invalid parameter");
        }
    }
}
