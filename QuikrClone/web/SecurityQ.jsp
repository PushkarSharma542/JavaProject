<%-- 
    Document   : SecurityQ
    Created on : Nov 13, 2018, 10:30:30 AM
    Author     : PushkarSharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script>
function validateForm() {
    var x = document.forms["LoginForm"]["username"].value;
    var y=document.forms["LoginForm"]["password"].value;
    if (x == "" && y == "") {
        alert("Please fill both username and password!!! don't leave both empty");
        return false;
    }
        if (x=="")
        {
            alert("Please fill username!!! don't leave it empty");
            return false;
        }
        if(y=="")
        {
            alert("Please fill password!!! don't leave it empty");
            return false;
        }
    }
</script>
        <title>Login Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body style="font-family:verdana">
        <center>
       <h1>Security Questions </h1>
       <h6>*please answer any one question to change your password</h6>
       <form action="LoginPage" method="post" name="LoginForm" onsubmit="return validateForm()"><br>
        Username: <input type="text" name="username"><br><br>
        <input type="radio" name="SecureQ" value="sq1">What is your nick name?<br>
        <input type="radio" name="SecureQ" value="sq2">What is your school name?<br>
        <input type="submit" name="Login" value="Login"><br>
        </form>
       <br>
        </center>
    </body>
</html>
