<%-- 
    Document   : Welcome
    Created on : Nov 10, 2018, 10:55:22 AM
    Author     : PushkarSharma
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@include file="Header.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <title>My Profile</title>
    </head>
    <body style="font-family:verdana">
        <%
            if(session.getAttribute("username")==null)
            {
                response.sendRedirect("Login.jsp");
            }
            String uname=(String)session.getAttribute("username");
            String query="select * from userdetails where username='"+uname+"'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo","root","");
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery(query);
            while(r.next())
            {
                String Username=r.getString("username");
                String Email=r.getString("email");
                String mob=r.getString("mobile_no");
                out.println("Username: "+Username);
                out.println("Email: "+Email);
                out.println("Mobile No.: "+mob);
            }
        %>
    </body>
</html>
