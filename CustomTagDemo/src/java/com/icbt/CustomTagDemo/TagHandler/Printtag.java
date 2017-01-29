/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.CustomTagDemo.TagHandler;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author icbt
 */
public class Printtag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
       getJspBody().invoke(null);
    }
    
   
    
}
