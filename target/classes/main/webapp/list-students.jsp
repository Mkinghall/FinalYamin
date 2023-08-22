<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Yamin's Studio</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
 
 <style>
 .navbar-brand, .nav-link{
 color: #FFFFFF !important;

 
}

.bg-body-tertiary{
	--bs-bg-opacity: 1;
	 background-color: black;
	}
	.container{
	border: 2px solid black;
	padding: 20px;
	margin-top:30px;
	text-align: center;
	float:left;
 </style> 
<body>
	<jsp:include page="header.jsp"></jsp:include>
	
	<br><br>
	
	<header>
	
		
		
	</header>
	<br>

	<div class="row">
		<div class="container w-50">
			<h3 class="text-center">Current Students</h3>
		
		
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
				<th>SID</th>
		 		<th>Name</th>
				<th>Email</th>
				<th>Age</th>
				<th>skill</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
				
				<c:forEach var="student" items="${students}">

						<tr>
							<td>${student.sid}</td>
							<td> ${student.name} </td>
							<td> ${student.email}</td>
							<td>${student.age}</td>
							<td>${student.skill}</td>
							
							<td><a href="edit?id=<c:out value='${student.sid}' />">Edit</a>
							
							<a href="delete?id=<c:out value='${student.sid}' />">Delete</a></td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>