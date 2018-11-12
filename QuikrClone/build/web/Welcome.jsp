<%-- 
    Document   : Welcome
    Created on : Nov 10, 2018, 10:55:22 AM
    Author     : PushkarSharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <%
            if(session.getAttribute("username")==null)
            {
                response.sendRedirect("Login.html");
            }
        %>
        Welcome $username
        <form action="LogoutPage" method="post">
            <input type="submit" value="Logout">
        </form>
    </body>
</html>
