<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@include file="Header.jsp"%>
<html>
    <head>
        <style>
        .input[type=text], select {
    width: 20%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid darkslategray;
    border-radius: 4px;
    box-sizing: border-box;
}

.input[type=password], select {
    width: 20%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid darkslategray;
    border-radius: 4px;
    box-sizing: border-box;
}

.input[type=submit] {
    width: 10%;
    background-color: darkslategray;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 8px;
    cursor: pointer;
}

.input[type=submit]:hover {
    background-color: #F9E79F;
    color: black;
    border: 1px solid darkslategray; 
}

.input[type=text]:focus 
{
      background-color: #F9E79F;
      color: black;
}
.input[type=password]:focus 
{
      background-color:#F9E79F;
      color:black;
}
</style>
        <title>Login</title>
    </head>
    <body style="font-family:verdana">
        <center>
       <h1>Login</h1>
       <img src="images/theUser.png" alt="User" height="200" width="200"><br><br>
       <div>
       <form action="LoginPage" method="post"><br>
        <input type="text" name="username" placeholder="Username" class="input" required><br><br>
        <input type="password" name="password" placeholder="Password" class="input" required><br><br>
        <input type="submit" name="Login" value="Login" class="input">
        </form>
           <form method="post" action="Home.jsp">
                <input type="submit" value="Cancel" class="input">
        </form>
           <br>
           </div>
       <div>
           <a href="SecurityQ.jsp">Forgot Password?</a><br>
        <h6>*By Signing in you agree to T&C and Privacy Policy</h6>     
           </div>
        </center>
    </body>
</html>
<%@include file="Footer.jsp" %>