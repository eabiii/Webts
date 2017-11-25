

<%@page import="model.TrxReferences"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.BillingDao" %>
<%@page import="model.Billing,model.PaymentDetails,dao.BillingDao,dao.dbconnect,java.util.ArrayList" %>
<%
    Billing bill=(Billing)request.getAttribute("bill");
    TrxReferences p=(TrxReferences)request.getAttribute("pay");

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
  <form action="updateBill" method="post">
      
      <div class="form-group">
	<label>Block Number:<%=bill.getBlockNum()%></label>

      </div>
      <div class="form-group">
	<label>Lot Number:<%=bill.getLotNum()%></label>
      </div>
      <div class="form-group">
	<label>Description of Payment:<%=bill.getDesc()%></label>
      </div>
      <div class="form-group">
	<label>Amount: </label>
        <input type="number" step="any" min="0" id="amt" name="amount" value="<%=bill.getTotalDue()%>" placeholder="<%=bill.getTotalDue()%>" onchange="filters()" readonly >

      </div>
      <div class="form-group">
	<label>Interest</label>
                <input type="number" step="any" min="0" id="inter" name="interest" placeholder="totalDue" onchange="filters()" required >

      </div>
        <div class="form-group">
	<label>Current Status:<%=bill.getStatus()%></label>
<select name="status">
        <option value="Pending">Pending
        <option value="Paid">Paid
        <option value="Overdue">Overdue
    </select>
      </div>
    
       <div class="form-group">
	<label>Total Amount: </label>
        <input type="hidden" name="billId" value="<%=bill.getID()%>">
                <input type="number" min="0" id="totalamt" name="totalAmount" placeholder="0" autofocus readonly>
 <input type="submit" id="addb" value="Add Bill">
      </div>
  </form>
 <script>
        function filters()
        {
            var input,filter,interest, filter2,total;
            input=document.getElementById("amt").value;
            filter =input.value;
            interest=document.getElementById("inter").value;
            filter2=interest.value;
            total=document.getElementById("totalamt");
            total.value=parseFloat(input);
            total.value=parseFloat(input)+parseFloat(interest);
            
            
        }
        
    </script>
		
  
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
</tr>
<%%>
<tr>
   <td><center><%=bill.getBlockNum()%></td>
<td><center><%=p.getTrxID()%></td>
<td><center><%=p.getDate()%></td>
<td><center><%=p.getInterest()%></td> 
    
</tr>
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
