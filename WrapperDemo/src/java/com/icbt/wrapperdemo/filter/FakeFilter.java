/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.wrapperdemo.filter;

import com.icbt.wrapperdemo.wrapper.RequestWrapper;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author icbt
 */
public class FakeFilter implements Filter {
    private FilterConfig filterConfig;

    public void init(FilterConfig filterConfig) throws ServletException {
         this.filterConfig=filterConfig;
       
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
       System.out.println("Indide filter->request path");
       RequestWrapper myFakeRequest=new RequestWrapper((HttpServletRequest)request);
       chain.doFilter(myFakeRequest, response);
        System.out.println("Indide filter->request path");
    }

    public void destroy() {
        
    }
    
}
