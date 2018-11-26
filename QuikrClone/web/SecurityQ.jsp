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
    if (x === "" && y === "") {
        alert("Please fill both username and password!!! don't leave both empty");
        return false;
    }
        if (x==="")
        {
            alert("Please fill username!!! don't leave it empty");
            return false;
        }
        if(y==="")
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
    border: 1px solid black;
    border-radius: 4px;
    box-sizing: border-box;
}

.input[type=submit] {
    width: 7%;
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

.input[type=text]:focus 
{
      background-color:white;
      border: 1px solid #2E86C1;
}

.select
{
      background-color:white;
        color:black;
}

.select:hover {
    background-color:#2E86C1;
      color: white;
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
        <title>Security Questions</title>
    </head>
    <body style="font-family:verdana" bgcolor="#F2F4F4">
        <%
            if(session.getAttribute("username")==null && session.getAttribute("login")!=null){
                session.setAttribute("fpwd",1234);
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
                out.println("</form><br><a href='Home.jsp' class='input1'>Cancel</a><br><br></center>");
            }
            else if(session.getAttribute("myprofile")!=null)
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
                out.println("<h6 style='color:red'><i><u>Warning</u></i>:- Please note that delete your account will delete your posted Ads also. It can't be undone.</h6></center>");
            }
            else
            {
                response.sendRedirect("Home.jsp");
            }
        %>
    </body>
</html>
<%@include file="Footer.jsp" %>