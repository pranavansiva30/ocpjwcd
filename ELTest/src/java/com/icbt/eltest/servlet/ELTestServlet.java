/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.eltest.servlet;

import com.icbt.eltest.bean.Dog;
import com.icbt.eltest.bean.Person;
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
public class ELTestServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Person p=new Person();
       p.setName("pranavan");
       p.setAge("25");
       
       Dog d=new Dog();
       d.setName("lika");
       d.setColor("black");
       p.setDog(d);
       
        Person p2=new Person();
       p2.setName("siva");
       p2.setAge("25");
       request.setAttribute("person", p);
       request.getSession().setAttribute("person", p2);
       String[] arr={ "a","b","c"};
       request.setAttribute("arr", arr);
        request.setAttribute("my.err","abc");
       
       request.getRequestDispatcher("view.jsp").forward(request,response);
       
    }

    
}
