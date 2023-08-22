<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Yamin's Studio</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
 
 <style>
 .navbar-brand, .nav-link{
 color:teal;
 text-align: center;
 align: center;
 position: center;

 
}

.navbar{
	bs-navbar-color: yellow;
	--bs-navbar-color: rgba(var(--bs-emphasis-color-rgb), 0.65);
	
	}
 </style> 


<body>



	<h1 >  Yamin's Zumba Studio  </h1>
	
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid"  >
  
    <a class="navbar-brand" href="#">Yamin's Studio</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
      
        <li class="nav-item">
          <a class="nav-link " aria-current="page" href="index.jsp">Home</a>
        </li>
           <li class="nav-item">
          <a class="nav-link "  href="login.jsp">Login</a>
        </li>
     
        
   <li class="nav-item">
          <a class="nav-link "  href="list-students.jsp">Students</a>
        </li>   
        
        <li class="nav-item">
          <a class="nav-link "  href="new-Student.jsp">New Student</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link" href="new-batch.jsp">New Batch</a>
        </li>
            <li class="nav-item">
          <a class="nav-link" href="list-batches.jsp">Current Batches</a>
        </li>
       </ul>
      
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
</body>
</html>