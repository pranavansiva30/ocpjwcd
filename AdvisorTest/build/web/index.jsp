<%-- 
    Document   : index
    Created on : Sep 6, 2014, 5:32:34 PM
    Author     : icbt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Advisor</title>
    </head>
    <body>
        <h3>Advisor</h3>
        <form action="AdvisorServlet" method="post">
            I'm a <select name="gender">
                <option value="male">male</option>
                <option value="female">female</option>
            </select>
            and I need an advise from Prof.krishan.<br/>
            <input type="submit" value="GetAdvise"/>
        </form>
    </body>
</html>
