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
			//객체를 초기화하는 생성자 정의
			function Car() {
				this.name = "그랜저";
				this.price = 5000000;
				this.start = function() {
					console.log("시동을 겁니다.");
				};
			}
			//객체 초기화하는 생성자 정의 (매개값 존재)
			function Person(name, age) {
				this.name = name;
				this.age = age;
			}
			
			//객체 생성
			const myCar = new Car();
			console.log(myCar.name);
			console.log(myCar.price);
			myCar.start();
			//객체 생성(매개값)
			const my = new Person("심영조", 23);
			const you = new Person("홍길동", 27);
			console.log(my);
			console.log(you);
			
			//일반 중괄호로 객체를 생성하는것보다 new 연산자로 생성하는것을 선호하는 이유는
			//동일한 객체생성자를 여러 jsp파일에서 참조할 수 있도록 하게 하면 유지보수 차원에서 이점이 많기 때문이다.
		</script>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="card">
    		<div class="card-header">exam08_function_constructor</div>
    		<div class="card-body">
    		
			</div>
  		</div>
	</body>
</html>