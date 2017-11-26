package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.TrxReferences;
import dao.BillingDao;
import model.Billing;
import model.PaymentDetails;
import dao.BillingDao;
import dao.dbconnect;
import java.util.ArrayList;

public final class FA_005fBillCo_005fViewDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Billing bill=(Billing)request.getAttribute("bill");
    TrxReferences p=(TrxReferences)request.getAttribute("pay");
String string="hidden";
if(bill.getStatus().equalsIgnoreCase("Pending"))
{
    string="submit";
}

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
      out.write("\n");
      out.write("  <li style=\"float:left\"><a href=\"logo\">Logo</a></li>\n");
      out.write("  <li class=\"dropdown\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"dropbtn\">Billing</a>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("        \t\t<a href=\"FA_BillCo_AddBill.jsp\">Add Bill</a>\n");
      out.write("                        <a href=\"FA_BillCo_ViewBill.jsp\">View Bill</a>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("    </div>\n");
      out.write("  </li>\n");
      out.write("  <li><a href=\"FA_BillCo_DefaultPage.jsp\">Dashboard</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
      out.write("  <div style=\"margin-left:30%;padding:1px 16px;height:500px;\">\n");
      out.write("     \n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write(" <div style=\"padding:1px 16px;height:500px;\">\n");
      out.write("  <h1>Billing Details</h1>\n");
      out.write("  <form action=\"updateBill\" method=\"post\">\n");
      out.write("      \n");
      out.write("\t<p>Block Number:");
      out.print(bill.getBlockNum());
      out.write("</p>\n");
      out.write("\n");
      out.write("   \n");
      out.write("\t<p>Lot Number:");
      out.print(bill.getLotNum());
      out.write("</p>\n");
      out.write("      \n");
      out.write("\t<p>Description of Payment:");
      out.print(bill.getDesc());
      out.write("</p>\n");
      out.write("\t<p>Amount: </p>\n");
      out.write("        <input type=\"number\" step=\"any\" min=\"0\" id=\"amt\" name=\"amount\" value=\"");
      out.print(bill.getTotalDue());
      out.write("\" placeholder=\"");
      out.print(bill.getTotalDue());
      out.write("\" onchange=\"filters()\" readonly >\n");
      out.write("\n");
      out.write("\t<p>Interest</p>\n");
      out.write("        <input type=\"number\" step=\"any\" min=\"0\" id=\"inter\" value=\"");
      out.print(p.getInterest());
      out.write("\" name=\"interest\" placeholder=\"");
      out.print(p.getInterest());
      out.write("\" onchange=\"filters()\" required >\n");
      out.write("\n");
      out.write("\t<p>Current Status:");
      out.print(bill.getStatus());
      out.write("</p>\n");
      out.write("<select name=\"status\">\n");
      out.write("        <option value=\"Pending\">Pending\n");
      out.write("        <option value=\"Paid\">Paid\n");
      out.write("        <option value=\"Overdue\">Overdue\n");
      out.write("    </select>\n");
      out.write("    \n");
      out.write("\t<p>Total Amount: </p>\n");
      out.write("        <input type=\"hidden\" name=\"billId\" value=\"");
      out.print(bill.getID());
      out.write("\">\n");
      out.write("                <input type=\"number\" min=\"0\" id=\"totalamt\" name=\"totalAmount\" placeholder=\"0\" autofocus readonly>\n");
      out.write("                <input type=\"");
      out.print(string);
      out.write("\" id=\"addb\" value=\"Add Bill\">\n");
      out.write("  </form>\n");
      out.write(" <script>\n");
      out.write("        function filters()\n");
      out.write("        {\n");
      out.write("            var input,filter,interest, filter2,total;\n");
      out.write("            input=document.getElementById(\"amt\").value;\n");
      out.write("            filter =input.value;\n");
      out.write("            interest=document.getElementById(\"inter\").value;\n");
      out.write("            filter2=interest.value;\n");
      out.write("            total=document.getElementById(\"totalamt\");\n");
      out.write("            total.value=parseFloat(input);\n");
      out.write("            total.value=parseFloat(input)+parseFloat(interest);\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("      </div>\t\n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" <div class=\"footer\">\n");
      out.write("  <p>Footer</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("        /*n =  new Date();\n");
      out.write("\t\ty = n.getFullYear();\n");
      out.write("\t\tm = n.getMonth() + 1;\n");
      out.write("\t\td = n.getDate();\n");
      out.write("\t\tdocument.getElementById(\"date\").innerHTML = m + \"/\" + d + \"/\" + y;\n");
      out.write("\t\t*/\n");
      out.write("\t\tvar d = new Date();\n");
      out.write("\t\tdocument.getElementById(\"date\").innerHTML = d.toDateString();\n");
      out.write("\t\t\n");
      out.write("\t\t(function () {\n");
      out.write("    function checkTime(i) {\n");
      out.write("        return (i < 10) ? \"0\" + i : i;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function startTime() {\n");
      out.write("        var today = new Date(),\n");
      out.write("            h = checkTime(today.getHours()),\n");
      out.write("            m = checkTime(today.getMinutes()),\n");
      out.write("            s = checkTime(today.getSeconds());\n");
      out.write("        document.getElementById('time').innerHTML = h + \":\" + m + \":\" + s;\n");
      out.write("        t = setTimeout(function () {\n");
      out.write("            startTime()\n");
      out.write("        }, 500);\n");
      out.write("    }\n");
      out.write("    startTime();\n");
      out.write("})();\n");
      out.write("\t</script>\n");
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
