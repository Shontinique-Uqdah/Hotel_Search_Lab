<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
     <meta charset="UTF-8">
     <title>Hotels Home</title>
     	<meta name="viewport" content="width=device-width, initial-scale=1">
     	<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
</head>
<body>
<div class="container">

<h1>Welcome to Hotel Locator.com!</h1>
<h2>Where would you like to stay?</h2>
<form action="/hotels" method="post">
<div class="input-group">
  <select name="city" class="custom-select" id="inputGroupSelect04">
    <option selected>Choose...</option>
    <option value="Cusco">Cusco, Peru</option>
    <option value="Madrid">Madrid, Spain</option>
    <option value="Seoul">Seoul, South Korea</option>
  </select>
  <div class="input-group-append">
    <button class="btn btn-outline-secondary" type="submit">Find Hotels</button>
  </div>
</div>

</form>
</div>
</body>
</html>