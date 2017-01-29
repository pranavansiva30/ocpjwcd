<%-- 
    Document   : index
    Created on : Sep 6, 2014, 3:41:14 PM
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
        <form method="post" action="LoginServlet">
            Username:<input type="text" name="username" /><br/>
            Password:<input type="password" name="password" /><br/>
            <input type="submit" name="login" value="login"/><input type="reset" value="clear"/>
        </form>
    </body>
</html>
