
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>

<%
    String x=request.getParameter("submit");
if(x!=null &&x.equals("View Details")){
    out.println("asa");
    

}


%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SW-ENGG</title>
    </head>
 <style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    padding: 8px;
    text-align: left;
    border-bottom: 1px solid #ddd;
}

tr:hover{background-color:#f2f3f3}
</style>
<body>
  <div style="padding:1px 16px;height:500px;">
<br>
<br>
<br>
  <h1><center>Billing User!
  <%
         out.print(x);
      %>
  </h1>
  <h2><center>List of all Unpaid Bills</h2>
  <form action="FA_BillCo_BillHomeOwners_ViewDetails.jsp" method="post">
   <table>
  <tr>
   <th><center>Block Number</th>
      <th><center>Lot Number</th>    
   <th><center>Pay Date</th>
   <th><center>Amount</th>
   <th><center> </th>

  </tr>
  <tr>
<td><center>12</td>
    <td><center>14</td>
    <td><center>December 2017</td>
    <td><center>1000.00</td>
    <td><center><a href="FA_BillCo_BillHomeOwners_ViewDetails.jsp"><input type="submit" name="submit" class="button"  value="View Details"></a></center></td>
  </tr>
    <tr>
<td><center>12</td>
    <td><center>14</td>
    <td><center>December 2017</td>
    <td><center>1000.00</td>
    <td><center><input type="submit" class="button" value="View Details"></center></td>
  </tr>
  </table>
</form>
		
  
    </div>
<%@include file="footer.jsp" %>
</body>


</html>
