/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.CustomTagDemo.TagHandler;

import java.io.IOException;
import java.util.Calendar;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author icbt
 */
public class TagHandler extends SimpleTagSupport {
    private String user;
    
    

    @Override
    public void doTag() throws JspException, IOException {
        
       Calendar calendar=Calendar.getInstance(); 
       if(Calendar.AM_PM==Calendar.AM){
           getJspContext().getOut().write("hello good morning"+user);
       }
       else{
            getJspContext().getOut().write("hello good evening"+user);
       }
        
    }

    public void setUser(String user) {
        this.user = user;
    }
   
}
