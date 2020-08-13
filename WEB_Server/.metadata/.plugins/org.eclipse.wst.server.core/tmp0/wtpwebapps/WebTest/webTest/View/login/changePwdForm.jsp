<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="../../Model/mainForm/mainForm.css" />
<script type="text/javascript" src="../../Model/mainForm/mainForm.js"></script>

<meta charset="UTF-8">
<title>회원제 게시판 예시</title>
</head>
<body>
	<div align="center">

		<form action="mainForm.jsp" method="post">
			<!-- 헤더 -->
			<header>
				<a href="index.jsp"> <img
					src="../../img/logo.png"
					style="position: relative; top: 15px; left: 0px; width: 140px; width:140px">
				</a> <input type="text" onclick=""
					style="position: relative; left: 20px;">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <br>
				<br>
				<br> <a href="" onmouseover="TextMover()"
					onmouseout="TextMount()" id="nav" style="color: black;">차트</a>
				&nbsp; <a href="../fileUpLoad/fileList.jsp" onmouseover="TextMover2()"
					onmouseout="TextMount2()" id="nav2" style="color: black;">최신음악</a>
				&nbsp; <a href="" onmouseover="TextMover3()"
					onmouseout="TextMount3()" id="nav3" style="color: black;">장르음악</a>
						&nbsp; <a href="../article/list.jsp"  id="nav3" style="color: black;">게시판</a>					
				<br>
				<br>

			</header>
		</form>

		<hr id="hr">
		<br>

	</div>

	<!-- 콘텐츠 -->
	<div id="content" align="center" style="background-color: #ffffff; ">
		<section id="main_section">
			<article class="main_article"></article>
		</section>
		<!-- 메인 섹션 건들지 말것. -->

	<form action="/ChangePasswordHandler" method="post">
		<div>
			현재 암호: <br />
			<input type="password" name="curPwd">
			<c:if test="${param.pwd=='currentPwd' }">현재 암호를 입력하세요 </c:if>
			<c:if test="${param.pwd=='badCurPwd'}">현재 암호가 일치하지 않습니다</c:if>
		</div>
		<div>
			새 암호:<br />
			<input type="password" name="newPwd">
			<c:if test="${param.pwd=='newPwd'}">새 암호를 입력하세요.</c:if>
		</div>
		<div>
			<input type="submit" value="암호변경">
		</div>
	</form>



	</div>
	<!-- 바텀 -->
	<div align="center">

		<br> <br>
		<hr>
	</div>

</body>
</html>