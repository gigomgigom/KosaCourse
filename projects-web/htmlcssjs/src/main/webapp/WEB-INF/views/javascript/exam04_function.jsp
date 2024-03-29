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
		
		<script>
			//함수선언
			function fun1() {
				console.log("fun1() 실행");
			}
			//함수호출
			fun1();
			
			//함수 선언
			var fun2 = function() {
				console.log("fun2() 실행");
			}
			//함수 호출
			fun2();
			
			//화살표함수 (arrow-function) 선언
			var fun3 = () => {
				console.log("fun3() 실행");
			};
			//함수 호출
			fun3();
			
			//함수 대입
			var fun4 = fun3;
			fun4();
			
			//매개 변수값을 받는 함수 생성
			function fun5(arg1, arg2, arg3=0) {
				console.log("function 5 실행");
				console.log("arg1: ", arg1);
				console.log("arg2: ", arg2);
				console.log("arg3: ", arg3);
			}
			//매개값을 입력하며 호출
			fun5(10, "abc");
			fun5(5);
			
			var var6 = (arg1, arg2) => {
				console.log("fun6() 실행}");
				console.log("arg1: ", arg1);
				console.log("arg2: ", arg2);
			};
			
			var6('abc', "def");
			
			//실행문이 하나일 경우 {} 생략 가능하다.
			var var7 = (arg1) => console.log("arg1:", arg1);
			//매개변수가 하나일 경우 () 생략 가능하다.
			var var8 = arg1 => console.log("arg1:", arg1)
			
			//리턴값이 있는 함수
			function fun9(x, y) {
				let result = x + y;
				return result;
			}
			
			var fun10 =  (x, y) => x + y;
			var fun11 = (x, y) => {return x + y;}
			var result1 = fun9(10, 20);
			var result2 = fun10(10, 20);
			var result3 = fun10(10, 20);
			console.log("result1:", result1);
			console.log("result2:", result2);
			console.log("result3:", result3);
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