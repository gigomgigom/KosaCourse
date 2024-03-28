<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
			div {
				border: 1px solid black;
			}
			
			#wrapper {
				display: flex;
				flex-direction: row;
				height: 500px;
				/*수직정렬*/
				align-items: center;
				/*수평정렬*/
				justify-content: center;
			}
			
			#div1 {
				width: 100px;
				height: 100px;
				/*빈공간을 채우면서 늘어나게 된다. 다른 자식 요소에서도 값이 지정되어있으면 비율에 맞춰 크기가 조정된다.*/
				flex-grow: 1;
			}
			
			#div2 {
				width: 100px;
				height: 100px;
				flex-grow: 2;
			}
			
			#div3 {
				width: 100px;
				height: 100px;
				flex-grow: 3;
			}
			
		</style>
	</head>
	<body>
		<h4>exam11_flex</h4>
		<hr/>
		
		<div id="wrapper">
			<div id="div1">div1</div>
			<div id="div2">div2</div>
			<div id="div3">div3</div>
		</div>
	</body>
</html>