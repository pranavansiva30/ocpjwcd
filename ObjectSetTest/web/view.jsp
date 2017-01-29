<%-- 
    Document   : view
    Created on : Sep 13, 2014, 4:06:16 PM
    Author     : icbt
--%>

<%@page import="com.icbt.objectsettest.servlet.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
             User user= (User) request.getAttribute("user");
            out.println("Age: "+user.getAge()+"<br/>");
             out.println("Name: "+user.getName());
            
            %></h1>
    </body>
</html>
