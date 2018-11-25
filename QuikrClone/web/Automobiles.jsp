<%-- 
    Document   : Automobiles
    Created on : Nov 25, 2018, 9:14:14 PM
    Author     : PushkarSharma
--%>

<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@include file="Header.jsp"%>
<html>
    <title>Automobiles</title>
    <body>
<%
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo","root","");
        Statement s=con.createStatement();
        ResultSet r=s.executeQuery("select * from postad where category='Automobiles' order by date DESC");
        while(r.next())
        {
            String user=r.getString("sellerName");
            String cat=r.getString("category");
            String subCat=r.getString("itemType");
            String price=r.getString("price");
            String desc=r.getString("description");
            String Date=r.getString("date");
             out.println("<center><img src='images/default.gif'>");
            out.print("<div><form style='font-family: arial'><table>");
            out.print("<tr><td>"+"Posted on  : "+Date+"</td></tr>");
            out.print("<tr><td>"+"Item category : "+cat+"</td></tr>");
            out.print("<tr><td>"+"Item type : "+subCat+"</td></tr>");
            out.println("<tr><td>"+"Seller name : "+user+"</td></tr>");
            out.print("<tr><td>"+"Price : Rs. "+price+"</td></tr>");
            out.print("<tr><td>"+"Description : "+desc+"</td></tr>");
            out.print("<tr><td><center><form action='#buynow' method='post'><input type='submit' style='background-color: yellow; padding: 4px 10px; border:1px solid darkslategray; border-radius: 4px;' value='Buy Now'></form></td></center></tr></table>");
            out.print("</form></div><br></center>");
        }
    %>
    </body>
</html>
    <%@include file="Footer.jsp"%>