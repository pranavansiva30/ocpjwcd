/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.wrapperresponsedemo.filter;

import com.icbt.wrapperresponsedemo.wrapper.ResponseWrapper;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author icbt
 */
public class FakeFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
      
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
       ResponseWrapper myFakeResponse=new ResponseWrapper((HttpServletResponse)response);
       chain.doFilter(request, myFakeResponse);
       PrintWriter out=response.getWriter();
       out.print("<html>");
        out.print("<body color='red'>");
        out.print(myFakeResponse.getContents()+"pranavan");
        out.print("</body></html>");
        
    }

    public void destroy() {
        
    }
    
}
