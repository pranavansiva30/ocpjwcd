<%-- 
    Document   : index
    Created on : Sep 6, 2014, 4:41:59 PM
    Author     : icbt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Food Order</title>
    </head>
    <body>
        <form action="OrderServlet" method="post">
            Type:<select name="type" >
                <option value="beef">Beef</option>
                <option value="chicken">Chicken</option>
                <option value="vegetable">Vegetable</option>
            </select><br/>
            Size:<select name="size" >
                <option value="small">Small</option>
                <option value="medium">Medium</option>
                <option value="large">Large</option>
            </select><br/>
             <input type="submit" name="order" value="order"/><input type="reset" value="clear"/>
        </form>
        
    </body>
</html>
