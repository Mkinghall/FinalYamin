<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>

<style>
.container{
	border: 2px solid black;
	padding: 20px;
	margin-top:30px;
	text-align: center;
	
	
}
</style>
<body>

<jsp:include page="header.jsp"></jsp:include>

<div class="container w-25">
<h2>Login Here</h2>
<form method="post" action="onLogin">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label><br>
    <input type="email" class="form control" name="userEmail" id="userEmail1" aria-describedby="emailHelp">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone, not even your Mom.</div>
  </div>
  <div class="mb-3">
    <label for="userPassword" class="form-label">Password</label>
    <input type="password" name="userPassword" class="form-control" id="userPassword">
  </div>
  <div class="mb-3 form-check" > 
    <input type="checkbox" class="form-check-input" id="rememberOn" border: solid 1px;>
    <label class="form-check-label" for="rememberOn" name="rememberOn">Remember Me Please</label>
  </div>
  <button type="submit" class="btn btn-primary">Login!</button>
</form>
</div>


	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>