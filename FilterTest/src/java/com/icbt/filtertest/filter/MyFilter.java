/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.filtertest.filter;

import java.io.IOException;
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
public class MyFilter implements Filter {
 private FilterConfig filterConfig;
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig=filterConfig;
      
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
      //request filter
        System.out.println("Request came through..");
        chain.doFilter(request, response);
        //response filter
        System.out.println("Response came through..");
        
    }

    public void destroy() {
       
    }
    
}
