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
public class DeleteAd extends HttpServlet {

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
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
        PrintWriter out=res.getWriter();
        int inum=Integer.parseInt(req.getParameter("inum"));
        HttpSession session=req.getSession();
        String uname=(String)session.getAttribute("username");
        String query="delete from postad where itemNumber='"+inum+"' and sellerUname='"+uname+"'";
        String url="jdbc:mysql://localhost:3306/userinfo";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,"root","");
            Statement st=con.createStatement();
            int c=st.executeUpdate(query);
            res.sendRedirect("MyAds.jsp");
        }
        catch(ClassNotFoundException | SQLException ex) {}
    }
    }