<%-- 
    Document   : Home
    Created on : Nov 16, 2018, 10:06:32 AM
    Author     : PushkarSharma
--%>
<%@include file="Header.jsp"%>
<!DOCTYPE html>
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
    width: 11%;
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
        <script> 
            function validateForm(){
var x=document.forms["Form"]["Npassword"].value;
var y=document.forms["Form"]["Cpassword"].value;
if(x!==y)
{
    alert("confirm password not same");
    return false;
}
            }
</script>
        <title>Reset your Password</title>
    </head>
    <body style="font-family:verdana">
        <center>
            <h1>Password Reset</h1>
            <img src="images/passwordReset.png" alt="ForgotPasswordLogo" height="250" width="250">
        <form action="ForgotPwdPage" method="post" name="Form" onsubmit="return validateForm()" >
            <input type="text" name="username" class="input" placeholder="Username" required><br><br>
        <input type="password" name="Npassword" class="input" placeholder="New Password" required><br><br>
        <input type="password" name="Cpassword" class="input" placeholder="Confirm Password" required><br><br>
        <input type="submit" value="Change Password" class="input">
        </form>
            <br>
            <form action="Login.jsp" method="post">
                <input type="submit" value="Cancel" class="input">
        </form>
        </center>
    </body>
</html>
