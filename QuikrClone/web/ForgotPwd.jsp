<%-- 
    Document   : ForgotPwd
    Created on : Nov 16, 2018, 10:06:32 AM
    Author     : PushkarSharma
--%>
<%@include file="Header.jsp"%>
<%
    if(session.getAttribute("fpwd")==null)
    {
        response.sendRedirect("Home.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
<style>
.input[type=password], select {
    width: 20%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid black;
    border-radius: 4px;
    box-sizing: border-box;
}

.input[type=submit] {
    width: 12%;
    background-color: #2E86C1;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 8px;
    cursor: pointer;
}

.input[type=submit]:hover {
    font-weight: bold;
}

.input[type=password]:focus 
{
      border: 1px solid #2E86C1;
}

.input1{
    background-color:#2ECC71;
    color: white;
    text-decoration: none;
    padding: 10px 16px;
    margin: 8px 0;
    border:none;
    border-radius: 8px;
    cursor: pointer;
}

.input1:hover {
    font-weight: bold;
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
    <body style="font-family:verdana" bgcolor="#F2F4F4">
        <center>
            <h1>Password Reset</h1>
            <img src="images/passwordReset.png" alt="ForgotPasswordLogo" height="250" width="250">
        <form action="ForgotPwdPage" method="post" name="Form" onsubmit="return validateForm()" >
        <input type="password" name="Npassword"  class="input" placeholder="New Password" required><br><br>
        <input type="password" name="Cpassword" class="input" placeholder="Confirm Password" required><br><br>
        <input type="submit" value="Change Password" class="input">
        </form><br>
            <a href="Home.jsp" class="input1">Cancel</a><br><br>
        </center>
    </body>
</html>
<%@include file="Footer.jsp" %>