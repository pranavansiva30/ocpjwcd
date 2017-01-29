/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.luckynumber.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author icbt
 */
public class LuckyNumberServlet extends HttpServlet {
Map<Character,Integer>characterMap=new HashMap<Character,Integer>();

    @Override
    public void init() throws ServletException {
      characterMap.put('a',1);
      characterMap.put('b',2);
      characterMap.put('c',3);
      characterMap.put('d',4);
      characterMap.put('e',5);
      characterMap.put('f',6);
      characterMap.put('g',7);
      characterMap.put('h',8);
      characterMap.put('i',9);
      characterMap.put('j',10);
      characterMap.put('k',11);
      characterMap.put('l',12);
      characterMap.put('m',13);
      characterMap.put('n',14);
      characterMap.put('o',15);
      characterMap.put('p',16);
      characterMap.put('q',17);
      characterMap.put('r',18);
      characterMap.put('s',19);
      characterMap.put('t',20);
      characterMap.put('u',21);
      characterMap.put('v',22);
      characterMap.put('w',23);
      characterMap.put('x',24);
      characterMap.put('y',25);
      characterMap.put('z',26);
      
      
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String name= request.getParameter("name");
       char[] characters=name.toLowerCase().toCharArray();
       int total=0;
       for(char c: characters){
           int val=characterMap.get(c);
           total+=val;
       }
        PrintWriter out = response.getWriter();
        
        int luckyNo=total;
        
          request.setAttribute("luckyno",luckyNo);
      request.getRequestDispatcher("view.jsp").forward(request,response);
      
    }

}
