<%-- 
    Document   : view
    Created on : Sep 13, 2014, 2:56:53 PM
    Author     : icbt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
            Integer luckyno=(Integer)request.getAttribute("luckyno");
            out.print(luckyno);
            
            %></h1>
    </body>
</html>
