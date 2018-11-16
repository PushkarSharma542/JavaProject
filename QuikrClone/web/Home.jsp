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
    background-color: darkslategray;
    font-family: Arial, Helvetica, sans-serif;
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
    font-family: inherit;
    margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
    background-color:#F39C12;
}

.dropdown-content {
    display: none;
    position: fixed;
    background-color: #f9f9f9;
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
    background-color: #ddd;
}

.dropdown:hover .dropdown-content {
    display: block;
}

.bt
{
    float:right;
}

.postadd{
    border: 2px solid darkslategray;
    background-color: greenyellow;
    margin-right: 30px;
    width: 120px;
    height:30px;
   float: right;
   border-radius:10px;
   margin-top: 30px;
}

.postadd:hover
{
    background-color:#F39C12; 
}
</style>

<title>Home</title>
</head>
<body>
    <div>
        <form action="#PostAdd" method="post" >
            <input type="submit" value="Post Free Ad" class="postadd">
        </form>
    </div>
    <img src="images/Logo.png"><br>
<div class="navbar">
  <a href="Home.jsp">Home</a>
  <a href="Welcome.jsp">My Account</a>
  <a href="About.html">About</a>
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
  <div class="bt">
  <a href="Login.html">Login</a>    
  <a href="SignUp.html">SignUp</a>
  </div>
</div>
   <hr color="darkslategray"> 
</body>
</html>