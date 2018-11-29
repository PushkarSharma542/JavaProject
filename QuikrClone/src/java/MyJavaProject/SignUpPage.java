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
        int flag=0;
        String firstname=req.getParameter("FirstName");
        String lastname=req.getParameter("LastName");
        String usern=req.getParameter("username");
        String passw=req.getParameter("password");
        String e_mail=req.getParameter("email");
        String mobile=req.getParameter("mobileno");
        String address=req.getParameter("Address");
        String ques=req.getParameter("securityQ");
        String answer=req.getParameter("ans");
        String u="root";
        String p="";
        String url="jdbc:mysql://localhost:3306/userinfo";
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,u,p);
            Statement st1=con.createStatement();
            String query="insert into userdetails values('"+firstname+"','"+lastname+"','"+usern+"','"+passw+"','"+e_mail+"','"+mobile+"','"+address+"','"+ques+"','"+answer+"')";
            int count=st1.executeUpdate(query);
            flag=1;
        }
        catch (ClassNotFoundException | SQLException ex) {}
        if(flag==0)
        {
            res.sendRedirect("SignUp.jsp");
        }
        else
        {
            res.sendRedirect("Login.jsp");
        }
    }
}