<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All FLights</title>
</head>
<body>
<form action="home.do" method="GET">
		<input
			type="submit" class="btn btn-info" value="Fly Home" />
	</form>

<c:forEach var="flight" items="${flight}">
<ul>

<li> <a href="getFlightById.do?id=${flight.id}"><strong>${flight.id}</strong></a></li>
<li> <strong>Date:</strong>${flight.flightDate}</li>
<li> <strong>Aircraft #</strong>${flight.aircraftId}</li>
<li> <strong>Aircraft Type:</strong>${flight.aircraftType}</li>
<li> <strong>Landings:</strong>${flight.landingCount}</li>
<li> <strong>Flight Conditions:</strong>${flight.flightConditions}</li>
<li> <strong>Remarks:</strong>${flight.remarks}</li>
</ul>
</c:forEach>

</body>
</html>