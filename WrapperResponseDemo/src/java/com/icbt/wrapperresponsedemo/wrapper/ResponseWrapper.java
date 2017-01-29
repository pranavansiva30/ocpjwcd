/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.wrapperresponsedemo.wrapper;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 *
 * @author icbt
 */
public class ResponseWrapper extends HttpServletResponseWrapper {
   
    private OutputStream myBuffer=new ByteArrayOutputStream();
    private PrintWriter myPrintWriter=new PrintWriter(myBuffer);
    public ResponseWrapper(HttpServletResponse response)
    {
        super(response);
    }
    @Override
    public PrintWriter getWriter()throws IOException{
        return myPrintWriter;
    }
    public String getContents(){
        return myBuffer.toString();
    }
    
}
