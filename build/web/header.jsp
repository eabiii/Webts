<%-- 
    Document   : header
    Created on : Nov 3, 2017, 12:19:06 PM
    Author     : eabiii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SW-ENGG</title>
        <link href="style.css" rel="stylesheet" type="text/css"/>
    </head>
<body>
 
    
 <ul>
    
  <li><a href="Login.html">Log Out</a></li>
    <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Reports</a>
    <div class="dropdown-content">
        		<a href="adminAddCustomer.php">Balance Sheet</a>
				<a href="adminRegisterVehicle.php">Income Statement</a>
				<a href="adminCheckConfirmations.php">Cash Flow Statement</a>
                                <a href="adminCheckConfirmations.php">Statement of Retained Earnings</a>
    </div>
  </li>
    <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Documents</a>
    <div class="dropdown-content">
        		<a href="adminAddCustomer.php">Chesck</a>
				<a href="adminRegisterVehicle.php">Vouchers</a>
				<a href="adminCheckConfirmations.php">Receipts</a>
    </div>
  </li>
    <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">HomeOwners</a>
    <div class="dropdown-content">
        		<a href="adminAddCustomer.php">View HomeOwners</a>
				<a href="adminRegisterVehicle.php">View Properties</a>

    </div>
  </li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Transaction</a>
    <div class="dropdown-content">
        		<a href="adminAddCustomer.php">Transaction Journal</a>

    </div>
  </li>
  <li style="float:left"><a href="logo">Logo</a></li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Billing</a>
    <div class="dropdown-content">
        		<a href="FA_BillCo_BillHomeOwners.jsp">Bill HomeOwners</a>

    </div>
  </li>
</ul>

</body>
</html>
