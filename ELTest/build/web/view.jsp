<%-- 
    Document   : view
    Created on : Nov 15, 2014, 2:25:43 PM
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
        <h1>Person Details</h1>
        <jsp:useBean id="person" class="com.icbt.eltest.bean.Person" scope="request"/>
        Person Name:<jsp:getProperty name="person" property="name"/><br/>
        Person Age:<jsp:getProperty name="person" property="age"/><br/>
        
         Person's dog's name:${person.dog.name}<br/>
         Person's dog's color:${person.dog.color}
         <br/>
         <h1> getting with scope</h1>
        Session scope Person's name:${sessionScope.person.name}<br/>
         Session scope Person's age:${sessionScope.person.age}<br/>
         Request scope Person's name:${requestScope.person.name}<br/>
         Request scope Person's age:${requestScope.person.age}<br/>
         Request scope Person's dogname:${requestScope.person.dog.name}<br/>
         1st Element:${arr[0]};<br/>
         2nd Element:${arr[1]};<br/>
         3rd Element:${arr[2]};<br/>
         ${requestScope["my.err"]}<br/>
         ${5+5}<br/>
         ${10/2}=${10 div 2}
    </body>
</html>
