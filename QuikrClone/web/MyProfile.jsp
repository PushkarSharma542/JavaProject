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

<%
            if(session.getAttribute("username")==null)
            {
                response.sendRedirect("Login.jsp");
            }
            String Username;
            String Email;
            String mob;
            String uname=(String)session.getAttribute("username");
            String query="select * from userdetails where username='"+uname+"'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo","root","");
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery(query);
            while(r.next())
            {
                String fname=r.getString("first_name");
                String lname=r.getString("last_name");
                Username=r.getString("username");
                Email=r.getString("email");
                mob=r.getString("mobile_no");
                String add=r.getString("Address");
                pageContext.setAttribute("fname", fname);
                pageContext.setAttribute("lname", lname);
                pageContext.setAttribute("user", Username);
                pageContext.setAttribute("email", Email);
                pageContext.setAttribute("mob", mob);
                pageContext.setAttribute("add", add);
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

tr:nth-child(odd){background-color: #F9E79F;}
tr:nth-child(even){background-color: lightyellow;}

.input[type=submit] {
    width: 10%;
    background-color: white;
    color: #0B5345;
    padding: 14px 20px;
    margin: 8px 0;
    border: 2px solid #0B5345;
    border-radius: 8px;
    cursor: pointer;
}

.input[type=submit]:hover {
    background-color: #0B5345;
    color: white;
    font-weight: bold;
}

</style>
        <title>My Profile</title>
    </head>
    <body style="font-family:verdana">
    <center>
        <h2>My Profile</h2>
        <img src="images/myprofile.png" height="150" width="200"><br><br>
        <form>
           <table>
               <tr>
                <td>First Name</td>
                <td><%out.print(pageContext.findAttribute("fname"));%></td>
                </tr>
                <tr>
                <td>Last Name</td>
                <td><%out.print(pageContext.findAttribute("lname"));%></td>
                </tr>
              <tr>
                    <td>Username</td>
                    <td><%out.print(pageContext.findAttribute("user"));%></td>
               </tr>
                <tr>
                    <td>Email</td>
                    <td><%out.print(pageContext.findAttribute("email"));%></td>
                </tr>
                <tr>
                <td>Mobile</td>
                <td><%out.print(pageContext.findAttribute("mob"));%></td>
                </tr>
                <tr>
                <td>Address</td>
                <td><%out.print(pageContext.findAttribute("add"));%></td>
                </tr>
            </table>
                <br>
                <form action="#abc">
                <input type="submit" value="Edit Details" class="input">
                </form>
                <form action="SecurityQ.jsp" method="post">
                    <%session.setAttribute("key",1);%>
                <input type="submit" value="Delete Account" class="input">
                </form>
        </form>
        </center>
    </body>
</html>
<%@include file="Footer.jsp" %>