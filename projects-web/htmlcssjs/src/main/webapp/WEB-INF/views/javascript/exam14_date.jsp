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
			//브라우저가 실행하는 컴퓨터의 현재 날짜 및 시간 객체 얻기
			const now = new Date();
			//정보 얻기
			const year = now.getFullYear();
			const month = now.getMonth() + 1;
			const date = now.getDate();
			const hour = now.getHours();
			const minutes = now.getMinutes();
			const seconds = now.getSeconds();
			
			console.log(year, month, date, hour, minutes, seconds);
			
			console.log(now.toLocaleDateString());
		</script>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="card">
    		<div class="card-header">Header</div>
    		<div class="card-body">
    			
			</div>
  		</div>
	</body>
</html>