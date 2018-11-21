<%-- 
    Document   : SecurityQ
    Created on : Nov 13, 2018, 10:30:30 AM
    Author     : PushkarSharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Header.jsp"%>
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
.select
{
      background-color:#F9E79F;
        color:black;
}

.select:hover {
    background-color:white;
    color:black;
}
i{
    color: red;
}
</style>
        <title>Login Page</title>
    </head>
    <body style="font-family:verdana">
        <%
            if(session.getAttribute("key")==null){
                out.println("<center><h1>Security Questions</h1>");
                out.println("<h6>*please answer any one question to change your password</h6>");
                out.println("<form action='SecurityQPage' method='post' name='LoginForm' onsubmit='return validateForm()'><br>");
                out.println("<input type='text' name='username' placeholder='Username' class='input' required><br>");
                out.println("<select id='securityQ' name='securityQ' required>");
                out.println("<option value='' disabled='disabled' selected='selected' class='select'>Select security question</option>");
                out.println("<option name='ques1' value='ques1' class='select' >In which city you were born</option>");
                out.println("<option name='ques2' value='ques2' class='select'>Which is your favorite car brand</option>");
                out.println("<option name='ques3' value='ques3' class='select'>Who is your favourite teacher</option>");
                out.println("<option name='ques4' value='ques4' class='select'>Who was your childhood hero</option>");
                out.println("</select><br>");
                out.println("<input type='text' name='ans' placeholder='Your Answer' class='input' required><br><br>");
                out.println("<input type='submit' name='Login' value='Submit' class='input'><br>");
                out.println("</form><br></center>");
            }
            else
            {
                out.println("<center><h1>Security Questions</h1>");
                out.println("<h6>*please answer any one question to delete you account.</h6>");
                out.println("<form action='DeleteAccount' method='post' name='LoginForm' onsubmit='return validateForm()'><br>");
                out.println("<input type='text' name='username' placeholder='Username' class='input' required><br>");
                out.println("<select id='securityQ' name='securityQ' required>");
                out.println("<option value='' disabled='disabled' selected='selected' class='select'>Select security question</option>");
                out.println("<option name='ques1' value='ques1' class='select' >In which city you were born</option>");
                out.println("<option name='ques2' value='ques2' class='select'>Which is your favorite car brand</option>");
                out.println("<option name='ques3' value='ques3' class='select'>Who is your favourite teacher</option>");
                out.println("<option name='ques4' value='ques4' class='select'>Who was your childhood hero</option>");
                out.println("</select><br>");
                out.println("<input type='text' name='ans' placeholder='Your Answer' class='input' required><br><br>");
                out.println("<input type='submit' name='confirm' value='Confirm' class='input'>");
                out.println("</form><form action='Home.jsp' method='post'><input type='submit' name='cancel' value='Cancel' class='input'></form>");
                out.println("<h6><i><u>Warning</u></i>:- Please note that delete your account can't be undone. So do it carefully.</h6></center>");
            }
        %>
    </body>
</html>
<%@include file="Footer.jsp" %>