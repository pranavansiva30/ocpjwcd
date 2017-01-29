<%-- 
    Document   : view
    Created on : Nov 1, 2014, 5:35:03 PM
    Author     : icbt
--%>

<%@page import="org.hibernate.validator.constraints.Email"%>
<%@page import="java.util.jar.Attributes.Name"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
               <jsp:useBean id="user" class="com.icbt.demo.bean.User" scope="request">
                   <%--
                    <jsp:setProperty name="user" property="username" value='<%= request.getParameter("userName") %>' />
              
             
             <jsp:setProperty name="user" property="email" param="email"/> --%>
              <jsp:setProperty name="user" property="*"/>
             
                       </jsp:useBean>
                       
       
        Name:<jsp:getProperty name="user" property="username"/>
            
              Email:<jsp:getProperty name="user" property="email"/>
       
              
       
    </body>
</html>
