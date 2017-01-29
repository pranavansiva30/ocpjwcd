<%-- 
    Document   : view
    Created on : Nov 22, 2014, 4:21:05 PM
    Author     : icbt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <title>JSP Page</title>
    </head>
    <body>
       <c:catch var="ex">
                      <% int x=10/0; %>
             </c:catch>
                 <c:if test="${ex!=null}">
                     ${message}
                 </c:if>
    </body>
</html>
