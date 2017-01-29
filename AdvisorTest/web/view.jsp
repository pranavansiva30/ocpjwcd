<%-- 
    Document   : view
    Created on : Sep 13, 2014, 2:35:06 PM
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
        <h1>
            <%
            String advice=(String) request.getAttribute("advice");
            out.print(advice);
            
            %>
        </h1>
    </body>
</html>
