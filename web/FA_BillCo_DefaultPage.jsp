

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.BillingDao" %>
<%@page import="model.Billing,dao.BillingDao,dao.dbconnect,java.util.ArrayList" %>
<%
ArrayList<Billing>bill=BillingDao.getBilling();

%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
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
<br>
<br>
<br>
<center><h1>Welcome User!</h1></center>
    <center>  <h2>Today is:  <h2 id=date></h2><h2 id="time"></h2></h2></center>
     <form action="addBills" method="POST">
        <b><p>Block No:</p></b>
        <input type="number" id="bln" min="1"  name="blockNum" placeholder="Block" required>
        <b><p>Lot No:</p></b>
        <input type="number" id="lno" min="1"  name="lotNum" placeholder="Lot" required>
        <b><p>Description:</b></p>
        <input type="text" name="desc" class="form-control" placeholder="Description" required autofocus>
        <b><p>Amount:</b></p>
        <input type="number" step="1" min="0" id="amt" name="amount" placeholder="Amount" onchange="filters()" required autofocus>
        <b><p>Interest:</b></p>
        <input type="number" step="1" min="0" id="inter" name="interest" placeholder="Interest" onchange="filters()" required autofocus>
        <b><p>Total Amount:</b></p>
        <input type="number" min="0" id="totalamt" name="totalamount" placeholder="0" autofocus readonly><br><br>
        <input type="submit" id="addb" value="Add Bill">
        </form>

    <table>
  <tr>
   <th><center>Block Number</th>
      <th><center>Lot Number</th>    
   <th><center>Description</th>
   <th><center>Amount</th>
   <th><center></th>

  </tr>
  <tr>
<%  for(Billing b:bill){    %>
<td><center><%=b.getBlockNum()%></td>
<td><center><%=b.getLotNum()%></td>
<td><center><%=b.getTotalDue()%></td>
<td><center><%=b.getTotalPaid()%></td>
<td><center><a href="viewBills?id=<%=b.getID()%>"><input type="button" class="btn btn-primary" value="View"></a></td>
</tr>
<%}%>
  </table>

<%@include file="footer.jsp" %>
</body>

<script type="text/javascript">
        /*n =  new Date();
		y = n.getFullYear();
		m = n.getMonth() + 1;
		d = n.getDate();
		document.getElementById("date").innerHTML = m + "/" + d + "/" + y;
		*/
		var d = new Date();
		document.getElementById("date").innerHTML = d.toDateString();
		
		(function () {
    function checkTime(i) {
        return (i < 10) ? "0" + i : i;
    }

    function startTime() {
        var today = new Date(),
            h = checkTime(today.getHours()),
            m = checkTime(today.getMinutes()),
            s = checkTime(today.getSeconds());
        document.getElementById('time').innerHTML = h + ":" + m + ":" + s;
        t = setTimeout(function () {
            startTime()
        }, 500);
    }
    startTime();
})();
	</script>
</html>
