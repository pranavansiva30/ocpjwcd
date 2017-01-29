<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@include file="header.jsp"%>

    <div id="templatemo_content_right">
        <h2>
            <p><c:out value="${error}"/></p>
            <form action="RegistrationServlet" method="POST">
                <table border="1">
                   
                    <tbody>
                        <tr>
                            <td>First Name:</td>
                            <td><input type="text" name="firstname" value="" /></td>
                        </tr>
                        <tr>
                            <td>Last Name:</td>
                            <td><input type="text" name="lastname" value="" /></td>
                        </tr>
                        <tr>
                            <td>Email</td>
                            <td><input type="text" name="email" value="" /></td>
                        </tr>
                        <tr>
                            <td>Username:</td>
                            <td><input type="text" name="username" value="" /></td>
                        </tr>
                        <tr>
                            <td>Password</td>
                            <td><input type="text" name="password" value="" /></td>
                        </tr>
                        
                        
                        <tr>
                            <td><input type="submit" value="Register" name="register" /></td>
                            <td><input type="reset" value="Clear" name="reset" /></td>
                        </tr>
                    </tbody>
                </table>

            </form>
        </h2>
        <div class="cleaner_with_height">&nbsp;</div>

    </div> <!-- end of content right -->
    <%@include file="footer.jsp" %>
</html>