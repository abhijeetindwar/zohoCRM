<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
       <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bills</title>
</head>
<body>

 <h2>Bills</h2>
 <hr>
 <table>
<tr>
<th>ID</th>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
<th>Product</th>
<th>Amount</th>
</tr>
<c:forEach items="${billing}" var="bills">
<tr>
<td><c:out value="${bills.id}"></c:out></td>
<td><a href="getBillId?id=${bills.id}"><c:out value="${bills.firstName}"></c:out></a></td>
<td><c:out value="${bills.lastName}"></c:out></td>
<td><c:out value="${bills.email}"></c:out></td>
<td><c:out value="${bills.mobile}"></c:out></td>
<td><c:out value="${bills.product}"></c:out></td>
<td><c:out value="${bills.amount}"></c:out></td>
</tr>


</c:forEach>

</table>
</body>
</html>