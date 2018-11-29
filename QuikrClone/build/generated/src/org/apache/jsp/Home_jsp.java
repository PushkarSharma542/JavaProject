package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.time.LocalDateTime;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header.jsp");
    _jspx_dependants.add("/Footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("   <style>\n");
      out.write(".navbar {\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color:white;\n");
      out.write("    font-family: verdana;\n");
      out.write("    border-radius: 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a {\n");
      out.write("    float: left;\n");
      out.write("    font-size: 16px;\n");
      out.write("    color: black;\n");
      out.write("    margin-top: 10px;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("    float: left;\n");
      out.write("    overflow: hidden;\n");
      out.write("    margin-top: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropbtn {\n");
      out.write("    font-size: 16px;    \n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    color: black;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    background-color: inherit;\n");
      out.write("    font-family: verdana;\n");
      out.write("    margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: fixed;\n");
      out.write("    background-color: white;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    float: none;\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {\n");
      out.write("    background-color: #2E86C1;\n");
      out.write("    color:white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".postadd{\n");
      out.write("    border:none;\n");
      out.write("    background-color: #2E86C1;\n");
      out.write("    margin-right: 10px;\n");
      out.write("    margin-top: 20px;\n");
      out.write("    color: white;\n");
      out.write("    width: 100px;\n");
      out.write("    margin-top: 4px;\n");
      out.write("    height:40px;\n");
      out.write("   float: right;\n");
      out.write("   border-radius:10px;\n");
      out.write("   font-family: verdana;\n");
      out.write("   cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".postadd:hover\n");
      out.write("{\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write(".right{\n");
      out.write("    float: right;\n");
      out.write("}\n");
      out.write("h4{\n");
      out.write("    float: right;   \n");
      out.write("    margin-top: 12px;\n");
      out.write("    margin-right: 10px;\n");
      out.write("    color:#2E86C1;\n");
      out.write("    font-family: Gill Sans MT;\n");
      out.write("}\n");
      out.write(".logo{\n");
      out.write("    float:left;\n");
      out.write("}\n");
      out.write(".postadd1{\n");
      out.write("    border:1px solid #F1C40F;\n");
      out.write("    background-color: #F4E60A;\n");
      out.write("    margin-right: 10px;\n");
      out.write("    color: white;\n");
      out.write("    width: 85px;\n");
      out.write("    height:15px;\n");
      out.write("   font-family: Rockwell-Condensed;\n");
      out.write("   cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body style=\"font-family:verdana\">\n");
      out.write("<div class=\"navbar\">\n");
      out.write("    ");

            if(session.getAttribute("username")==null)
            {
                out.println("<form action='Login.jsp' method='post' class='right'>");
                String u="Guest";
            out.println("<input type='submit' value='Login' class='postadd'><i class='fa fa-sort-down'></i>");
        out.println("</form>");  
        out.println("<h4>Welcome "+u+"</h4>");
            }
            else
            {
                out.println("<form action='LogoutPage' method='post' class='right'>");
                String u=(String)session.getAttribute("username");
            out.println("<input type='submit' value='Logout' class='postadd'>");
        out.println("</form>");
        out.println("<h4>Welcome "+u+"</h4>");
            }
        
      out.write("\n");
      out.write("        <br><br><br>\n");
      out.write("    <img style=\"margin-left:5px\" src=\"images/Logo.jpg\" height=\"70\" width=\"150\" class=\"logo\">\n");
      out.write("    <a href=\"Home.jsp\">Home</a>\n");
      out.write("    <div class=\"dropdown\">\n");
      out.write("        <button class=\"dropbtn\">Categories</button>\n");
      out.write("        <div class=\"dropdown-content\">\n");
      out.write("            <a href=\"Electronics.jsp\">Electronics</a>\n");
      out.write("            <a href=\"Education.jsp\">Education</a>\n");
      out.write("                <a href=\"Automobiles.jsp\">Automobiles</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <a href=\"About.jsp\">About</a>\n");
      out.write("    ");

        if(session.getAttribute("username")!=null)
        {
            out.println("<div class='dropdown'><button class='dropbtn'>My Account</button>");
            out.println("<div class='dropdown-content'>");
            out.println("<a href='MyProfile.jsp'>My Profile</a>");
            out.println("<a href='MyAds.jsp'>My Ads</a></div></div>");
        }
    
      out.write("\n");
      out.write("    <div class=\"right\">\n");
      out.write("        <a href=\"SignUp.jsp\" >Register</a>\n");
      out.write("        <a href=\"PostAd.jsp\" class=\"postadd1\">Post Free Ad</a>\n");
      out.write("        <a href=\"Cart.jsp\"><img src=\"images/cart.png\" height=\"35\" width=\"35\" style=\"margin-top: -10px;margin-left: -15px;\"></a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    <hr>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<html><head>\n");
      out.write("    <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#F2F4F4\"><br>\n");
      out.write("    <center><h6>*All recent ads will show here</h6></center>\n");

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo","root","");
        Statement s=con.createStatement();
        ResultSet r=s.executeQuery("select * from postad order by date DESC");
        while(r.next())
        {            
            String user=r.getString("sellerName");
            int itemno=r.getInt("itemNumber");
            String cat=r.getString("category");
            String subCat=r.getString("itemType");
            String price=r.getString("price");
            String desc=r.getString("description");
            String Date=r.getString("date");
            out.println("<center><img src='images/default.gif'>");
            out.print("<div><form style='font-family: arial'><table>");
            out.print("<tr><td>"+"Posted on  : "+Date+"</td></tr>");
            out.print("<tr><td>"+"Item Number : "+itemno+"</td></tr>");
            out.print("<tr><td>"+"Item category : "+cat+"</td></tr>");
            out.print("<tr><td>"+"Item type : "+subCat+"</td></tr>");
            out.println("<tr><td>"+"Seller name : "+user+"</td></tr>");
            out.print("<tr><td>"+"Price : Rs. "+price+"</td></tr>");
            out.print("<tr><td>"+"Description : "+desc+"</td></tr>");
            out.print("<tr><td><br><center><form action='#buynow' method='post'><input type='submit' style='background-color: yellow; padding: 4px 10px; border:1px solid darkslategray; border-radius: 4px;' value='Buy Now'></form></td></center></tr></table>");
            out.print("</form></div><br></center>");
        }
    
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("    ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("body{\n");
      out.write("    font-family: verdana;\n");
      out.write("}\n");
      out.write(".ia{\n");
      out.write("     margin-left: 2px;\n");
      out.write("}\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <hr>\n");
      out.write("         <img style=\"margin-left:5px\" src=\"images/Logo.jpg\" height=\"70\" width=\"150\"><br>\n");
      out.write("        <h5 style=\"margin-top: 5px;margin-left: 15px\">\n");
      out.write("        Quikr India Pvt Ltd,<br>\n");
      out.write("        Block B, Mohan Cooperative Industrial Estate,<br> Badarpur, New Delhi, Delhi - 110076<br>\n");
      out.write("\n");
      out.write("        feedback@quikr.com\n");
      out.write("        </h5>\n");
      out.write("        <center>\n");
      out.write("        <div class=\"img\">\n");
      out.write("        <a href=\"http://www.instagram.com\"><img src=\"images/insta.png\" height=\"50\" width=\"50\" alt=\"Instagram\"></a>&nbsp;\n");
      out.write("        <a href=\"http://www.facebook.com\"><img src=\"images/fb.png\" height=\"50\" width=\"50\" alt=\"Facebook\"></a>&nbsp;\n");
      out.write("        <a href=\"http://www.linkedin.com\"><img src=\"images/linkedin.png\" height=\"50\" width=\"50\" alt=\"Linkedin\"></a>&nbsp;\n");
      out.write("        <a href=\"http://www.twitter.com\"><img src=\"images/tweeter.png\" height=\"50\" width=\"50\" alt=\"Twitter\"></a>&nbsp;\n");
      out.write("    </div>\n");
      out.write("            <h6>Copyright © 2008 - 2018 Quikr India Private Limited</h6>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
