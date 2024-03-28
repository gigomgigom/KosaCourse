<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	* {
		margin:0px;
		padding:0px;
	}
	
	.menu {
		list-style:none;
		margin-top:20px;
		padding:10px;
	}
	
	.menuitem {
		border: 1px solid black;
		cursor:pointer;
		/*만약 margin과 padding값을 넣고 싶다면 inline-padding을 사용하면 된다.*/
		display: inline;
	}
	
	.mi {
		text-decoration: none;
		color: black;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	
	<h4>exam06_link</h4>
	<hr/>
	
	<!-- 버튼처럼 사용할려면 자바스크립트로 버튼기능을 구현해야한다. -->
	 <ul class="menu">
        <li class="menuitem">Menu1</li>
        <li class="menuitem">Menu2</li>
        <li class="menuitem">Menu3</li>
        <li class="menuitem">Menu4</li>
        <li class="menuitem">Menu5</li>
     </ul>
     
     <!-- 개행하다. -->
     <br/><br/>
     
     <!-- 지정된 링크로 이동하게끔한다. -->
     <div class="menu">
        <a class="mi" href="#">Menu1</a>
        <a class="mi" href="#">Menu2</a>
        <a class="mi" href="#">Menu3</a>
        <a class="mi" href="#">Menu4</a>
        <a class="mi" href="#">Menu5</a>
     </div>
</body>
</html>