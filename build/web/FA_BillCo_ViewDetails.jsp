

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.BillingDao" %>
<%@page import="model.Billing,dao.BillingDao,dao.dbconnect,java.util.ArrayList" %>
<%
    Billing bill=(Billing)request.getAttribute("bill");
    

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
  <div style="margin-left:30%;padding:1px 16px;height:500px;">
<br>
<br>
<br>
  <h1>Billing Details</h1>
  <h2>Today is:  <h2 id=date></h2><h2 id="time"></h2></h2>
  <form action="addStudent" method="post">
      
      <div class="form-group">
	<label><%=bill.getID()%></label>
	<input type="text" name="studentID" class="form-control" placeholder="new id" required autofocus>
      </div>
      <div class="form-group">
	<label>ID</label>
	<input type="text" name="name" class="form-control" placeholder="new name" required autofocus>
      </div>
      <div class="form-group">
	<label>ID</label>
	<input type="text" name="age" class="form-control" placeholder="new age" required autofocus>
      </div>
      <input type="submit" class="btn btn-primary" value="Submit">
  </form>

		
  
    </div>
    <table>
  <tr>
   <th><center>Block Number</th>
      <th><center>Lot Number</th>    
   <th><center>Description</th>
   <th><center>Amount</th>
   <th><center></th>

  </tr>
  <tr>
<%      %>
<td><center><%=bill.getBlockNum()%></td>
<td><center><%=bill.getLotNum()%></td>
<td><center><%=bill.totalDue%></td>
<td><center><%=bill.totalPaid%></td>
<td><center><a href="FA_BillCo_ViewDetails?id=<%=bill.getID()%>"><input type="button" class="btn btn-primary" value="View"></a></td>

<%%>
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
