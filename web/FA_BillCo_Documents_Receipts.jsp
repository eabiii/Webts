
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
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
  <h1><center>Receipt</h1>
  <h2><center>List of all checks</center></h2>
 <center><input type="button" class="button" value="Add Checks"></center>
   <table>
  <tr>
   <th><center>Date</th>
      <th><center>Block Number</th>    
   <th><center>Lot Number</th>
   <th><center>Transaction Amount</th>
   <th><center>Amount Paid</th>
   <th><center> </th>

  </tr>
  <tr>
<td><center>12</td>
    <td><center>14</td>
    <td><center>December 2017</td>
    <td><center>1000.00</td>
    <td><center><input type="button" class="button" value="View Details"></center></td>
  </tr>
    <tr>
<td><center>12</td>
    <td><center>14</td>
    <td><center>December 2017</td>
    <td><center>1000.00</td>
    <td><center><input type="button" class="button" value="View Details"></center></td>
  </tr>
  </table>

		
  
    </div>
<%@include file="footer.jsp" %>
</body>


</html>
