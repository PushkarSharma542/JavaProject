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
<html><head>
    <title>Home</title>
    </head>
    <body bgcolor="#F2F4F4"><br>
    <center><h6>*All recent ads will show here</h6></center>
<%
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo","root","");
        Statement s=con.createStatement();
        ResultSet r=s.executeQuery("select * from postad order by date DESC");
        while(r.next())
        {            
            String user=r.getString("sellerName");
            int itemno=r.getInt("itemNumber");
            String cat=r.getString("category");
            String subCat=r.getString("itemType");
            String price=r.getString("price");
            String desc=r.getString("description");
            String Date=r.getString("date");
            out.println("<center><img src='images/default.gif'>");
            out.print("<div><form style='font-family: arial'><table>");
            out.print("<tr><td>"+"Posted on  : "+Date+"</td></tr>");
            out.print("<tr><td>"+"Item Number : "+itemno+"</td></tr>");
            out.print("<tr><td>"+"Item category : "+cat+"</td></tr>");
            out.print("<tr><td>"+"Item type : "+subCat+"</td></tr>");
            out.println("<tr><td>"+"Seller name : "+user+"</td></tr>");
            out.print("<tr><td>"+"Price : Rs. "+price+"</td></tr>");
            out.print("<tr><td>"+"Description : "+desc+"</td></tr>");
            out.print("<tr><td><br><center><form action='#buynow' method='post'><input type='submit' style='background-color: yellow; padding: 4px 10px; border:1px solid darkslategray; border-radius: 4px;' value='Buy Now'></form></td></center></tr></table>");
            out.print("</form></div><br></center>");
        }
    %>
    </body>
</html>
    <%@include file="Footer.jsp"%>