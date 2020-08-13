<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<head>
<link rel="stylesheet" type="text/css"
	href="../../Model/mainForm/mainForm.css" />
<meta charset="UTF-8">
<title>음악등록</title>
</head>
<script type="text/javascript" src="../../Model/mainForm/mainForm.js"></script>
<body>
	<div align="center">

		<form action="mainForm.jsp" method="post">
			<!-- 헤더 -->
			<header>
				<a href="mainForm.jsp"> <img src="../../img/logo.png"
					style="position: relative; top: 20px; left: 10px">
				</a> <input type="text" onclick=""
					style="position: relative; left: 20px;">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <br>
				<br>
				<br> <a href="" onmouseover="TextMover()"
					onmouseout="TextMount()" id="nav" style="color: black;">차트</a>
				&nbsp; <a href="../chart/recentMusic.jsp" onmouseover="TextMover2()"
					onmouseout="TextMount2()" id="nav2" style="color: black;">최신음악</a>
				&nbsp; <a href="" onmouseover="TextMover3()"
					onmouseout="TextMount3()" id="nav3" style="color: black;">장르음악</a>
				<br>
				<br>

			</header>
		</form>

		<hr id="hr">
		<br>

	</div>

	<!-- 콘텐츠 -->
	<div id="content" align="center" style="background-color: #ffffff;">
		<section id="main_section">
			<article class="main_article"></article>
		</section>
		<!-- 메인 섹션 건들지 말것. -->


		<aside id="main_aside">
			<form action="../login/login.jsp">
				<table border="1">
					<tr>
						<td><a href=""></a>반갑습니다!&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="../login/signUp.jsp">회원가입</a>
							<input type="image" src="../../img/login/login.png"
							style="height: 42px; width: 244px;"><br></td>
					</tr>
				</table>

			</form>

			<br>
			<table border="1">
				<tr>
					<td><a href="downLoad.jsp">Window다운로드</a></td>
				</tr>
			</table>

		</aside>
		<br>
<%-- 
		<aside id="main_bside">


			<table border="1">
				<tr>
					<td>내용물1</td>
					<td>내용물2</td>
				</tr>
				<tr>	
					<td>내용물3</td>
					<td>내용물4</td>
				</tr>
				<tr>	
					<td>내용물5</td>
					<td>내용물6</td>
				</tr>
				<tr>	
					<td>내용물7</td>
					<td>내용물8</td>
				<tr>
					<td>내용물9</td>
					<td>
						<!-- 요기가 한계선 --> 내용물10
					</td>
				</tr>

			</table>

		</aside>
--%>
<section>
<div align="left">

music_file:    <%request.getAttribute("music_file"); %><br>
music_pictuer: <%request.getAttribute("music_pictuer"); %>



 </div>
</section>
	</div>
	<!-- 바텀 -->
	<div align="center">


		<br> <br>
		<hr>
	</div>
	
</body>
</html>