<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	a {
		text-decoration: none;
	}
	a:visited {
		color: green;
	}
	a:hover {
		color: chocolate;
		text-decoration: underline;
	}
	a:active {
		color: blue;
	}
	a.btn {
		border: 1px solid lightgray;
		padding: 5px;
		background-color: lightgray;
	}
	a.btn:hover {
		border: 1px solid #ffffbd;
		background-color: orange;
		color: black;
	}
	a.btn:active {
		background-color: #00ff00;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<h4>exam05_link</h4>
	<hr/>
	
	<a href="https://www.w3schools.com">w3schools</a>
    <a href="https://www.apache.org">apache</a>
    <a class="btn" href="https://www.apache.org">apache</a>
</body>
</html>