<%-- 
    Document   : Header
    Created on : Nov 16, 2018, 10:06:32 AM
    Author     : PushkarSharma
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <style>
.navbar {
    overflow: hidden;
    background-color:white;
    font-family: verdana;
    border-radius: 4px;
}

.navbar a {
    float: left;
    font-size: 16px;
    color: black;
    margin-top: 10px;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

.dropdown {
    float: left;
    overflow: hidden;
    margin-top: 10px;
}

.dropbtn {
    font-size: 16px;    
    border: none;
    outline: none;
    color: black;
    padding: 14px 16px;
    background-color: inherit;
    font-family: verdana;
    margin: 0;
}

.dropdown-content {
    display: none;
    position: fixed;
    background-color: white;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    float: none;
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {
    background-color: #2E86C1;
    color:white;
}

.dropdown:hover .dropdown-content {
    display: block;
}

.postadd{
    border:none;
    background-color: #2E86C1;
    margin-right: 10px;
    margin-top: 20px;
    color: white;
    width: 100px;
    margin-top: 4px;
    height:40px;
   float: right;
   border-radius:10px;
   font-family: verdana;
   cursor: pointer;
}

.postadd:hover
{
    font-weight: bold;
}
.right{
    float: right;
}
h4{
    float: right;   
    margin-top: 12px;
    margin-right: 10px;
    color:#2E86C1;
    font-family: Gill Sans MT;
}
.logo{
    float:left;
}
.postadd1{
    border:1px solid #F1C40F;
    background-color: #F4E60A;
    margin-right: 10px;
    color: white;
    width: 85px;
    height:15px;
   font-family: Rockwell-Condensed;
   cursor: pointer;
}

</style>
</head>
<body style="font-family:verdana">
<div class="navbar">
    <%
            if(session.getAttribute("username")==null)
            {
                out.println("<form action='Login.jsp' method='post' class='right'>");
                String u="Guest";
            out.println("<input type='submit' value='Login' class='postadd'><i class='fa fa-sort-down'></i>");
        out.println("</form>");  
        out.println("<h4>Welcome "+u+"</h4>");
            }
            else
            {
                out.println("<form action='LogoutPage' method='post' class='right'>");
                String u=(String)session.getAttribute("username");
            out.println("<input type='submit' value='Logout' class='postadd'>");
        out.println("</form>");
        out.println("<h4>Welcome "+u+"</h4>");
            }
        %>
        <br><br><br>
    <img style="margin-left:5px" src="images/Logo.jpg" height="70" width="150" class="logo">
    <a href="Home.jsp">Home</a>
    <div class="dropdown">
        <button class="dropbtn">Categories</button>
        <div class="dropdown-content">
            <a href="Electronics.jsp">Electronics</a>
            <a href="Education.jsp">Education</a>
                <a href="Automobiles.jsp">Automobiles</a>
        </div>
    </div>
    <a href="About.jsp">About</a>
    <%
        if(session.getAttribute("username")!=null)
        {
            out.println("<div class='dropdown'><button class='dropbtn'>My Account</button>");
            out.println("<div class='dropdown-content'>");
            out.println("<a href='MyProfile.jsp'>My Profile</a>");
            out.println("<a href='MyAds.jsp'>My Ads</a></div></div>");
        }
    %>
    <div class="right">
        <a href="SignUp.jsp" >Register</a>
        <a href="PostAd.jsp" class="postadd1">Post Free Ad</a>
        <a href="Cart.jsp"><img src="images/cart.png" height="35" width="35" style="margin-top: -10px;margin-left: -15px;"></a>
    </div>
</div>
    <hr>
</body>
</html>
