package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FA_005fBillCo_005fBillHomeOwners_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("<!DOCTYPE html>\n");
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
      out.write("                        <a href=\"FA_BillCo_NewHomeOwners.jsp\">New HomeOwners</a>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </li>\n");
      out.write("  <li><a href=\"FA_BillCo_DefaultPage.jsp\">Dashboard</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');
      out.write('\n');

    String x=request.getParameter("submit");
if(x!=null &&x.equals("View Details")){
    out.println("asa");
    

}



      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SW-ENGG</title>\n");
      out.write("    </head>\n");
      out.write(" <style>\n");
      out.write("table {\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th, td {\n");
      out.write("    padding: 8px;\n");
      out.write("    text-align: left;\n");
      out.write("    border-bottom: 1px solid #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:hover{background-color:#f2f3f3}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("  <div style=\"padding:1px 16px;height:500px;\">\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("  <h1><center>Billing User!\n");
      out.write("  ");

         out.print(x);
      
      out.write("\n");
      out.write("  </h1>\n");
      out.write("  <h2><center>List of all Unpaid Bills</h2>\n");
      out.write("  <form action=\"FA_BillCo_BillHomeOwners_ViewDetails.jsp\" method=\"post\">\n");
      out.write("   <table>\n");
      out.write("  <tr>\n");
      out.write("   <th><center>Block Number</th>\n");
      out.write("      <th><center>Lot Number</th>    \n");
      out.write("   <th><center>Pay Date</th>\n");
      out.write("   <th><center>Amount</th>\n");
      out.write("   <th><center> </th>\n");
      out.write("\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("<td><center>12</td>\n");
      out.write("    <td><center>14</td>\n");
      out.write("    <td><center>December 2017</td>\n");
      out.write("    <td><center>1000.00</td>\n");
      out.write("    <td><center><a href=\"FA_BillCo_BillHomeOwners_ViewDetails.jsp\"><input type=\"submit\" name=\"submit\" class=\"button\"  value=\"View Details\"></a></center></td>\n");
      out.write("  </tr>\n");
      out.write("    <tr>\n");
      out.write("<td><center>12</td>\n");
      out.write("    <td><center>14</td>\n");
      out.write("    <td><center>December 2017</td>\n");
      out.write("    <td><center>1000.00</td>\n");
      out.write("    <td><center><input type=\"submit\" class=\"button\" value=\"View Details\"></center></td>\n");
      out.write("  </tr>\n");
      out.write("  </table>\n");
      out.write("</form>\n");
      out.write("\t\t\n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" <div class=\"footer\">\n");
      out.write("  <p>Footer</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
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
