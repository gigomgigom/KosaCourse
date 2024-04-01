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
			//변수를 const로 지정해놓아도 객체 내부 속성 및 메소드가 변하지만 객체 자체의 번지는 변하지않는다.
			const car = {};
			//동적(Dynamic)속성(field) 추가
			car.name = "그랜져";
			//동적 메소드 추가
			car.start = function() {
				console.log("시동을겁니다.");
			};
			//
			car.start();
			console.log(car);
		</script>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="card">
    		<div class="card-header">exam06_object_dynamic_field</div>
    		<div class="card-body">
    			
			</div>
  		</div>
	</body>
</html>