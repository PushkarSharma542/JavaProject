<%-- 
    Document   : SignUp
    Created on : Nov 16, 2018, 11:24:59 AM
    Author     : PushkarSharma
--%>
<%@include file="Header.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <script>
function mob()
{
    var x = document.forms["SignUpForm"]["mobileno"].value;
if (/^\d{10}$/.test(x)) {
    // value is ok, use it
} else {
    alert("Invalid number!!! must be ten digits");
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

.input[type=email], select {
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
    background-color: #0B5345;
    color: white;
    font-weight: bold;
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
.input[type=email]:focus 
{
      background-color:lightcyan;
      color:black;
}
.select
{
      background-color: white;
        color:black;
}

.select:hover {
    background-color:#0B5345;
    color:white;
}
.i{
    width: 10%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #0B5345;
    border-radius: 4px;
    box-sizing: border-box;
}
.i[type=text]:focus 
{
      background-color: lightcyan;
      color: black;
}
</style>
<title>Register</title>
    </head>
    <body style="font-family:verdana">
        <center>
            <h2>Sign Up</h2>
            <img src="images/theUser.png" alt="User" height="200" width="200"><br><br>
            <div>
            <form action="SignUpPage" name="SignUpForm" method="post" onsubmit="return mob()">
                <input type="text" name="FirstName" placeholder="First Name" class="i" required>
                <input type="text" name="LastName" placeholder="Last Name" class="i" required><br><br>
                <input type="text" name="username" placeholder="Username" class="input" required><br><br>
                <input type="password" name="password" placeholder="Password" class="input" required><br><br>
                <input type="email" name="email" placeholder="Email" class="input" required><br><br>
                <input type="text" name="mobileno" placeholder="Mobile No." class="input" required><br><br>
                <input type="text" name="Address" placeholder="Address" class="input" required><br><br>
                <select id="securityQ" name="securityQ" required>
                    <option value="" disabled="disabled" selected="selected" class="select">Select security question</option>
                    <option name="ques1" value="ques1" class="select" >In which city you were born</option>
                    <option name="ques2" value="ques2" class="select">Which is your favorite car brand</option>
                    <option name="ques3" value="ques3" class="select">Who is your favourite teacher</option>
                    <option name="ques4" value="ques4" class="select">Who was your childhood hero</option>
                    </select><br><br>
                <input type="text" name="ans" placeholder="Your Answer" class="input" required><br><br>
                <input type="submit" value="Sign Up" class="input">
        </form> 
                <form method="post" action="Home.jsp">
                <input type="submit" value="Cancel" class="input">
                </form>
                <h6 style="color: #0B5345">*By Signing up, you agree to T&C and Privacy Policy.</h6>
                <br>
            </div>
                 
        </center>
    </body>
</html>
<%@include file="Footer.jsp" %>