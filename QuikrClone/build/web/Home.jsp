<%-- 
    Document   : Home
    Created on : Nov 16, 2018, 10:06:32 AM
    Author     : PushkarSharma
--%>

<%@page import="java.time.LocalDateTime"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@include file="Header.jsp"%>
<html>
    <title>Home</title>
    <body>
<%
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo","root","");
        Statement s=con.createStatement();
        ResultSet r=s.executeQuery("select * from postad");
        while(r.next())
        {
            System.out.println(LocalDateTime.now());
            String user=r.getString("sellerName");
            String cat=r.getString("category");
            String price=r.getString("price");
            String desc=r.getString("description");
            out.print("<html><div><form style='font-family: arial'><table><tr><td>"+"Seller name : "+user+"</td></tr>");
            out.print("<tr><td>"+"Item category : "+cat+"</td></tr>");
            out.print("<tr><td>"+"Price : Rs. "+price+"</td></tr>");
            out.print("<tr><td>"+"Description : "+desc+"</td></tr>");
            out.print("<tr><td style=><form action='#buynow' method='post'><input type='submit' style='background-color: yellow; padding: 4px 10px; border:1px solid darkslategray; border-radius: 4px;' value='Buy Now'></form></td></tr></table>");
            out.print("</form></div></html>");
        }
    %>
    </body>
</html>
    <%@include file="Footer.jsp"%>