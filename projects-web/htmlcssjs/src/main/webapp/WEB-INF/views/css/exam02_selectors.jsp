<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<!-- external css -->
		<!-- <link rel="stylesheet" href="/htmlcssjs/resources/css/exam01_style.css"> -->
		
		<!-- internal css -->
		<style>
			
			* {
				text-align: center;
				color: blue;
			}
			div {
				border: 1px solid red;
				background-color:aqua;
			}
			
			.divClass1 {
				background-color:purple;
			}
			
			.divClass2 {
				background-color:pink;
			}
			
			#divId1 {
				background-color:orange;
			}
			
			p, header, article {
				border: 1px solid orange;
				text-align: right;
				color: red;
			}
			p.classA {
				background-color:maroon;
			}
			.classA {
				background-color:brown;
			}
			
		</style>
	</head>
	<body>
		<h4>exam01_selectors</h4>
		<hr/>
	
		<div>content1</div>
		<!-- id는 식별값이므로 중복이 되게끔하면 안된다(자바스크립트에서 문제 발생한다.) -->
		<div id="divId1">content2</div>
		<div class="divClass1">content2</div>
		<div class="divClass1">content3</div>
		<div class="divClass2">content4</div>
		<div class="divClass2">content5</div>
		
		<p>content6</p>
		<header>content7</header>
		<article>content8</article>
		
		<p class="classA">content9</p>
		<div class="classA">content10</div>
	</body>
</html>