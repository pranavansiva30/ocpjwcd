<%-- 
    Document   : index
    Created on : Nov 1, 2014, 3:17:24 PM
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
       <form action="ResisterServelet" method="post">
            UserName:<input type="text" name="userName"/><br/>
             Age:<input type="text" name="age"/><br/>
              Email:<input type="text" name="email"/><br/>
            <input type="submit" value="Register"/>
            
        </form>
    </body>
</html>
