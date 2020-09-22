<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>
Welcome to the Temperature Converter
</title>
</head>
<body>
<h1>
Temperature Converter - Fahrenheit to Celsius
</h1>
<form action="getCTempServlet" method="post">
Enter the temperature in Fahrenheit
<input type="text" name="userTemp" size="10">
<input type="submit" value="Convert Temp to Celsius"/>
</form>
<form action="getFTempServlet" method="post">
Enter the temperature in Celsius
<input type="text" name="userTemp" size="10">
<input type="submit" value="Convert Temp to Fahrenheit"/>
</form>
</body>
</html>