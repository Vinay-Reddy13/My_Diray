<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    
    <style>
		*{
			padding: 0;
			margin:0;
		}
		.body{
			width: 100%;
			height: auto;
			
			
			
		}
		.icon{
			height: 35px;
			width: 35px;
			
			
		}
		
		
		.diary{
			width: 100%;
			float: left;
			padding-top: 100px;
			padding-bottom: 100px;
			
			text-align: center;
		}
		.login{
			width: 45%;
			padding-top: 50px;
			float: right;
			
			
		}
		.img{
			height: 200px;
			width: 200px;
		}
		a{
			text-decoration: none;
		}
		
		
		
		
	</style>
  
  </head>
  <body>
	  <div class="header ">
		  <img class="icon" src="https://imgs.search.brave.com/zBvU5xQWrvGqval7eJAvGrUenknN8MNUn5wpRk1ZTZQ/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9jZG4u/cGl4YWJheS5jb20v/cGhvdG8vMjAxNS8x/MC8wMi8xNS8wMC9k/aWFyeS05Njg1OTJf/NjQwLmpwZw"
          <h1>hello my dairy</h1><br>
          <hr> 
	  </div>
	  <div class="Body">
		  
	  
	  <div class="body">
		  <div class="diary">
			  
			  <img class="img" src="https://imgs.search.brave.com/zBvU5xQWrvGqval7eJAvGrUenknN8MNUn5wpRk1ZTZQ/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9jZG4u/cGl4YWJheS5jb20v/cGhvdG8vMjAxNS8x/MC8wMi8xNS8wMC9k/aWFyeS05Njg1OTJf/NjQwLmpwZw"
		  </div>
		   <div class="login">
			  <h1>Login Here</h1>
			  
		  
			  <form action="./authentication"   method="post">
				  <label for="name">UserName</label>
			  <input type="text" id="name" name="userName"><br><br>
			  <label for="pwd">Password</label>
			  <input type="password" id="pwd" name="password"><br><br>
			  <button type="submit">Login</button>
			  </form>
			 <p>New User? <a href="register">Register </a>now</p>
		  </div>
		 
	  </div>
	  
   
  </body>
</html>