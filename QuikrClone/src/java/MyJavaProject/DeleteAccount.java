/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyJavaProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PushkarSharma
 */
public class DeleteAccount extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param req
     * @param res
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException 
    {
        String uname =req.getParameter("username");
        String secq=req.getParameter("securityQ");
        String seca=req.getParameter("ans");
        String dbuname;
        String dbq;
        String dbans;
        try 
        {
            PrintWriter out=res.getWriter();
            Class.forName("com.mysql.jdbc.Driver");
            String query="select * from userdetails where username='"+uname+"' and securityQ='"+secq+"' and securityAns='"+seca+"' ";
            String url="jdbc:mysql://localhost:3306/userinfo";
            String user="root";
            String pas="";
            Connection con=DriverManager.getConnection(url,user,pas);
            Statement s=con.createStatement();
            ResultSet r=s.executeQuery(query);
            Statement st=con.createStatement();
            String query1="delete from userdetails where username='"+uname+"'";
            while(r.next())
            {
                dbuname=r.getString("username");
                dbq=r.getString("securityQ");
                dbans=r.getString("securityAns");
                HttpSession session=req.getSession();
                if(dbuname.equals(uname) && dbq.equals(secq) && dbans.equals(seca))
                {    
                    int del=st.executeUpdate(query1);
                    session.removeAttribute("key");
                    session.invalidate();
                    res.sendRedirect("Home.jsp");
                }
            }
            out.println("not yipee");
    }   catch (ClassNotFoundException | SQLException ex) {}
    }
}