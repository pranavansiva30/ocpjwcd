/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.CustomTagDemo.TagHandler;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author icbt
 */
public class classicTag extends TagSupport  {
    @Override
    public int doStartTag()
    {
       // return EVAL_BODY_INCLUDE;
        return SKIP_BODY;
    }
    @Override
    public int doEndTag() throws JspException{
    return EVAL_PAGE;
    }
    
    
    
}
