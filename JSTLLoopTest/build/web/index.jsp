<%-- 
    Document   : index
    Created on : Nov 22, 2014, 2:07:47 PM
    Author     : icbt
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8" errorPage=""%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
       String[] arr=(String[])request.getAttribute("names");
      
         for(String nm:arr)
                       {
            %>
            <%= nm %><br/>
            <%
        }
            %>
            
            <table>
                <c:forEach var="nm" items="${names}" varStatus="nameCount">
                    <c:if test="${nameCount.count>1}">
                     <tr><td>${2*nameCount.count-1}</td></tr>   
                    </c:if> 
                     <c:if test="${nameCount.count==1}">
                     <tr><td>${nameCount.count}</td></tr>   
                    </c:if> 
                    
                     <tr><td>${nm}</td></tr>
                </c:forEach>
                      <c:forEach var="nm" items="${names}" varStatus="nameCount">
                    <c:if test="${nameCount.count==1}">
                    <tr><td>${nm}</td></tr>  
                    </c:if> 
                     
                </c:forEach>
            </table>
              <table>
            <c:forEach var="nm" items="${names}" varStatus="nameCount">
                <c:choose>
                    <c:when test="${nameCount.count==2}">
                    <tr><td>${nm}</td></tr>  
                    </c:when> 
                    <c:otherwise>
                        <tr><td>they are not number2 ${nm}</td></tr> 
                    </c:otherwise>
                    </c:choose> 
                </c:forEach>
              </table>
            <c:set var="color" value="blue" scope="request"/>
            color is ${color}<br/>
            name is ${person.name}<br/>
             age is ${person.age}<br/>
            <c:set target="${person}" property="name" value="pran"/>
            <c:set target="${person}" property="age" value="100"/>
            name is ${person.name}<br/>
             age is ${person.age}<br/>
             message is <c:out value="${message}" default="hi"/>
             <c:import url="http://www.google.lk" />
           
             <%
            List l=null;
            l.add("abc");
             %>
            
                 
    </body>
</html>
