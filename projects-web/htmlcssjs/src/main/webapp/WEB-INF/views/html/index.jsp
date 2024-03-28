<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<!-- 브라우저 엔진을 edge로 지정하여 edge의 렌더링 엔진을 사용한다. -->
		<meta http-equiv="X-UA-Compatible" content = "IE=edge">	
		<!-- name안에 들어가는 데이터가 형식화가 되어있지않지만 만약 viewport값이 들어갔다고하면  사용자한테 보여질 화면의 크기비율을 알려준다.-->>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>인덱스</title>
	</head>
	<body>
		<h4>Index</h4>
		<hr/>
		
		<ul>
			<li>
			<!-- 상대경로 -->
				<a href = "html/exam01_html_structure">exam01_html_structure</a>
			</li>
			<li>
			<!-- 절대경로 -->
				<a href = "http://localhost:8000/html/exam02_element_attribute">exam02_element_attribute</a>
			</li>
			<li>
			<!-- 상대경로 -->
				<a href = "html/exam03_block_inline_element">exam03_block_inline_element</a>
			</li>
		</ul>
	</body>
</html>