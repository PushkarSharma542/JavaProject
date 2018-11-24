package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PostAd_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("   <style>\n");
      out.write(".navbar {\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color:darkslategray;\n");
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
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("    float: left;\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown .dropbtn {\n");
      out.write("    font-size: 16px;    \n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    background-color: inherit;\n");
      out.write("    font-family: verdana;\n");
      out.write("    margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a:hover, .dropdown:hover .dropbtn {\n");
      out.write("        background-color: #F9E79F;\n");
      out.write("        color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: fixed;\n");
      out.write("    background-color: #F9E79F;\n");
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
      out.write("    background-color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".postadd{\n");
      out.write("    border: 2px solid darkslategray;\n");
      out.write("    background-color: #F9E79F;\n");
      out.write("    margin-right: 10px;\n");
      out.write("    width: 100px;\n");
      out.write("    height:40px;\n");
      out.write("   float: right;\n");
      out.write("   border-radius:10px;\n");
      out.write("   font-family: verdana;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".postadd:hover\n");
      out.write("{\n");
      out.write("    background-color:lightgoldenrodyellow;\n");
      out.write("}\n");
      out.write(".right{\n");
      out.write("    float: right;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("h4{\n");
      out.write("    float: right;\n");
      out.write("    margin-right: 8px;\n");
      out.write("    margin-top: 28px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.5.0/css/all.css\" integrity=\"sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU\" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("<body style=\"font-family:verdana\">\n");
      out.write("    <div>\n");
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
      out.write("    <h4>");
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
      out.write("      <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"#\">Electronics</a>\n");
      out.write("      <a href=\"#\">Education</a>\n");
      out.write("      <a href=\"#\">Automobiles</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"right\">\n");
      out.write("      <a href=\"PostAd.jsp\">Post an Ad</a>\n");
      out.write("      <a href=\"SignUp.jsp\" >Register&nbsp;\n");
      out.write("          <i class=\"fas fa-user\" style=\"font-size:17px; color: lightcoral;\"></i>\n");
      out.write("      </a>\n");
      out.write("  </div>\n");
      out.write("        \n");
      out.write("</div>\n");
      out.write("   <hr color=\"darkslategray\"> \n");
      out.write("   ");
if(session.getAttribute("username")!=null)
   {
       out.println("<img src='images/mycart.png' style='float:right; margin-right:5px'>");
   }
   
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');
 
    if(session.getAttribute("username")==null)
    {
        response.sendRedirect("Login.jsp");
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Post Free Ad</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"font-family: verdana\">\n");
      out.write("        <center>\n");
      out.write("            <h1>Post Free Ad</h1>\n");
      out.write("        <div>\n");
      out.write("            <form action=\"PostAddPage\" method=\"post\">\n");
      out.write("                <select name=\"AddCategory\" required>\n");
      out.write("                    <option value=\"\" disabled=\"disabled\" selected=\"selected\" class=\"select\">Select your category</option>\n");
      out.write("                    <option name=\"electronics\" value=\"electronics\" class=\"select\" >Electronics</option>\n");
      out.write("                    <option name=\"education\" value=\"education\" class=\"select\">Education</option>\n");
      out.write("                    <option name=\"automobiles\" value=\"automobiles\" class=\"select\">Automobiles</option>\n");
      out.write("                    </select>\n");
      out.write("                <input type=\"number\" name=\"price\" Placeholder=\"Set Price\" required>\n");
      out.write("            </form> \n");
      out.write("            </div>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            .img{\n");
      out.write("    float: right;\n");
      out.write("    margin-top: 10px;\n");
      out.write("    margin-right: 5px;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    font-family: verdana;\n");
      out.write("}\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <hr color=\"darkslategray\">\n");
      out.write("        <img src=\"images/Logo.png\">\n");
      out.write("        <div class=\"img\">\n");
      out.write("        <i><b>Follow us on :-</b></i><br><br>\n");
      out.write("        <a href=\"http://www.instagram.com\"><img src=\"images/insta.png\" height=\"50\" width=\"50\" alt=\"Instagram\"></a>&nbsp;\n");
      out.write("        <a href=\"http://www.facebook.com\"><img src=\"images/fb.png\" height=\"50\" width=\"50\" alt=\"Facebook\"></a>&nbsp;\n");
      out.write("        <a href=\"http://www.linkedin.com\"><img src=\"images/linkedin.png\" height=\"50\" width=\"50\" alt=\"Linkedin\"></a>&nbsp;\n");
      out.write("        <a href=\"http://www.twitter.com\"><img src=\"images/tweeter.png\" height=\"50\" width=\"50\" alt=\"Twitter\"></a>&nbsp;\n");
      out.write("    </div>\n");
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
