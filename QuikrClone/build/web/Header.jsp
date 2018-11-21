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
    background-color:darkslategray;
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
}

.dropdown {
    float: left;
    overflow: hidden;
}

.dropdown .dropbtn {
    font-size: 16px;    
    border: none;
    outline: none;
    color: white;
    padding: 14px 16px;
    background-color: inherit;
    font-family: verdana;
    margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
        background-color: #F9E79F;
        color: black;
}

.dropdown-content {
    display: none;
    position: fixed;
    background-color: #F9E79F;
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
    background-color: white;
}

.dropdown:hover .dropdown-content {
    display: block;
}

.postadd{
    border: 2px solid darkslategray;
    background-color: #F9E79F;
    margin-right: 10px;
    width: 100px;
    height:40px;
   float: right;
   border-radius:10px;
   font-family: verdana;
}

.postadd:hover
{
    background-color:lightgoldenrodyellow;
}
.right{
    float: right;
    
}
h4{
    float: right;
    margin-right: 8px;
    margin-top: 28px;
}
</style>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
</head>
<body style="font-family:verdana">
    <div>
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
    <h4><%out.println("Welcome ");out.print(pageContext.findAttribute("username"));%></h4>
    <img src="images/Logo.png"><br>
    
<div class="navbar">
  <a href="Home.jsp">Home</a>
  <a href="MyProfile.jsp">My Profile</a>
  <a href="About.jsp">About</a>
  <div class="dropdown">
    <button class="dropbtn">Categories 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">Electronics</a>
      <a href="#">Education</a>
      <a href="#">Automobiles</a>
    </div>
  </div>
  <div class="right">
      <a href="PostAd.jsp">Post an Ad</a>
      <a href="SignUp.jsp" >Register&nbsp;
          <i class="fas fa-user" style="font-size:17px; color: lightcoral;"></i>
      </a>
  </div>
        
</div>
   <hr color="darkslategray"> 
   <%if(session.getAttribute("username")!=null)
   {
       out.println("<img src='images/mycart.png' style='float:right; margin-right:5px'>");
   }
   %>
</body>
</html>
