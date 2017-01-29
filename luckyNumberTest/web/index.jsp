<%-- 
    Document   : index
    Created on : Sep 13, 2014, 2:44:49 PM
    Author     : icbt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lucky Number</title>
    </head>
    <body>
        <form action="LuckyNumberServlet" method="post">
            Name:<input type="text" value="" name="name"/><br/>
            <input type="submit" value="get"/>
        </form>
    </body>
</html>
