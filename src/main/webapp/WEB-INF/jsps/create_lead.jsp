<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create | Lead</title>
</head>
<body>
<h1>Create Lead</h1>
<hr>
 <form action="save" method="post">
 <pre>
    Email: <input type="text" name="email">
    First Name: <input type="text" name="firstName">
    Last Name: <input type="text" name="lastName">
  
    Lead Source :<select name="leadSource">
  <option value="TV">TV</option>
  <option value="social networking">Social Networking</option>
  <option value="newspaper">Newspaper</option>
  <option value="friends">Friends</option>
</select>
   Mobile: <input type="text" name="mobile">
   <input type="submit" value="save">
 </pre>
 </form>
</body>
</html>