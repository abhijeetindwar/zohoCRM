<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create | Bill</title>
</head>
<body>
<a href="billList">BillsResult</a>
<h1>Create Bill</h1>
<hr>
 <form action="savebill" method="post">
 <pre>
    
    First Name: <input type="text" name="firstName" value="${contacts.firstName}">
    Last Name: <input type="text" name="lastName" value="${contacts.lastName}">
    Email: <input type="text" name="email" value="${contacts.email}">
    Product :<select name="product" >
  <option value="hp">Hp</option>
  <option value="dell">Dell</option>
  <option value="asus">Asus</option>
  <option value="mac">mac</option>
</select>
   Mobile: <input type="text" name="mobile" value="${contacts.mobile}">
   Amount: <input type="text" name="amount" >
   <input type="submit" value="generate bill">
 </pre>
 </form>
</body>
</html>