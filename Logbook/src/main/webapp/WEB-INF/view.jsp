<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Flight</title>
</head>
<body>
<div> <button class="button"> <a href="home.do">Fly Home</a></button></div>
<c:choose>
		<c:when test="${! empty flight}">

<h2>Flight</h2>
<ul>
<li> <strong>ID:</strong>${flight.id} </li>
<li> <strong>Date:</strong>${flight.flightDate}</li>
<li> <strong>Aircraft #</strong>${flight.aircraftId}</li>
<li> <strong>Aircraft Type:</strong>${flight.aircraftType}</li>
<li> <strong>Landings:</strong>${flight.landingCount}</li>
<li> <strong>Flight Conditions:</strong>${flight.flightConditions}</li>
<li> <strong>Remarks:</strong>${flight.remarks}</li>
</ul>



<form action="update.do" >
				<label for="id"></label> 
				<input type="hidden" name="id" value="${flight.id}" />
				<input type="submit" class="btn btn-danger"value="Update Flight" />
			</form>

<br>
	
			<form action="Delete.do" method="POST">
				<label for="id"></label> 
				<input type="hidden" name="id" value="${flight.id}" />
				<input type="submit" class="btn btn-danger"value="Delete" />
			</form>

</c:when>
<c:otherwise>
			<p>No flights found </p>
		</c:otherwise>
	</c:choose>


<br>


</body>
</html>