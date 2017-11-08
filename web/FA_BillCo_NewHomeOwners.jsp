

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
  <div style="margin-left:30%;padding:1px 16px;height:500px;">
<br>
<br>
<br>
  <h1>New HomeOwner</h1>
 
  <form action="addStudent" method="post">
      
      <div class="form-group">
	<label>ID</label>
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
