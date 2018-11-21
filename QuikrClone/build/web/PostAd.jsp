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
    </head>
    <body style="font-family: verdana">
        <center>
            <h1>Post Free Ad</h1>
        <div>
            <form action="PostAddPage" method="post">
                <select name="AddCategory" required>
                    <option value="" disabled="disabled" selected="selected" class="select">Select your category</option>
                    <option name="electronics" value="electronics" class="select" >Electronics</option>
                    <option name="education" value="education" class="select">Education</option>
                    <option name="automobiles" value="automobiles" class="select">Automobiles</option>
                    </select><br><br>
            </form> 
            </div>
        </center>
    </body>
</html>
<%@include file="Footer.jsp" %>