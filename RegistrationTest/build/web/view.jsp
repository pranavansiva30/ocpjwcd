<%-- 
    Document   : view
    Created on : Nov 1, 2014, 3:27:25 PM
    Author     : icbt
--%>

<%@page import="com.icbt.RegistrationTest.model.BeanModel"%>
<%@page import="javax.enterprise.inject.spi.Bean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>user details</h1>
        <%/*
             BeanModel bean=(BeanModel) request.getAttribute("Bean");
           
             out.println("Name: "+bean.getUsername());
              out.println("Age: "+bean.getAge()+"<br/>");
              out.println("Email: "+bean.getEmail());
            */
            %>
            
            <jsp:useBean id="Bean" class="com.icbt.RegistrationTest.model.BeanModel" scope="request">
           
             Name:<jsp:setProperty name="Bean" property="username" value="siva" />
               Age:<jsp:setProperty name="Bean" property="age" value="20"/>
              Email:<jsp:setProperty name="Bean" property="email" value="pranavan@yahoo.com "/>
            </jsp:useBean>
           
             Name:<jsp:getProperty name="Bean" property="username" />
             Age:<jsp:getProperty name="Bean" property="age" />
              Email:<jsp:getProperty name="Bean" property="email" />
    </body>
</html>
