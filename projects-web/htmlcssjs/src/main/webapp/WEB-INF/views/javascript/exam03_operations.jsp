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
		
		<script type="text/javascript">
			//산술 연산자
			var var1 = 2 ** 3;
			console.log("var1: ", var1);
			console.log("");
			//비교 연산자
			console.log(3=="3");//true(값을 비교)
			console.log(3==="3");//false(타입을 비교)
			console.log(3 != "3"); //false
			console.log(3 !== "3"); //true
			console.log("");
			//논리 연산자
			var var2 = true;
			var var3 = false;
			
			//&&연산자 앞에 값이 true면은 뒤의 값이 나온다.
			console.log(var2 && var3); //false
			console.log(var2 && "홍길동"); //홍길동
			//&&연산자 앞에 값이 false면은 뒤의 값은 나오지않고 앞의 값만 나오게 된다.
			console.log(var3 && "홍길동"); //false
			
			//||연산자 앞에 값이 true면은 뒤의값은 나오지않고 앞의 값이 나오게 된다.
			console.log(var2 || var3); //true
			console.log(var2 || "홍길동"); //true
			console.log(var3 || "홍길동"); //홍길동
			
			console.log(!var3);
		</script>
	</head>
	<body>
		<div class="card">
    		<div class="card-header">exam03_operations</div>
    		<div class="card-body">
			</div>
  		</div>
	</body>
</html>