<%-- 
    Document   : index
    Created on : Nov 1, 2014, 2:14:53 PM
    Author     : icbt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Find Student Page</title>
    </head>
    <body>
        <form action="FindStudentServlet" method="post">
            Lecturer Name:<input type="text" name="lecturerName"/><br/>
            <input type="submit" value="Get Students"/>
            
        </form>
    </body>
</html>
