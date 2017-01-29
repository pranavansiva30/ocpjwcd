
<%-- 
    Document   : home
    Created on : Oct 25, 2014, 2:52:51 PM
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
      <h1><%
             String username=(String)session.getAttribute("name");
            if(username!=null && !username.isEmpty()){
            out.print(username);
                       }
                         else{
                 response.sendRedirect("index.jsp");
                         }
            %></h1>
            <br/><br/>
            <a href="LogoutServlet">Logout</a>
    </body>
</html>
