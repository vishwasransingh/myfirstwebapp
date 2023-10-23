<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<title>List of all to-dos</title>
</head>
<body>
	
	<div class="container">
		<h1>Add Task</h1>
		
		<form:form method="post" modelAttribute="toDo">
			Task Description: <form:input type="text" path="desc" required="required"/>
					<form:errors path="desc" cssClass="alert-danger"/>
			<form:input type="hidden" path="id"/>
			<form:input type="hidden" path="done"/>
			<input type="submit" value = "Add" class="btn btn-success">
		</form:form>
		
	</div>
	
	
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>