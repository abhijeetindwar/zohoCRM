<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
       <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leads</title>
</head>
<body>
 <h2>Leads</h2>
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
<c:forEach items="${leads}" var="leads">
<tr>
<td><c:out value="${leads.id}"></c:out></td>
<td><a href="get?id=${leads.id}"><c:out value="${leads.firstName}"></c:out></a></td>
<td><c:out value="${leads.lastName}"></c:out></td>
<td><c:out value="${leads.email}"></c:out></td>
<td><c:out value="${leads.leadSource}"></c:out></td>
<td><c:out value="${leads.mobile}"></c:out></td>
</tr>


</c:forEach>

</table>
</body>
</html>