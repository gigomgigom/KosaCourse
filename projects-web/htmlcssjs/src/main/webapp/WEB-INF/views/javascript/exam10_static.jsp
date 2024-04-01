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
			class Car {
				//인스턴스 필드는 생성자 내부에 선언되어야 하고 정적 필드는 생성자 외부에 선언되어야한다.
				//정적 필드와 초기화
				static company = "현대자동차";
				
				//생성자를 통한 인스턴스 필드 선언과 초기화
				constructor(name="그랜저", price=50000000) {
					//인스턴스 필드와 초기화
					this.name = name;
					this.price = price;
				}
				
				//정적 메소드 선언
				static setCompany(company) {
					return Car.company = company;
				}
				
				static getCompany() {
					return Car.company;
				}
				//인스턴스 메소드 선언
				setPrice(price) {
					this.price = price;
				}
				getPrice(price) {
					return this.price;
				}
			}
			
			//클래스 사용
			//정적 멤버 사용
			console.log(Car.company);
			Car.setCompany("KIA");
			console.log(Car.getCompany());
			//인스턴스 멤버 사용
			const myCar = new Car("포르쉐", 200000000);
			console.log(myCar.price);
			myCar.setPrice(30000000);
			console.log(myCar.getPrice());
		</script>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="card">
    		<div class="card-header">exam10_static</div>
    		<div class="card-body">
    			
			</div>
  		</div>
	</body>
</html>