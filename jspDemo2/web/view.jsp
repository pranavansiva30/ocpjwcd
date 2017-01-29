<%-- 
    Document   : view
    Created on : Nov 1, 2014, 2:51:28 PM
    Author     : icbt
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1><%
          List<String> studentList=(List<String>)request.getAttribute("studentList");
          
          for(String student:studentList){
            out.print(student+"<br/>");
                       }
            
            %></h1>
    </body>
</html>
