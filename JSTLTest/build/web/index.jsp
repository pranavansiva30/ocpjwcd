<%-- 
    Document   : index
    Created on : Nov 15, 2014, 4:53:30 PM
    Author     : icbt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <c:forEach var="name" items="${names}">
                ${name}<br/>
            </c:forEach>
        </h1>
    </body>
</html>
