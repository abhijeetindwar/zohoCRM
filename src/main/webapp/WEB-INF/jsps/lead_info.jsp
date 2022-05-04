<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead | Info</title>
</head>
<body>
<h2>Lead | Info</h2>
<hr>
Lead Id=${lead.id }<br>
Lead Email=${lead.email }<br>
Lead First Name=${lead.firstName }<br>
Lead Last Name=${lead.lastName }<br>
Lead Mobile=${lead.mobile }<br>
<form action="email" method="post">
<input type="hidden" name="emailid" value="${lead.email}">
<input type="submit" value="Email">
</form> 
<br>
<form action="convert" method="post">
<input type="hidden" name="id" value="${lead.id}">
<input type="submit" value="Convert">
</form> 

</body>
</html>