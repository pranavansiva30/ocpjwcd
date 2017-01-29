<%-- 
    Document   : view
    Created on : Nov 15, 2014, 3:20:31 PM
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
       <h1>Gender:${param.gender}</h1>
       Browser is:${header["user-agent"]}<br/>
       ${pageContext.request.method}
       persons:${param.name}
       
    </body>
</html>
