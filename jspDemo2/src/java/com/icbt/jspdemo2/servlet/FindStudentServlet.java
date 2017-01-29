/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.jspdemo2.servlet;

import com.icbt.jspdemo2.model.LecturerModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author icbt
 */
public class FindStudentServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String lecturerName=request.getParameter("lecturerName");
      LecturerModel student;
        student = new LecturerModel();
         List <String> studentList=student.getStudentList(lecturerName);
        
        request.setAttribute("studentList",studentList);
       request.getRequestDispatcher("view.jsp").forward(request,response);
      
    }

   
}
