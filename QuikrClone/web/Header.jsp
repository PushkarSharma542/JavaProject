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

.input1
{
    float:right;
    border: 1px solid darkslategray;
    background-color: #F9E79F;
    margin-right: 7px;
    width: 110px;
    height:40px;
    margin-top: 4px;
    font-family: verdana;
    border-radius:10px;
}
.input2
{
    float:right;
    border: 1px solid darkslategray;
    background-color: #F9E79F;
    width: 70px;
    border-radius:10px;
    height:40px;
   margin-right: 5px;
   margin-top: 4px;
   font-family: verdana;
}

.input1:hover , .input2:hover{
    background-color:lightgoldenrodyellow;
}
.postadd{
    border: 2px solid darkslategray;
    background-color: lightgreen;
    margin-right: 10px;
    width: 100px;
    height:40px;
   float: right;
   border-radius:10px;
   margin-top: 17px;
   font-family: verdana;
}

.postadd:hover
{
    background-color:lightgoldenrodyellow; 
}
.right{
    float: right;
    margin-right: 10px;
}
</style>
</head>
<body style="font-family:verdana">
    <div>
        <%
            if(session.getAttribute("username")==null)
            {
                out.println("<form action='Login.jsp' method='post' class='right'>");
                out.println("Welcome, Guest");
            out.println("<br><input type='submit' value='Login' class='postadd'>");
        out.println("</form>");
            }
            else
            {
                out.println("<form action='LogoutPage' method='post' class='right'>");
                String user=(String)session.getAttribute("username");
                out.println("Welcome, "+user);
            out.println("<br><input type='submit' value='Logout' class='postadd'>");
        out.println("</form>");
            }
        %>
    </div>
    <img src="images/Logo.png"><br>
<div class="navbar">
  <a href="Home.jsp">Home</a>
  <a href="Welcome.jsp">My Profile</a>
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
  <div>
      <form method="post" action="PostAdd.jsp">
    <input type="submit" value="Post Free Ad" class="input1">
      </form>
      <form method="post" action="SignUp.jsp">
    <input type="submit" value="SignUp" class="input2">
      </form>
  </div>
</div>
   <hr color="darkslategray"> 
</body>
</html>
