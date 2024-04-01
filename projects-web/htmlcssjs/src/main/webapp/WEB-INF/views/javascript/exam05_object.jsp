<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Latest compiled and minified CSS -->
<!-- 클라이언트에게 라이브러리 파일을 어디 서버에 다운받을 지 배정받는다. -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
			//객체 표기법 {}
			var var1 = 3; //Number
			var var2 = "abc"; //String
			var var3 = () => {}; //Function
			var var4 = {}; //object
			var var5 = []; //object(배열)
			console.log("var1의 타입 : ", typeof(var1));
			console.log("var2의 타입 : ", typeof(var2));
			console.log("var3의 타입 : ", typeof(var3));
			console.log("var4의 타입 : ", typeof(var4));
			console.log("");
			
			//객체 생성
			let car = {
				//필드(속성)
				company: "현대자동차",
				name: "그랜저",
				price: 50000000,
			}
			console.log(car.company);
			console.log(car.name);
			console.log(car.price);
			//속성의 이름을 변수(문자열)로 받아올 경우에 사용하는 방법이다.
			console.log(car["company"]);
			console.log(car["name"]);
			console.log(car["price"]);
			console.log("");
			//필드값 변경
			car.company = "포르쉐";
			car["name"] = "911";
			
			console.log(car.company);
			console.log(car.name);
			
			car = {
				//필드(속성)
				company: "현대자동차",
				name: "그랜저",
				price: 50000000,
				speed: 0,
				//메소드(기능)
				run: function() {
					this.setSpeed(60);
					console.log(this.company + "의 " + this.name + "가" + this.speed + "km/h 속도로 달립니다.")
				},
				
				setSpeed: function(speed) {
					this.speed = speed;
				},
				
				toString: function() {
					return this.company + "-" + this.name;
				},
				
				sound: function() {
					console.log(this.name + "빵빵")
				}
				
				sound: () => {}
				//화살표 함수는 this가 객체 자신이 아니라, window 객체를 참조한다.
				//고로 화살표 함수 내부에는 this를 사용하는 코드를 작성하면 안된다.
			}
			//객체 내부의 메소드 호출
			car.run();
			
			var info = car.toString();
			console.log("info: ", info);
			
			car.sound();
		</script>
</head>
<body>
	<div class="card">
		<div class="card-header">Header</div>
		<div class="card-body"></div>
	</div>
</body>
</html>