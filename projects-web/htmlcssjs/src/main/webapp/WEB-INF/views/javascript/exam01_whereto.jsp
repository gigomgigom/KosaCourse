<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<!-- Latest compiled and minified CSS -->
		<!-- 클라이언트에게 라이브러리 파일을 어디 서버에 다운받을 지 배정받는다. -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

		<!-- Latest compiled JavaScript -->
		<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<script>
			console.log("실행1");
		</script>
		
		
		<script src="/htmlcssjs/resources/js/exam01_external.js"></script>
	</head>
	<body>
		<div class="card">
    		<div class="card-header">Header</div>
    		<div class="card-body">
    			<script>
    				console.log("실행2");
    			</script>
			</div>
  		</div>
  		<script>
    				console.log("실행2");
    	</script>
	</body>
</html>