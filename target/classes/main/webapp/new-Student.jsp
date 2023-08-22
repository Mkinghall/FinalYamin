<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Add a New Student</title>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>	
	
	<div class="container w-25 ">
	<h2> Add a New Student </h2>
	<form action="INSERT_STUDENT" method="post" >
	
	<label for="studentName" class="form-label"> Student  Name</label> <br>
	<input type="text" class="form control" path="name" name="name" id="name" ><br>
	
<label for="studentEmail" class="form-label"> Student  Email</label> <br>
	<input type="text" class="form control" path="email" name="email" id="email" ><br>
	
	<label for="StudentAge" class="form-label">Student Age </label><br>
	<input type="text" class="form control" path="age" name="age" id="age" ><br>

	<label for="skill" class="form-label"> Student Rank</label><br>
	<input type="radio" name="skill" value="Master">Master
	<input type="radio" name="skill" value="Adept">Adept
	<input type="radio" name="skill" value="Novice">Novice	
	
	<br><br>

  <button type="submit" class="btn btn-primary" value= "Submit" href="list-students.jsp" >Add New Student</button>


</form>
</div>

</body>
</html>