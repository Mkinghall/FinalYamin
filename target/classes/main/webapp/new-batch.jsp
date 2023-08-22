<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>  

 </head>
<body>

}

	<jsp:include page="header.jsp"></jsp:include>
	
	
	
	
	
	
	<div class="container w-25 " align: center>
	<h2>Build a Batch</h2>
	<form method="post" action="onSubmit">
	
	
	<label for="StudentName" class="form-label"> Student First Name</label><br>
	<input type="name" class="form control" name="firstName" id="firstName" ><br>
	
	<label for="StudentEmail" class="form-label"> Student Email</label><br>
	<input type="email" class="form control" name="email" id="email" ><br>

	
	<label for="Skill" class="form-label"> Student Skill</label><br>
	<input type="radio" name="Current Skill " value="Master">Master
	<input type="radio" name="Current Skill" value="Adept">Adept
	<input type="radio" name="Current Skill" value="Novice">Novice	
	
		<br><br>
	<label for="Batches">Select a Batch to add to:</label>
	<br><br>

<div class="dropdown">

<div class="dropdown-options">
 <select name="Batches" id="Batches">
  <option value="Beginners">Beginners</option>
  <option value="Intense">Intense</option>
  <option value="marathon" >Marathon</option>
</select>
	 </div>
</div>

	<br>
  <button type="submit" class="btn btn-primary">Add to Batch</button>
	
		</form>
	
	
	
	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>