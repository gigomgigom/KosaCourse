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
			//클래스(설계도) 선언
			class Car {
				//생성자(필드 선언과 초기화)
				constructor() {
					//필드 선언과 초기화
					this.name = "그랜저";
					this.price = 5000000;
				}
				//메소드
				start() {
					console.log(this.name + "시동을 겁니다. 부릉부릉");
				}
				
				setPrice(price) {
					this.price = price;
				}
			}
			
			class Person {
				constructor(name, age) {
					this.name = name;
					this.age = age;
				}
			}
			
			//객체 생성
			const myCar = new Car();
			const yourCar = new Car();
			
			console.log(myCar.name);
			console.log(myCar.price);
			myCar.start();
			myCar.setPrice(60000000);
			
			const me = new Person("심영조", 23);
			const you = new Person("홍길동", 30);
			
			console.log(me.name, me.age);
			console.log(you.name, you.age);
			console.log(you);
			me.name = "시맹조";
			me.age = 25;
			console.log(me);
			
		</script>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="card">
    		<div class="card-header">exam09_class</div>
    		<div class="card-body">
    			
			</div>
  		</div>
	</body>
</html>