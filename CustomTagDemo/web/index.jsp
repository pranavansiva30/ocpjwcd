<%-- 
    Document   : index
    Created on : Nov 29, 2014, 2:38:06 PM
    Author     : icbt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="mine" uri="/WEB-INF/tlds/newtag_library"%>
<%@ taglib prefix="mine2" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JSP Page</title>
    </head>
    <body>
        <mine:greet user="pranavan"/>
        <mine2:greet message="sivasundaram">
            greeting...
        </mine2:greet>
        <mine:print>
           hi
        </mine:print>
           <mine:loopTag rounds="5"/>
             <mine:classicloopTag rounds="5"> classic tag </mine:classicloopTag>
        <mine:classicTag> classic tag </mine:classicTag>
           Going to invoke the tag<br/>
           <mine:badTag/>
           End of the page<br/>
          <mine:badTag/>
          
          
           
    </body>
</html>
