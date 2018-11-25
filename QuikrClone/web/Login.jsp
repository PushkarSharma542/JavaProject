<%-- 
    Document   : Login
    Created on : Nov 16, 2018, 11:10:22 AM
    Author     : PushkarSharma
--%>

<!DOCTYPE html>
<%@include file="Header.jsp"%>
<html>
    <head>
        <style>
        .input[type=text], select {
    width: 20%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #0B5345;
    border-radius: 4px;
    box-sizing: border-box;
}

.input[type=password], select {
    width: 20%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #0B5345;
    border-radius: 4px;
    box-sizing: border-box;
}

.input[type=submit] {
    width: 7%;
    background-color: white;
    color: #0B5345;
    padding: 14px 20px;
    margin: 8px 0;
    border: 2px solid #0B5345;
    border-radius: 8px;
    cursor: pointer;
}

.input[type=submit]:hover {
    background-color:#0B5345;
    color:white;
    font-weight: bold;
    border: 1px solid white; 
}

.input[type=text]:focus 
{
      background-color: lightcyan;
      color: black;
}
.input[type=password]:focus 
{
      background-color:lightcyan;
      color:black;
}
.input1{
    background-color: white;
    color: #0B5345;
    text-decoration: none;
    padding: 10px 16px;
    margin: 8px 0;
    border: 2px solid #0B5345;
    border-radius: 8px;
    cursor: pointer;
}

.input1:hover {
    background-color:#0B5345;
    color:white;
    font-weight: bold;
    border: 1px solid white; 
}
</style>
        <title>Login</title>
    </head>
    <body style="font-family:verdana; display: inline;">
        <%            
            session.setAttribute("login",121);
        %>
        <center>
            <h2>Sign In</h2>
       <img src="images/theUser.png" alt="User" height="200" width="200"><br><br>
       <div>
       <form action="LoginPage" method="post"><br>
        <input type="text" name="username" placeholder="Username" class="input" required><br><br>
        <input type="password" name="password" placeholder="Password" class="input" required><br><br>
        <input type="submit" name="Login" value="Sign In" class="input">
        </form><br>
               <a href="Home.jsp" class="input1">Cancel</a><br><br>
           </div>
       <div>
           <a href="SecurityQ.jsp">Forgot Password?</a><br>
        <h6>*By Signing in, you agree to T&C and Privacy Policy.</h6>     
           </div>
        </center>
    </body>
</html>
<%@include file="Footer.jsp" %>