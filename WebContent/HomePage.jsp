<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>States and Capitals</title>
</head>
<body>
	<!-- Page Layout  -->
	<div id="container" style="width:500px">
		
		<!-- Header  -->
		<div id="header" style="background-color:#003399;">
		<h1 style="margin-bottom:0;">States and Capitals</h1>
		</div>
		
		<!-- Left box  -->
		<div id="left" style="background-color:#0066CC;height:200px;width:100px;float:left;">
		</div>

		<!-- Content  -->
		<div id="content" style="background-color:#EEEEEE;height:200px;width:400px;float:left;">
		<br>
		<h3>Enter the name of the state to find its capital.</h3>

		<form action="StatesServlet" method="post">
			State name:
			<input type="text" name="stateId" />
			<input type="submit" />
		</form>
		</div>

		<!-- Footer  -->
		<div id="footer" style="background-color:#FF0000;clear:both;text-align:center;">
		Steve Schmidt 2012
		</div>

	</div>
</body>
</html>