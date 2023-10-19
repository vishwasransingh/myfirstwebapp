<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<h1>Login Form</h1>
	<br>
	<form action="" method="post">
		Name: <input type="text" name="name">
		Password: <input type="password" name="password">
		<input type="submit" value="submit">
		<br>
		<p style="color:red">${error}</p>
	</form>

</body>
</html>