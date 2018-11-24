<%-- 
    Document   : PostAdd
    Created on : Nov 18, 2018, 11:10:52 PM
    Author     : PushkarSharma
--%>

<%@include file="Header.jsp"%>
<% 
    if(session.getAttribute("username")==null)
    {
        response.sendRedirect("Login.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Post Free Ad</title>
        <style>
            .select
{
      background-color:#F9E79F;
        color:black;
}

.select:hover {
    background-color:white;
    color:black;
}

.input,select{
    width: 20%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid darkslategray;
    border-radius: 4px;
    box-sizing: border-box;
}
.input:hover{
    background-color:#F9E79F;
    color: black;
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

h6{
    color:red;
}
            </style>
    </head>
    <body style="font-family: verdana">
        <center>
            <h1>Post Free Ad</h1>
        <div>
            <form action="PostAdPage" method="post">
                <select name="AdCategory" required>
                    <option value="" disabled="disabled" selected="selected" class="select">Select your category</option>
                    <option name="electronics" value="electronics" class="select" >Electronics</option>
                    <option name="education" value="education" class="select">Education</option>
                    <option name="automobiles" value="automobiles" class="select">Automobiles</option>
                    </select><br><br>
                    <input type="number" name="price" Placeholder="Set Price (in Rupees)" class="input" required><br><br>
                    <textarea rows="3" cols="45" placeholder="Description of your item" maxlength="70" class="input" name="description" required></textarea>
                   <h6>*Please enter neccessary details about your selling item within 70 words.</h6>      
                   <input type="submit" value="Post Ad" class="input">
            </form> 
            </div>
        </center>
    </body>
</html>
<%@include file="Footer.jsp" %>