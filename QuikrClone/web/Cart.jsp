<%-- 
    Document   : Cart
    Created on : Nov 26, 2018, 12:14:23 AM
    Author     : PushkarSharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if(session.getAttribute("username")==null)
    {
        response.sendRedirect("Home.jsp");
    }
%>
<%@include file="Header.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shop Cart</title>
    </head>
    <body bgcolor="#F2F4F4">
    <center>
        <img src="images/cart_empty.jpg" height="250" width="300"><br><br>
        <a href="Home.jsp">click here</a> to buy a item.
    </center>
    </body>
</html>
<%@include file="Footer.jsp"%>