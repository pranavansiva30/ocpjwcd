<%-- 
    Document   : index
    Created on : Nov 15, 2014, 4:05:42 PM
    Author     : icbt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="header.jsp">
  <jsp:param name="username" value="joe"/>
</jsp:include>
    <body>
        <h1>Hello World!</h1>
        <%@ include file="footer.jsp"%>
    <%--    <jsp:include page="footer.jsp" /> --%>
   
