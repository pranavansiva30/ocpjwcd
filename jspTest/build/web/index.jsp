<%-- 
    Document   : index
    Created on : Oct 25, 2014, 3:48:12 PM
    Author     : icbt
--%>


<%@page import="java.util.ArrayList,java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        ArrayList list=new ArrayList();
       HashMap map=new HashMap();
        
        %>
        <%
        for(int i=0;i<5;i++){
            out.println("hi");
           
        
        }
        %>
        <%= "pranavan" %>
        
    </body>
</html>
