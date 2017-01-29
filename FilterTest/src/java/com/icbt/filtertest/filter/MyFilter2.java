/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.filtertest.filter;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author icbt
 */
public class MyFilter2 implements Filter{
private FilterConfig filterConfig;
    public void init(FilterConfig filterConfig) throws ServletException {
       this.filterConfig=filterConfig;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
     //request filter
        System.out.println("Request came through2..");
         PrintWriter out=response.getWriter();
        out.println("my father name is siva");
        
        chain.doFilter(request, response);
        //response filter
        System.out.println("Response came through2.."); 
        
        out.println("my name is pranavan");
        
    }

    public void destroy() {
        
    }
    
}
