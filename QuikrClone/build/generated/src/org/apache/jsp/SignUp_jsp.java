package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Header.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("   <style>\n");
      out.write(".navbar {\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: darkslategray;\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\n");
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
      out.write("    font-family: inherit;\n");
      out.write("    margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a:hover, .dropdown:hover .dropbtn {\n");
      out.write("    background-color:#F39C12;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: fixed;\n");
      out.write("    background-color: #f9f9f9;\n");
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
      out.write("    background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bt\n");
      out.write("{\n");
      out.write("    float:right;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".postadd{\n");
      out.write("    border: 2px solid darkslategray;\n");
      out.write("    background-color: greenyellow;\n");
      out.write("    margin-right: 30px;\n");
      out.write("    width: 120px;\n");
      out.write("    height:30px;\n");
      out.write("   float: right;\n");
      out.write("   border-radius:10px;\n");
      out.write("   margin-top: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".postadd:hover\n");
      out.write("{\n");
      out.write("    background-color:#F39C12; \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<title>Home</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div>\n");
      out.write("        <form action=\"#PostAdd\" method=\"post\" >\n");
      out.write("            <input type=\"submit\" value=\"Post Free Ad\" class=\"postadd\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <img src=\"images/Logo.png\"><br>\n");
      out.write("<div class=\"navbar\">\n");
      out.write("  <a href=\"Home.jsp\">Home</a>\n");
      out.write("  <a href=\"Welcome.jsp\">My Account</a>\n");
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
      out.write("  </div> \n");
      out.write("  <div class=\"bt\">\n");
      out.write("  <a href=\"Login.jsp\">Login</a>    \n");
      out.write("  <a href=\"SignUp.jsp\">SignUp</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("   <hr color=\"darkslategray\"> \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script>\n");
      out.write("function mob()\n");
      out.write("{\n");
      out.write("    var x = document.forms[\"SignUpForm\"][\"mobileno\"].value;\n");
      out.write("if (/^\\d{10}$/.test(x)) {\n");
      out.write("    // value is ok, use it\n");
      out.write("} else {\n");
      out.write("    alert(\"Invalid number; must be ten digits\");\n");
      out.write("    return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("    .input[type=text], select {\n");
      out.write("    width: 30%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid darkslategray;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input[type=password], select {\n");
      out.write("    width: 30%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid darkslategray;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input[type=email], select {\n");
      out.write("    width: 30%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid darkslategray;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input[type=submit] {\n");
      out.write("    width: 30%;\n");
      out.write("    background-color: darkslategray;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input[type=submit]:hover {\n");
      out.write("    background-color: #F39C12;\n");
      out.write("}\n");
      out.write(".input[type=text]:focus \n");
      out.write("{\n");
      out.write("      background-color: lightblue;\n");
      out.write("}\n");
      out.write(".input[type=password]:focus \n");
      out.write("{\n");
      out.write("      background-color: lightblue;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<title>Register</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"font-family:verdana\" >\n");
      out.write("        <center>\n");
      out.write("            <h1>Register</h1>\n");
      out.write("            <img src=\"images/RegisterUser.png\" alt=\"RegisterUser\">\n");
      out.write("            <div>\n");
      out.write("            <form action=\"SignUpPage\" name=\"SignUpForm\" method=\"post\" onsubmit=\"return mob()\">\n");
      out.write("                <input type=\"text\" name=\"username\" placeholder=\"Username\" class=\"input\" required><br><br>\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"Password\" class=\"input\" required><br><br>\n");
      out.write("                <input type=\"email\" name=\"email\" placeholder=\"Email\" class=\"input\" required><br><br>\n");
      out.write("                <input type=\"text\" name=\"mobileno\" placeholder=\"Mobile No.\" class=\"input\" required><br><br>\n");
      out.write("                <input type=\"submit\" value=\"Sign Up\" class=\"input\">\n");
      out.write("        </form>\n");
      out.write("            </div>\n");
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
