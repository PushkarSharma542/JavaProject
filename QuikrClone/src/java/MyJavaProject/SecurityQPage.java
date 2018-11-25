/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyJavaProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PushkarSharma
 */
public class SecurityQPage extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods
     * @param req
     * @param res
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
    {
        HttpSession session=req.getSession();
        if(session.getAttribute("fpwd")==null)
        {
            res.sendRedirect("Home.jsp");
        }
        PrintWriter out=res.getWriter();
        String user=req.getParameter("username");
        String ques=req.getParameter("securityQ");
        String a=req.getParameter("ans");
        String url="jdbc:mysql://localhost:3306/userinfo";
        String u="root";
        String p="";
        int flag=0;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,u,p);
        Statement s=con.createStatement();
        String query="select * from userdetails where username='"+user+"' and securityQ='"+ques+"' and securityAns='"+a+"'";
        ResultSet r=s.executeQuery(query);
        while(r.next())
        {
            String duser=r.getString("username");
            String dques=r.getString("securityQ");
            String dans=r.getString("securityAns");
            if(duser.equals(user) && dques.equals(ques) && dans.equals(a))
            {    
                flag=1;
                session.setAttribute("tempuser",user);
                res.sendRedirect("ForgotPwd.jsp");
            }
        }
        }
        catch (ClassNotFoundException | SQLException ex) {}
        if(flag==0)
        {
            res.sendRedirect("SecurityQ.jsp");
        }
    }
}