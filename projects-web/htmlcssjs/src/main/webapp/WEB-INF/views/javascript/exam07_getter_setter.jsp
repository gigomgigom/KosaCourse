<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<!-- Latest compiled and minified CSS -->
		<!-- cdn이 클라이언트에게 라이브러리 파일을 어디 서버에 다운받을 지 배정해준다. -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

		<!-- Latest compiled JavaScript -->
		<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
		<script>
			const car = {
				name: "그랜저",
				price: 5000,
				speed: 100,
				start: function() {
					console.log("시동을 겁니다.");
				},
				//(getter와 setter 메소드의 경우 사용하는 이름이 서로 같아야한다.)
				//추가적인 연산을 통해 값을 지정하고싶을때 getter와 setter를 사용한다.
				//setter 선언
				set kmSpeed(meter) {
					//km->mile
					this.speed = meter/0.621371;
				},
				//getter 선언
				get kmSpeed() {
					return this.speed * 0.621371;
				},
			};
			//속성의 값을 변경하는 것처럼 사용될 시 setter메소드가 호출된다. 뒤에 대입되는 값은 매개값으로 들어간다.
			car.kmSpeed = 60;
			//속성의 값을 불러오는 것처럼 사용할 시 getter메소드가 호출된다.
			console.log("현재 속도(km/h)", car.kmSpeed);
		</script>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="card">
    		<div class="card-header">exam07_getter_setter</div>
    		<div class="card-body">
    			
			</div>
  		</div>
	</body>
</html>