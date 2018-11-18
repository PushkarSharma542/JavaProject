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
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
/**
 *
 * @author PushkarSharma
 */
public class LoginPage extends HttpServlet 
{

    /**
     *
     * @param req
     * @param res
     * @throws IOException
     * @throws javax.servlet.ServletException
     */
        @Override
        public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
        {
                String uname =req.getParameter("username");
                String pass=req.getParameter("password");
                String dbuname;
                String dbpass;
            try {
                PrintWriter out=res.getWriter();
                Class.forName("com.mysql.jdbc.Driver");
                String query="select * from userdetails where username='"+uname+"' and password='"+pass+"'";
                String url="jdbc:mysql://localhost:3306/userinfo";
                String user="root";
                String pas="";
                Connection con=DriverManager.getConnection(url,user,pas);
                Statement s=con.createStatement();
                ResultSet r=s.executeQuery(query);
                while(r.next())
                {
                    dbuname=r.getString("username");
                    dbpass=r.getString("password");
                    HttpSession session=req.getSession();
                    if(dbuname.equals(uname) && dbpass.equals(pass))
                    {    
                        session.setAttribute("username",uname);
                        res.sendRedirect("Welcome.jsp");
                    }
                }
                out.println("Your Username or Password is incorrect, Please try again using correct login credentials or Register for free.");
                out.println("<html><body><form action='Login.html' method='post'><br><input type='submit' value='Login'>");
                out.println("</form><form action='SignUp.html' method='post'><input type='submit' value='Register'>");
                out.println("</form></body></html>");
            } catch (ClassNotFoundException | SQLException ex) {}
        }
} 
