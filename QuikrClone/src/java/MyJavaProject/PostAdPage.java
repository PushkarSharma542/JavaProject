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
        String Cat=null;
        PrintWriter out=res.getWriter();
        String select=req.getParameter("AdCategory");
        if(select.equals("mobile") | select.equals("laptop"))
        {
            Cat="Electronics";
        }
        else if(select.equals("school book") | select.equals("college book") | select.equals("stationary item"))
        {
            Cat="Education";
        }
        else if(select.equals("car") | select.equals("bike") | select.equals("bicycle"))
        {
            Cat="Automobiles";
        }
        String price=req.getParameter("price");
        String desc=req.getParameter("description");
        String url="jdbc:mysql://localhost:3306/userinfo";
        String u="root";
        String p="";
        String date=GetDate.getDate();
        String fname = null;
        String lname = null;
        HttpSession session=req.getSession();
        String cUser=(String)session.getAttribute("username");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,u,p);
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
                }
            }
            String name=fname+lname;
            int itemno=GetRandomNumber.RandomNumFunc();
            String query="insert into postad values('"+Cat+"','"+itemno+"','"+select+"','"+cUser+"','"+name+"','"+price+"','"+desc+"','"+date+"')";
            int r=st.executeUpdate(query);
            res.sendRedirect("Home.jsp");
        }
        catch(SQLException | ClassNotFoundException ex){}
    }
    
}