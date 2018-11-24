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
public class PostAdPage extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param req servlet request
     * @param res servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
        PrintWriter out=res.getWriter();
        String select=req.getParameter("AdCategory");
        String price=req.getParameter("price");
        String desc=req.getParameter("description");
        String url="jdbc:mysql://localhost:3306/userinfo";
        String u="root";
        String p="";
        String fname = null;
        String lname = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,u,p);
            HttpSession session=req.getSession();
            String cUser=(String)session.getAttribute("username");
            String query1="select * from userdetails where username='"+cUser+"'";
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            ResultSet rs=st1.executeQuery(query1);
            while(rs.next())
            {
                String us=rs.getString("username");
                if(cUser.equals(us))
                {
                    fname=rs.getString("first_name");
                    lname=rs.getString("last_name");
                    out.println(fname);
                    out.println(lname);
                }
            }
            String name=fname+lname;
            String query="insert into postad values('"+select+"','"+name+"','"+price+"','"+desc+"')";
            int r=st.executeUpdate(query);
            out.println("posted");
        }
        catch(SQLException | ClassNotFoundException ex){}
    }
}