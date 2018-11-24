<%-- 
    Document   : Home
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
    background-color:#0B5345;
    font-family: verdana;
    border-radius: 4px;
}

.navbar a {
    float: left;
    font-size: 16px;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-weight: bold;
}

.dropdown {
    float: left;
    overflow: hidden;
    font-weight: bold;
}

.dropdown .dropbtn {
    font-size: 16px;    
    border: none;
    outline: none;
    color: white;
    font-weight: bold;
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
    background-color: #0B5345;
    color:white;
}

.dropdown:hover .dropdown-content {
    display: block;
}

.postadd{
    border: 2px solid #0B5345;
    background-color: white;
    margin-right: 10px;
    color: darkgreen;
    width: 100px;
    height:40px;
   float: right;
   border-radius:10px;
   font-family: verdana;
}

.postadd:hover
{
    background-color:#0B5345;
    color:white;
    font-weight: bold;
}
.right{
    float: right;
}
.ads{
    float:right;
    background-color:greenyellow;
    color: #0B5345;
    text-decoration: none;
    margin-right: 6px;
    padding: 8px 15px;
    margin-top: -15px;
    border: 1px solid #0B5345;
    border-radius: 5px;
}
h4{
    float: right;
    margin-right: 8px;
    margin-top: 28px;
}
</style>
</head>
<body style="font-family:verdana">
    <div>
        <a href="Cart.jsp"><img src="images/mycart.png" height="50" width="50" style="float:right; margin-right:5px;margin-left:4px; margin-top:12px"></a>
        <%
            if(session.getAttribute("username")==null)
            {
                out.println("<form action='Login.jsp' method='post' class='right'>");
                String u="Guest";
                pageContext.setAttribute("username",u);
            out.println("<br><input type='submit' value='Login' class='postadd'>");
        out.println("</form>");
            }
            else
            {
                out.println("<form action='LogoutPage' method='post' class='right'>");
                String user=(String)session.getAttribute("username");
                String u=(String)session.getAttribute("username");
                pageContext.setAttribute("username",u);
            out.println("<br><input type='submit' value='Logout' class='postadd'>");
        out.println("</form>");
            }
        %>
    </div>
    <h4 style="color: #0B5345"><%out.println("Welcome ");out.print(pageContext.findAttribute("username"));%></h4>
    <img src="images/Logo.png"><br>
    
<div class="navbar">
  <a href="Home.jsp">Home</a>
  <a href="MyProfile.jsp">My Profile</a>
  <a href="About.jsp">About</a>
  <div class="dropdown">
    <button class="dropbtn">Categories 
    </button>
    <div class="dropdown-content">
      <a href="#">Electronics</a>
      <a href="#">Education</a>
      <a href="#">Automobiles</a>
    </div>
  </div>
  <div class="right">
      <a href="PostAd.jsp">Post Free Ad</a>
      <a href="SignUp.jsp" >Register
      </a>
  </div>
</div>
   <hr color="#0B5345"> 
   <%if(session.getAttribute("username")!=null)
   {
        out.println("<form action='MyAds.jsp' method='post' >");
        out.println("<br><a href='MyAds.jsp' class='ads'>My Ads</a>");
        out.println("</form>");
   }
   %>
</body>
</html>
