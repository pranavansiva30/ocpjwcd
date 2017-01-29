<%-- 
    Document   : ex2
    Created on : Oct 25, 2014, 4:59:46 PM
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
         <%! int x=0; %>
        <%=++x %>
        <%!
       public void jspInit(){
            System.out.println("Initializing...");
                             }
        public void jspDestroy()
                               {
            System.out.println("Destroying...");
        }
        
        %>
    </body>
</html>
