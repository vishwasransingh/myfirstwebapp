<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="common/header.jspf" %>
<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">

<%@ include file="common/navigation.jspf" %>

<div class="container">
	<h1>${pageName}</h1>		
	<form:form method="post" modelAttribute="toDo">
		
		<fieldset class="mb-3">
			<form:label path="desc">Description : </form:label>
			<form:input type="text" path="desc" required="required"/>
			<form:errors path="desc" cssClass="alert-danger"/>
		</fieldset>
		
		<fieldset class="mb-3">
			<form:label path="targetDate">Target Date : </form:label>
			<form:input type="text" path="targetDate" required="required"/>
			<form:errors path="targetDate" cssClass="alert-danger"/>
		</fieldset>
		
		
		<form:input type="hidden" path="id"/>
		<form:input type="hidden" path="done"/>
		<input type="submit" value = "Add" class="btn btn-success">
	</form:form>
	
</div>
	<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
	<script type="text/javascript">
		$('#targetDate').datepicker({
		    format: 'yyyy-mm-dd',
		    startDate: '-3d'
		});
	</script>
<%@ include file="common/footer.jspf"%>