/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.wrapperdemo.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 *
 * @author icbt
 */
public class RequestWrapper extends HttpServletRequestWrapper  {
    public RequestWrapper(HttpServletRequest request){
        super(request);
    }
    @Override
        public String getHeader(String name){
        return "pranavan browser";
    }
        
    }
    

