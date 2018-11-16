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
        String uname=req.getParameter("username");
        String pass=req.getParameter("Npassword");
        //String pass1=req.getParameter("Cpassword");
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
            out.println("password changed!!!");
            out.println("<html><body><form action='Login.html' method='post'><br><input type='submit' value='Login'>");
                out.println("</form></body></html>");
        } catch (ClassNotFoundException | SQLException ex) {}
               if(flag==1)
               {
                   out.println("username: "+uname+" not found!!!");
                   out.println("<html><body><form action='ForgotPwd.html' method='post'><br><input type='submit' value='Try Again'>");
                out.println("</form></body></html>");
               }
    }
}