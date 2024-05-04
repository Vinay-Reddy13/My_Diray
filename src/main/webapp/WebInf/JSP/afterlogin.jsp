<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
     
      <script type="text/javascript">
	  function confirmdelete(){
		  return confirm("Are u sure, to delete");
	  }
	  
  </script> 
  
  <style>
	  .right{
		  float: right;
	  }
	  .righttable{
		  width: 50%;
		  float: right;
	  }
	  .diary{
		  height: 40px;
		 
	  }
  </style> 
  </head>
 
  
  <body>
    <div class="container">
		<h1>User View</h1>
		<a href="./signout">signout</a>
		<h2 style="color: green;">hello ${user.userName}</h2>
		
		<div class="right">
			<a href="Addentry" class="btn btn-primary mb-2">New Entry</a><br>
		</div>
		
		<div class="diary">
			<img src="https://imgs.search.brave.com/tZ7x1jXqCwnf_LwOsXV2VHpTQ4zofuTS01qjyWJM6I8/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9pMC53/cC5jb20vcGljanVt/Ym8uY29tL3dwLWNv/bnRlbnQvdXBsb2Fk/cy9ib29rLWF1dGhv/ci13b21hbi13cml0/aW5nLWEtbmV3LXN0/b3J5LWluLWEtZGlh/cnktZnJlZS1waG90/by5qcGc_dz02MDAm/cXVhbGl0eT04MA">
		</div>
		
		<div class="righttable">
			<form action="#" method="post" >
				<table class="table  table-bordered  table-striped">

					<tr style="text-align: center;">
						<th>Date</th>
						<th colspan="3">Actions</th>
					</tr>

					<c:if test="${entrieslist.size()==0}">
						<tr><td>user didnt added any entries till date</td></tr>
					</c:if>

					<c:forEach items="${entrylist}" var="e">
						<tr>
							<th>${e.entryDate}</th>
							<th><a href="./viewentry?id=${e.id}">View</a></th>
							<th><a href="./updateentry?id=${e.id}">Update</a></th>
							<th><a href="./deleteentry?id=${e.id}">Delete</a></th>
						</tr>

					</c:forEach>
			
			


				
			
		       </table>
		   </form>
		</div>
		
	</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>