<%-- 
    Document   : index
    Created on : Sep 13, 2014, 3:45:18 PM
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
        <form action="ObjectSetServlet" method="post">
            Name:<input type="text" value="" name="name"/><br/>
             Age:<input type="text" value="" name="age"/><br/>
            <input type="submit" value="get"/>
        </form>
    </body>
</html>
