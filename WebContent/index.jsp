<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Designer" method="post">
	<input type="text" name="username" placeholder="Enter Name">
	<input type="password" name="password" placeholder="Enter Password">
	<input type="password" name="cpassword" placeholder="Confirm Password">
	<input type="email" name="email" placeholder="Enter Email">
	<select name="usertype">
		
		<option value="select">Select...</option>
	
		<option value="designer">Designer</option>
		<option value="customer">Customer</option>
	
	</select>
	<input type="submit" value="send">

</form>
</body>
</html>