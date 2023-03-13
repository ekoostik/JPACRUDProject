<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Flight</title>
</head>

<style>
body{

background-image: url('https://images.unsplash.com/photo-1511140276483-30c1217ca449?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fGNvY2twaXR8ZW58MHx8MHx8&w=1000&q=80');
background-repeat: no-repeat;
background-attachment: fixed; 
background-size: cover;
margin:auto;
text-align: center;
color: black;
}

form{
margin-top: 200px;
text-align: center;
}


</style>

<body>


	<form action="submitUpdate.do" method="POST">
		<input type="hidden" name="id" value="${flight.id}" /> 
		
		<label for="flightDate">Flight Date:</label> 
		<input type="date" name="flightDate" value="${flight.flightDate}" /> 
		<br> 
		<label for="aircraftId">Aircraft ID:</label> 
		<input type="text" name="aircraftId" value="${flight.aircraftId}" /> 
		<br> 
		<label for="aircraftType">Aircraft Type:</label> 
		<input type="text" name="aircraftType" value="${flight.aircraftType}" /> 
		<br> 
		<label for="landingCount">Landings:</label> 
		<input type="number" name="landingCount" value="${flight.landingCount}" /> 
		<br> 
		<label for="flightConditions">Flight Conditions:</label> 
		
		<select name="flightConditions" id="flightConditions"> 
			<option value="${flight.flightConditions}"></option>
			<option value="IFR">IFR</option>
		    <option value="VFR">VFR</option>
		</select>
		<br> 
		<label for="remarks">Remarks:</label> 
		<input type="text" name="remarks" value="${flight.remarks}" /> 
		<br> 




	<input class="btn btn-warning" type="submit" value="Update Flight">
	
	
		
	</form>
	
	<button onclick="window.location.href='home.do';">Cancel</button>


</body>
</html>