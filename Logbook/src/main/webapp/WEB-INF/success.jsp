<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
	<h3>Your request was successfully processed</h3>
	<br>
	
	<form action="home.do" method="GET">
		<input
			type="submit" class="btn btn-info" value="Fly Home" />
	</form>
</body>
</html>