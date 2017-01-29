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
public class ioopTag extends SimpleTagSupport{
    private int rounds;

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    @Override
    public void doTag() throws JspException, IOException {
        for (int i = 0; i < rounds; i++) {
            getJspContext().getOut().write("hello round"+i);
            
        }
    }
    
    
}
