<%-- 
    Document   : MyAds
    Created on : Nov 24, 2018, 1:27:30 PM
    Author     : PushkarSharma
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@include file="Header.jsp"%>
 <center>
        <h2>My Ads</h2>
        <h6>*Your all ads will display here.</h6>
 </center>
        
<%
            if(session.getAttribute("username")==null)
            {
                response.sendRedirect("Login.jsp");
            }
            String name=null;
            String Cat;
            int price;
            String des;
            String seller;
            String uname=(String)session.getAttribute("username");
            String query="select * from userdetails where username='"+uname+"'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo","root","");
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery(query);
            while(r.next())
            {
                String usern=r.getString("username");
                if(uname.equals(usern))
                {
                    String fname=r.getString("first_name");
                    String lname=r.getString("last_name");
                    name=fname+lname;
                }
            }
            Statement st1=c.createStatement();
            String query1="select * from postad where sellerName='"+name+"'";
            ResultSet rs=st1.executeQuery(query1);
            int flag=1;
            while(rs.next())
            {
                String n=rs.getString("sellerName");
                String cat=rs.getString("category");
                String item=rs.getString("itemType");
                int p=rs.getInt("price");
                int itemno=rs.getInt("itemNumber");
                String ds=rs.getString("description");
                String date=rs.getString("date");
                if(name.equals(n))
                {
                    flag=0;
                    out.println("<center><table border='1px'>");
                    out.println("<tr><td>Posted On</td>");
                    out.println("<td>Category</td>");
                    out.println("<td>Item Type</td>");
                    out.println("<td>Item Number</td>");
                    out.println("<td>Price</td>");
                    out.println("<td>Description</td>");
                    out.println("<tr><td>"+date+"</td><td>"+cat+"</td><td>"+item+"</td><td>"+itemno+"</td><td>"+p+"</td><td>"+ds+"</td></tr>");
                    out.println("</table></center><br>");
                }
                out.println("<center><form action='DeleteAd' method='post'><input type='number' name='inum' value='inum' placeholder='Enter the Item number' class='in'><br><br>");
                out.println("<input type='submit' class='del' value='Delete Ad'></form></center>");
            }
            if(flag==1)
            {
                out.println("<center>You have not posted yet</center>");
            }
        %>
<!DOCTYPE html>
<html>
    <head>
        <style>
        table {
    border-collapse: collapse;
    width: 40%;
    border: 1px solid #0B5345;
}

td {
    text-align:center;
    padding: 22px;
}

tr:nth-child(odd){background-color: lightgreen;}
tr:nth-child(even){background-color: lightblue;}

.del{
    background-color: #F4E60A;
    border:1px solid #F1C40F;
    color:black;
    padding: 10px 20px;
}
.in{
    width: 20%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid black;
    border-radius: 4px;
    box-sizing: border-box;
}
.in:focus{
    border: 1px solid #2E86C1;
}
</style>
        <title>My Ads</title>
    </head>
    <body style="font-family:verdana" bgcolor="#F2F4F4">
    </body>
</html>
<%@include file="Footer.jsp" %>