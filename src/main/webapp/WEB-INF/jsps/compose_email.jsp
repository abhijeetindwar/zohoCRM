<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose | Email</title>
</head>
<body>
<h2>Compose Email</h2>
<hr>
<form action="compose" method="post">
<pre>
To:<input type="text" name="to" value="${email}">
Subject:<input type="text" name="subject">
Body:<textarea name="body" rows="8" cols="70">
</textarea>

<input type="submit" value="send">

</pre>
</form>
</body>
</html>