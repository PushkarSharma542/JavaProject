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
                int flag=1;
                while(r.next())
                {
                    dbuname=r.getString("username");
                    dbpass=r.getString("password");
                    HttpSession session=req.getSession();
                    if(dbuname.equals(uname) && dbpass.equals(pass))
                    {    
                        flag=0;
                        session.setAttribute("username",uname);
                        session.removeAttribute("login");
                        res.sendRedirect("Home.jsp");
                    }
                }
                if(flag==1)
                {
                    res.sendRedirect("Login.jsp");
                }
            } catch (ClassNotFoundException | SQLException ex) {}
        }
} 
