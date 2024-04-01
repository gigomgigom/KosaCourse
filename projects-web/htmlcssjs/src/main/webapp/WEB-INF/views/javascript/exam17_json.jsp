<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<!-- Latest compiled and minified CSS -->
		<!-- 클라이언트에게 라이브러리 파일을 어디 서버에 다운받을 지 배정받는다. -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

		<!-- Latest compiled JavaScript -->
		<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
		<script>
			//JSON이란?
			//JavaScript Object Notation(자바스크립트 객체 표기)
			//JavaScript 객체와 JSON은 서로 엄연히 다른 것이다.
			//사용용도: 프론트엔드와 백엔드 사이의 데이터 전달을 위해서 사용한다.
			//{"속성명" : 값, "속성명": 값, ...}
			//반드시 속성명은 큰 따옴표로 감싸야 한다.
			//값의 타입
			//숫자일 경우: {"price":3000}, {"tall": 170.5}
			//문자열일 경우: {"name": "홍길동"} <- 반드시 큰 따옴표로 감싸야한다.
			//객체일 경우: {"data": {"bno":1, "title":"제목"}}
			//배열일 경우: {"hobby": ["음악", "게임", "여행"]}
			
			//자바스크립트 객체를 JSON으로 변환시키기----------------------
			const person = {
				name: "홍길동",
				nation: '대한민국',
				age: 25,
				family: {father: "홍삼원", mother:'정관순'},
				hobby: ["영화", '게임']
			};
			console.log(person);
			//person 객체를 JSON 표기형식으로 변환
			const strJson = JSON.stringify(person);
			console.log(strJson);
			
			//JSON 문자열을 자바스크립트로 변환시키기---------------------
			const person2 = JSON.parse(strJson);
			console.log(person2);
			
		</script>
		
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="card">
    		<div class="card-header">exam17_json</div>
    		<div class="card-body">
    			
			</div>
  		</div>
	</body>
</html>