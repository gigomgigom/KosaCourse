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
    		//변수를 선언할 수 있는 세가지 방법
    		//전역변수
    		var var1 = 1;
    		let var2 = 1;
   			const var3 = "abc"; //상수(값변경X)
  				
 			console.log("var1: ", var1);
   			console.log("var2: ", var2);
   			console.log("var3: ", var3);
   			console.log("");
    				
 			var var1 = 2; //(O)
   			let var2 = 2.0; //(O)
 			const var3 = "bcd"; //(X)
    	</script>
		
		<script type="text/javascript">
			//함수 선언
			function fun1() {
				//지역변수
				var var4 = 1; 		//지역변수 (함수레벨)
				let var5 = 1.0;		//지역변수 (블록레벨)
				const var6 = "abc";	//지역변수 (블록레벨)
				
				if(true) {
					var var7 = 1;	//지역변수 (함수레벨)
					let var8 = 1.0;	//지역변수 (블록레벨)
					const var9 = "abc";//지역변수 (블록레벨)
					
				}
			}
			
			function fun2() {
				console.log
			}
			fun1();
		</script>
		<meta charset="UTF-8">
		<title>exam02_variables</title>
	</head>
	<body>
		<div class="card">
    		<div class="card-header">Header</div>
    		<div class="card-body">
    			
			</div>
  		</div>
	</body>
</html>