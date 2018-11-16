/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyJavaProject;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author PushkarSharma
 */
public class SignUpPage extends HttpServlet 
{
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
        PrintWriter out=res.getWriter();
        try 
        {
            String usern=req.getParameter("username");
            String passw=req.getParameter("password");
            String e_mail=req.getParameter("email");
            String mobile=req.getParameter("mobileno");
            Class.forName("com.mysql.jdbc.Driver");
            String u="root";
            String p="";
            String url="jdbc:mysql://localhost:3306/userinfo";
            Connection con=DriverManager.getConnection(url,u,p);
            Statement st1=con.createStatement();
            String query="insert into userdetails values('"+usern+"','"+passw+"','"+e_mail+"','"+mobile+"')";
            int count=st1.executeUpdate(query);
            out.println("Successfully Registered!!! Thanks for your support, Login now using same credentials.");
        }
        catch (ClassNotFoundException | SQLException ex) {}
        out.println("<html><body><form action='Login.html' method='post'> <br><input type='submit' value='Login Now'>");
        out.println("</form></body></html>");
    }
}