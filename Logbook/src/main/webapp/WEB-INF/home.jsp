<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log Book</title>

<h1>TESTING LOGBOOK PAGE</h1>

<ul>
<c:forEach var="flights" items="${flights}">

<li> ${flights.id} </li>
<li> ${flights.aircraftId}</li>
<li> ${flights.flightDate}</li>
</c:forEach>
</ul>
</head>
<body>

</body>
</html>