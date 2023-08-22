<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

<div class="row">
		<div class="container w-50">
			<h3 class="text-center">Current Batches</h3>
		
		
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>BID</th>
						<th>Batch Name</th>
						<th>Student Name</th>
						<th>Skill Level</th>
						
					
					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					<c:forEach var="batch" items="${batch}">

						<tr>
							<td>${batch.bid}</td>
							<td> ${batch.name} </td>
							<td> ${batch.studentname} </td>
							<td>${batch.skill}</td>
							
							<td><a href="edit?id=<c:out value='${batch.bid}' />">Edit</a>
							
							<a href="delete?id=<c:out value='${batch.bid}' />">Delete</a></td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>