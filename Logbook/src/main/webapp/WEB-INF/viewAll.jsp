<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Flights</title>


<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
        integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <style>
        body {
            background: url(https://m.media-amazon.com/images/M/MV5BMWJlMWM5Y2UtOTdiOC00MjQyLWJhZTctMjk2Y2U3ZDkyNWVkXkEyXkFqcGdeQXVyMTEzNzczMA@@._V1_.jpg) no-repeat center center fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;
        }

        .maintxt {
            position: relative;
        }

        .maintxt>img,
        .overlay-text {
            position: absolute;
        }

        .overlay-text {
            padding: 150px 50px;
            color: black;
        }
  
  </style>

<body>
<form action="home.do" method="GET">
		<input
			type="submit" class="btn btn-info" value="Fly Home" />
	</form>

<div class="container">
        <div class="row">
            <div class="col-5 col-centered">
                <div class="maintxt">
                    <span class="overlay-text">



<c:forEach var="flight" items="${flight}">

<div class="p-3 mb-2 bg-warning text-black">
				<ul>

<li> <a href="getFlightById.do?id=${flight.id}"><strong>${flight.id}</strong></a></li>
<li> <strong>Date:</strong>${flight.flightDate}</li>
<li> <strong>Aircraft #</strong>${flight.aircraftId}</li>
<li> <strong>Aircraft Type:</strong>${flight.aircraftType}</li>
<li> <strong>Landings:</strong>${flight.landingCount}</li>
<li> <strong>Flight Conditions:</strong>${flight.flightConditions}</li>
<li> <strong>Remarks:</strong>${flight.remarks}</li>
</ul>
</div>
</c:forEach>
   </span>
                </div>
            </div>
        </div>
    </div>


<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
        crossorigin="anonymous"></script>
</body>
</html>