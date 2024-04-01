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
			var data = "000107-3589578";
			//문자열의 길이 반환
			console.log("문자의 갯수: ", data.length);
			//인덱스가 주어졌을때 해당하는 인덱스의 문자를 반환
			console.log("성별: ", data.charAt(7));
			//---------------------------------------------------
			//주어진 문자열을 문자열 객체가 포함하고 있는지 없는지 (T/F)
			console.log("포함여부: ", data.includes("000107"));
			console.log("포함여부: ", data.includes("공공공일공칠"));
			//---------------------------------------------------
			//주어진 문자열을 문자열 객체가 포함하고 있는지 파악한 후
			//포함하고 있다면 문자열의 시작인덱스번호 반환, 포함하지 않는다면 -1 반환
			console.log("포함여부: ", data.indexOf("3589"));
			console.log("포함여부: ", data.indexOf("주민번호"));
			//---------------------------------------------------
			//주어진 인덱스 범위만큼 문자열을 추출하기
			console.log("추출하기: ", data.slice(0, 6));
			//주어진 인덱스부터 끝까지의 범위만큼 문자열을 추출하기
			console.log("추출하기: ", data.slice(6));
			//---------------------------------------------------
			//주어진 문자열("-")을 기준으로 문자열을 분리하고 분리한 것들을 배열의 요소로 저장한다.
			console.log("토큰 배열: ", data.split("-"));
			//---------------------------------------------------
			//문자열의 0번째 인덱스에서부터 6개의 문자까지 문자열로 잘라서 반환한다.
			console.log("추출하기: ", data.substr(0,6));
			//문자열의 7번 인덱스에서부터 끝까지 문자열을 반환한다.
			console.log("추출하기: ", data.substr(7));
		</script>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="card">
    		<div class="card-header">exam13_string</div>
    		<div class="card-body">
    			
			</div>
  		</div>
	</body>
</html>