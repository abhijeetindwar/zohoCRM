<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
       <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacts</title>
</head>
<body>
 <h2>Contacts</h2>
 <hr>
 <table>
<tr>
<th>ID</th>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>LeadSource</th>
<th>Mobile</th>
</tr>
<c:forEach items="${contacts}" var="contacts">
<tr>
<td><c:out value="${contacts.id}"></c:out></td>
<td><a href="getbill?id=${contacts.id}"><c:out value="${contacts.firstName}"></c:out></a></td>
<td><c:out value="${contacts.lastName}"></c:out></td>
<td><c:out value="${contacts.email}"></c:out></td>
<td><c:out value="${contacts.leadSource}"></c:out></td>
<td><c:out value="${contacts.mobile}"></c:out></td>
</tr>


</c:forEach>

</table>
</body>
</html>