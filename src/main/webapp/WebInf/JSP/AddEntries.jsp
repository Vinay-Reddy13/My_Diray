<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
		<a href="./signout">Singout</a>
		<h1>Write into Diary ${user.userName}</h1>
		
		<div>
			<form action="./saveentry"  method="post">
				<label for="date">Date:</label>
				<input type="date" id="date" name="entryDate" ><br>
				<label for="description">Description:</label>
				<textarea id="description" name="description"></textarea><br>
				<input type="hidden" name="userId" value="${user.id}">
				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
		
	
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>