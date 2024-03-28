<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
			* {
				margin: 0px;
				padding: 0px;
			}
			
			#wrapper {
				display: flex;
				flex-direction: column;
			}
			
			header {
				border: 1px solid black;
				background-color: darkgray;
				padding: 30px;
				text-align: center;
				font-size: 2em;
				color: #ffffff;
			}
			
			section {
				display: flex;
				flex-direction: row;
				border: 1px solid black;
				height: 300px
			}
			
			nav {
				flex: 3;
				border: 1px solid yellow;
				box-sizing: border-box;
				padding: 20px;
				background-color: orange;
				
			}
			
			article {
				flex: 7;
				border: 1px solid yellow;
				padding: 20px;
		
				box-sizing: border-box;
			}
			
			footer {
				border: 1px solid black;
				padding: 10px;
				text-align: center;
			}
		</style>
	</head>
	<body>
		<h4>exam12_flex_layout</h4>
		<hr/>
		
		<div id="wrapper">
		<header>
			<h2>Cities</h2>
		</header>

		<section>
			<!-- 메뉴를 담을 용도로 사용한다. -->
			<nav>
				<ul>
					<!-- 클릭하게 되면 현재 페이지(#)로 이동한다. -->
					<li><a href="#">London</a></li>
					<li><a href="#">Paris</a></li>
					<li><a href="#">Seoul</a></li>
				</ul>
			</nav>
			<article>
				<h1>London</h1>
				<p>London is the capital city of England. It is the most
					populous city in the United Kingdom, with a metropolitan area of
					over 13 million inhabitants.</p>
				<p>Standing on the River Thames, London has been a major
					settlement for two millennia, its history going back to its
					founding by the Romans, who named it Londinium.</p>
			</article>
		</section>
		
		<!-- 끝단에 사용할 것 -->
		<footer>
			<p>Footer</p>
		</footer>
	</div>
	
	</body>
</html>