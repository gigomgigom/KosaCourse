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
			//객체 생성
			const board = {
				bno: 1,
				title: "오늘은 월요일",
				content: "살려주세요",
				writer: "홍길동",
			}
			//---------------------------------
			//*중요* board객체 내부 속성 값을 불러오는 방법
			//var title = board.title;
			var {title} = board;
			console.log(title);
			//다수의 속성값들을 불러오는 방법
			/* var bno = board.bno;
			var content = board.content; */
			var {title, content} = board;
			console.log("title: ", title);
			console.log("content: ", content);
			function fun1({title}) {
				console.log(title);
			}
			fun1(board);
			//---------------------------------
			//...rest: 앞에 명시한 속성 외의 나머지는 객체로 만들어서 저장하라.
			var {writer, ...rest} = board;
			console.log(writer);
			console.log(rest);
			//*중요*   ...: 나머지는 구조분해해서 그대로 넣어라
			var newBoard = {...board, bno:2, title:"벚꽃이 좋아요."};
			console.log(board);
			console.log(newBoard);
			//화살표 함수로 표현
			var newBoard2 = (board) => {
				return {...board, hitcount:1}
			};
			//만약 객체를 리턴하는 함수에서 실행문을 포함하는 중괄호를 삭제하려면 객체를 소괄호로 묶어주어야한다.
			
			console.log(newBoard2(board));
		</script>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="card">
    		<div class="card-header">exam12_destructuring_assignment[구조분해할당]</div>
    		<div class="card-body">
    			구조분해(destructuring) 할당(assignment)
    			
    			변수 = 값; [변수를 값에 할당한다.]
    			
			</div>
  		</div>
	</body>
</html>