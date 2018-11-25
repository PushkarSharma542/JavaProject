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
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PushkarSharma
 */
public class ForgotPwdPage extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param req
     * @param res
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
        HttpSession session=req.getSession();
        if(session.getAttribute("fpwd")==null)
        {
            res.sendRedirect("Home.jsp");
        }
        String uname=(String)session.getAttribute("tempuser");
        String pass=req.getParameter("Npassword");
        String pass1=req.getParameter("Cpassword");
        PrintWriter out=res.getWriter();
        int flag=1;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String u="root";
            String p="";
            String url="jdbc:mysql://localhost:3306/userinfo";
            Connection con=DriverManager.getConnection(url,u,p);
            String query=("update userdetails set password='"+pass+"' where username='"+uname+"' ");
            Statement s=con.createStatement();
            int count=s.executeUpdate(query);
            flag=0;
        } catch (ClassNotFoundException | SQLException ex) {}
        if(flag==1)
        {
           res.sendRedirect("ForgotPwd.jsp");
        }
        else
        {
            session.removeAttribute("tempuser");
            session.removeAttribute("fpwd");
            //session.invalidate();
            res.sendRedirect("Login.jsp");
        }
    }
}