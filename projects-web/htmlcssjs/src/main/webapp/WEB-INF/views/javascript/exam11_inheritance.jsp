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
			//부모클래스
			class Car {
				constructor(name="그랜저", price=5000000){
					this.name = name;
					this.price = price;
				}
				start() {
					console.log(this.name + "시동을 겁니다 부릉부릉");
				}
				setPrice(price) {
					this.price = price;
				}
			}
			
			//상속(자식클래스)
			class SportsCar extends Car {
				constructor(name="포르쉐", price=15000000, cc=3000) {
					super(name, price);
					this.cc = cc;
				}
				fastRun() {
					console.log("빠르게 달립니다. 부우우웅!");
				}
				start() {
					console.log(this.name + "시동이 걸립니다 스포츠카 부르르르르랑");
				}
			}
			
			//자식객체 생성
			const myCar = new SportsCar("람보르기니", 50000000, 6000);
			console.log(myCar.name); //부모
			console.log(myCar.price);
			console.log(myCar.cc);
			myCar.start();
			myCar.setPrice(450000000);
			myCar.fastRun();
		</script>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="card">
    		<div class="card-header">exam11_inheritance</div>
    		<div class="card-body">
    			
			</div>
  		</div>
	</body>
</html>