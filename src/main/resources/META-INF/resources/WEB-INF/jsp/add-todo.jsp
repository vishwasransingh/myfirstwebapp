<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<title>List of all to-dos</title>
</head>
<body>
	
	<div class="container">
		<h1>Add Task</h1>
		
		<form method="post">
			Task Description: <input type="text" name="desc">
			<input type="submit" value = "Add" class="btn btn-success">
		</form>
		
	</div>
	
	
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>