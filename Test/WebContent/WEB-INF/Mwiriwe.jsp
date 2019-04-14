<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Muheto</title>
</head>
<body>
<p> Bite Muheto!</p>

<p>Nizere k ukomeye!</p>
<b>Calculator</b><br/><br/>

<form action="Lab">
		<input type="text" name="fnum"/>
		<br/>
		<input type="text" name="snum"/> 
		<br/><br/>
		
	 <b>Select the operation</b>
	<br/> 
	<input type="radio" name="calc" value="Add"/>Add
	<input type="radio" name="calc" value="Sub"/>Subtract
	<input type="radio" name="calc" value="Div"/>Divide
	<input type="radio" name="calc" value="Multi"/>Multiply
   	<br/><br/>
   	
   	<input type="submit" value="Calculate" name="Submit"/>
   	
</form>
</body>
</html>