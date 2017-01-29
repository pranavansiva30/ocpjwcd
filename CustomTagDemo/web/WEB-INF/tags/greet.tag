<%-- 
    Document   : greet
    Created on : Nov 29, 2014, 5:32:58 PM
    Author     : icbt
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@tag body-content="scriptless"%>
<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="message"%>

<%-- any content can be specified here e.g.: --%>
<h2>${message}</h2>
<jsp:doBody/>
