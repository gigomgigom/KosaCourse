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
		<script type="text/javascript">
			//정규 표현식 작성 방법
			// [   /^ ... $/   ] 왼쪽과 같은 형식으로 감싸야한다.
			//전화번호 유효성 검사
			var tel = "010-1234-1234";
			const telPattern = /^(010|011)-\d{3,4}-\d{4}$/;
			console.log(telPattern.test(tel));
			
			//이메일 유효성 검사
			var email = "tlarlrma@naver.com";
			const emailPattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			console.log(emailPattern.test(email));
		</script>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="card">
    		<div class="card-header">exam18_regular_expression</div>
    		<div class="card-body">
    			
			</div>
  		</div>
	</body>
</html>