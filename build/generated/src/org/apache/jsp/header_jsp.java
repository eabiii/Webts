package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SW-ENGG</title>\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write(" \n");
      out.write("    \n");
      out.write(" <ul>\n");
      out.write("    \n");
      out.write("  <li><a href=\"Login.html\">Log Out</a></li>\n");
      out.write("    <li class=\"dropdown\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"dropbtn\">Reports</a>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("        \t\t<a href=\"adminAddCustomer.php\">Balance Sheet</a>\n");
      out.write("\t\t\t\t<a href=\"adminRegisterVehicle.php\">Income Statement</a>\n");
      out.write("\t\t\t\t<a href=\"adminCheckConfirmations.php\">Cash Flow Statement</a>\n");
      out.write("                                <a href=\"adminCheckConfirmations.php\">Statement of Retained Earnings</a>\n");
      out.write("    </div>\n");
      out.write("  </li>\n");
      out.write("    <li class=\"dropdown\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"dropbtn\">Documents</a>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("        \t\t<a href=\"FA_BillCo_Documents_Checks.jsp\">Checks</a>\n");
      out.write("\t\t\t\t<a href=\"FA_BillCo_Documents_Vouchers.jsp\">Vouchers</a>\n");
      out.write("\t\t\t\t<a href=\"FA_BillCo_Documents_Receipts .jsp\">Receipts</a>\n");
      out.write("    </div>\n");
      out.write("  </li>\n");
      out.write("    <li class=\"dropdown\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"dropbtn\">HomeOwners</a>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("        \t\t<a href=\"adminAddCustomer.php\">View HomeOwners</a>\n");
      out.write("\t\t\t\t<a href=\"adminRegisterVehicle.php\">View Properties</a>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </li>\n");
      out.write("  <li class=\"dropdown\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"dropbtn\">Transaction</a>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("        \t\t<a href=\"FA_BillCo_TransactionJournal.jsp\">Transaction Journal</a>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </li>\n");
      out.write("  <li style=\"float:left\"><a href=\"logo\">Logo</a></li>\n");
      out.write("  <li class=\"dropdown\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"dropbtn\">Billing</a>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("        \t\t<a href=\"FA_BillCo_BillHomeOwners.jsp\">Bill HomeOwners</a>\n");
      out.write("                        <a href=\"FA_BillCo_BillHomeOwners.jsp\">New HomeOwners</a>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </li>\n");
      out.write("  <li><a href=\"FA_BillCo_DefaultPage.jsp\">Dashboard</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
