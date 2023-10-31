<%@ include file="common/header.jspf" %>
<title>List of all to-dos</title>
</head>
<body>
	
	<%@ include file="common/navigation.jspf" %>
	
	<div class="container">
		<h1>Your Tasks:</h1>
		
		<table class="table">
			<thead>
				<tr>
					<th>Description</th>
					<th>Target date</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.desc}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.done}</td>
						<td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
						<td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<a href="add-todo" class="btn btn-success">Add Task</a>
		
	</div>
	<%@ include file="common/footer.jspf"%>