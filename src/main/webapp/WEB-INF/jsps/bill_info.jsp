<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing | Info</title>
</head>
<body>
<h2>Billing | Info</h2>
<hr>
<pre>
Customer Id=${bill.id }<br>
Email=${bill.email }<br>
First Name=${bill.firstName }<br>
Last Name=${bill.lastName }<br>
Mobile=${bill.mobile}<br>
Product=${bill.product}<br>
Amount=${bill.amount}<br>
<form action="email" method="post">
<input type="hidden" name="emailid" value="${bill.email}">
<input type="submit" value="Email">
</form> 
<br>
<form action="pay" method="post">
<input type="hidden" name="id" value="${bill.id}">
<input type="submit" value="pay">
</form> 
</pre>
</body>
</html>