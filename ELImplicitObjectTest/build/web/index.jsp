<%-- 
    Document   : index
    Created on : Nov 15, 2014, 3:14:10 PM
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
        <%--
        <form action="view.jsp" method="get">
            gender<input type="text" name="gender"/><br/>
            <input type="submit" value="save"/>
        </form>
        --%>
        <form action="view.jsp" method="get">
            Persons1<input type="checkbox" name="name[]" value="p1" />
            Persons2<input type="checkbox" name="name[]" value="p2" />
             <input type="submit" value="save"/>
        </form>
    </body>
</html>
