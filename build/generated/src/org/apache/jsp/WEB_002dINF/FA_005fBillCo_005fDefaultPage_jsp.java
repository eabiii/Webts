package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FA_005fBillCo_005fDefaultPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/../header.jsp");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write(" \n");
      out.write("    \n");
      out.write(" <ul>\n");
      out.write("    \n");
      out.write("  <li><a href=\"Login.html\">Log Out</a></li>\n");
      out.write("  <li><a href=\"#contact\">Contact</a></li>\n");
      out.write("  <li><a href=\"Login.html\">Login</a></li>\n");
      out.write("  <li style=\"float:left\"><a href=\"logo\">Logo</a></li>\n");
      out.write("  <li><a class=\"active\" href=\"MarketingPage.html\">Home</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("  <div style=\"margin-left:30%;padding:1px 16px;height:1000px;\">\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("  <h2>Add Check</h2>\n");
      out.write("  \n");
      out.write("\t\t  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Check Number</label>\n");
      out.write("    <div class=\"col-sm-5\">\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"First Name\">\n");
      out.write("    </div>\n");
      out.write("                                                                                          \n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Client Number</label>\n");
      out.write("    <div class=\"col-sm-5\">\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"First Name\">\n");
      out.write("    </div>\n");
      out.write("  </div>                                                                                        \n");
      out.write("        \n");
      out.write("  <div class=\"form-group\">\n");
      out.write("      <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Due Date</label>\n");
      out.write("\t  <div class=\"col-sm-5\">\n");
      out.write("      <input type=\"date\" class=\"form-control\" id=\"exampleInputDOB1\" placeholder=\"Date of Birth\">\n");
      out.write("    </div>\n");
      out.write("</div> \n");
      out.write("                                                                                               \n");
      out.write("                                                                                           \n");
      out.write("                                                                                               \n");
      out.write("                                                                                     \n");
      out.write("                                                                                          \n");
      out.write("                                                                                          \n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write(" <div class=\"footer\">\n");
      out.write("  <p>Footer</p>\n");
      out.write("</div>");
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
