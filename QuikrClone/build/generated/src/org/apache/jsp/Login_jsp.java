package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("   <style>\n");
      out.write(".navbar {\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color:#0B5345;\n");
      out.write("    font-family: verdana;\n");
      out.write("    border-radius: 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a {\n");
      out.write("    float: left;\n");
      out.write("    font-size: 16px;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("    float: left;\n");
      out.write("    overflow: hidden;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown .dropbtn {\n");
      out.write("    font-size: 16px;    \n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    color: white;\n");
      out.write("    font-weight: bold;\n");
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
      out.write("    background-color: #0B5345;\n");
      out.write("    color:white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".postadd{\n");
      out.write("    border: 2px solid #0B5345;\n");
      out.write("    background-color: white;\n");
      out.write("    margin-right: 10px;\n");
      out.write("    color: darkgreen;\n");
      out.write("    width: 100px;\n");
      out.write("    height:40px;\n");
      out.write("   float: right;\n");
      out.write("   border-radius:10px;\n");
      out.write("   font-family: verdana;\n");
      out.write("   cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".postadd:hover\n");
      out.write("{\n");
      out.write("    background-color:#0B5345;\n");
      out.write("    color:white;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write(".right{\n");
      out.write("    float: right;\n");
      out.write("}\n");
      out.write(".ads{\n");
      out.write("    float:right;\n");
      out.write("    background-color:greenyellow;\n");
      out.write("    color: #0B5345;\n");
      out.write("    text-decoration: none;\n");
      out.write("    margin-right: 6px;\n");
      out.write("    padding: 8px 15px;\n");
      out.write("    margin-top: -15px;\n");
      out.write("    border: 1px solid #0B5345;\n");
      out.write("    border-radius: 5px;\n");
      out.write("}\n");
      out.write("h4{\n");
      out.write("    float: right;\n");
      out.write("    margin-right: 8px;\n");
      out.write("    margin-top: 28px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body style=\"font-family:verdana\">\n");
      out.write("    <div>\n");
      out.write("        <a href=\"Cart.jsp\"><img src=\"images/mycart.png\" height=\"50\" width=\"50\" style=\"float:right; margin-right:5px;margin-left:4px; margin-top:12px\"></a>\n");
      out.write("        ");

            if(session.getAttribute("username")==null)
            {
                out.println("<form action='Login.jsp' method='post' class='right'>");
                String u="Guest";
                pageContext.setAttribute("username",u);
            out.println("<br><input type='submit' value='Login' class='postadd'>");
        out.println("</form>");
            }
            else
            {
                out.println("<form action='LogoutPage' method='post' class='right'>");
                String user=(String)session.getAttribute("username");
                String u=(String)session.getAttribute("username");
                pageContext.setAttribute("username",u);
            out.println("<br><input type='submit' value='Logout' class='postadd'>");
        out.println("</form>");
            }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <h4 style=\"color: #0B5345\">");
out.println("Welcome ");out.print(pageContext.findAttribute("username"));
      out.write("</h4>\n");
      out.write("    <img src=\"images/Logo.png\"><br>\n");
      out.write("    \n");
      out.write("<div class=\"navbar\">\n");
      out.write("  <a href=\"Home.jsp\">Home</a>\n");
      out.write("  <a href=\"MyProfile.jsp\">My Profile</a>\n");
      out.write("  <a href=\"About.jsp\">About</a>\n");
      out.write("  <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\">Categories \n");
      out.write("    </button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"#\">Electronics</a>\n");
      out.write("      <a href=\"#\">Education</a>\n");
      out.write("      <a href=\"#\">Automobiles</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"right\">\n");
      out.write("      <a href=\"PostAd.jsp\">Post Free Ad</a>\n");
      out.write("      <a href=\"SignUp.jsp\" >Register\n");
      out.write("      </a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("   <hr color=\"#0B5345\"> \n");
      out.write("   ");
if(session.getAttribute("username")!=null)
   {
        out.println("<form action='MyAds.jsp' method='post' >");
        out.println("<br><a href='MyAds.jsp' class='ads'>My Ads</a>");
        out.println("</form>");
   }
   
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("        .input[type=text], select {\n");
      out.write("    width: 20%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #0B5345;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input[type=password], select {\n");
      out.write("    width: 20%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #0B5345;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input[type=submit] {\n");
      out.write("    width: 7%;\n");
      out.write("    background-color: white;\n");
      out.write("    color: #0B5345;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: 2px solid #0B5345;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input[type=submit]:hover {\n");
      out.write("    background-color:#0B5345;\n");
      out.write("    color:white;\n");
      out.write("    font-weight: bold;\n");
      out.write("    border: 1px solid white; \n");
      out.write("}\n");
      out.write("\n");
      out.write(".input[type=text]:focus \n");
      out.write("{\n");
      out.write("      background-color: lightcyan;\n");
      out.write("      color: black;\n");
      out.write("}\n");
      out.write(".input[type=password]:focus \n");
      out.write("{\n");
      out.write("      background-color:lightcyan;\n");
      out.write("      color:black;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"font-family:verdana; display: inline;\">\n");
      out.write("        <center>\n");
      out.write("            <h2>Sign In</h2>\n");
      out.write("       <img src=\"images/theUser.png\" alt=\"User\" height=\"200\" width=\"200\"><br><br>\n");
      out.write("       <div>\n");
      out.write("       <form action=\"LoginPage\" method=\"post\"><br>\n");
      out.write("        <input type=\"text\" name=\"username\" placeholder=\"Username\" class=\"input\" required><br><br>\n");
      out.write("        <input type=\"password\" name=\"password\" placeholder=\"Password\" class=\"input\" required><br><br>\n");
      out.write("        <input type=\"submit\" name=\"Login\" value=\"Sign In\" class=\"input\">\n");
      out.write("        </form>\n");
      out.write("           <form method=\"post\" action=\"Home.jsp\">\n");
      out.write("                <input type=\"submit\" value=\"Cancel\" class=\"input\">\n");
      out.write("        </form>\n");
      out.write("           <br>\n");
      out.write("           </div>\n");
      out.write("       <div>\n");
      out.write("           <a href=\"SecurityQ.jsp\">Forgot Password?</a><br>\n");
      out.write("        <h6>*By Signing in, you agree to T&C and Privacy Policy.</h6>     \n");
      out.write("           </div>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
      out.write("        <hr color=\"#0B5345\">\n");
      out.write("        <img src=\"images/Logo.png\" class=\"ia\"><br>\n");
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
