<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@ page import="java.io.File" %>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css"
	href="/webTest/Model/mainForm/mainForm.css" />
<script type="text/javascript" src="/webTest/Model/mainForm/mainForm.js"></script>

<meta charset="UTF-8">
<title>회원제 게시판 예시</title>
</head>
<body>

<header>
	<div align="center">

		<form action="mainForm.jsp" method="post">
			<!-- 헤더 -->
			
				<a href="/index" style="background: white;"> 
					 <img src="/webTest/img/logo.png"
					 style="position: relative; top: 15px; left: 0px; width: 140px; width:140px"></a>
					  <input type="text" onclick=""
					style="position: relative; left: 20px;">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <br>
				<br>
				
				<hr id="head_line" size="10px" color="#ECB237">
				
				<br> <a href="" onmouseover="TextMover()"
					onmouseout="TextMount()" id="nav" style="color: black;">차트</a>
					
				&nbsp; <a href="/fileList" onmouseover="TextMover2()"
					onmouseout="TextMount2()" id="nav2" style="color: black;">최신음악</a>
				&nbsp; <a href="" onmouseover="TextMover3()"
					onmouseout="TextMount3()" id="nav3" style="color: black;">장르음악</a>
						&nbsp; <a href="/ListArticle"  id="nav3" style="color: black;">게시판</a>					
				<br>
				<br>			
		</form>



	</div>
</header>
		<hr id="head_line" size="10px" color="#ECB237">
		<br>
	<!-- 콘텐츠 -->
	
	<div style="padding:10px; width: 30%; float: right;">
		<section id="main_section">
			<article class="main_article"></article>
		</section>
		<!-- 메인 섹션 건들지 말것. -->

		<aside id="main_aside">

			<table border="0">
				<tr>
					<td><c:if test="${empty authUser }">
							<div align="center"><a href=""></a> <a href="/signUp">회원가입</a></div>
							<a href="/login" ><img alt="" src="/webTest/img/login/login.png" style="height: 42px; width: 244px;"></a>
							<br>

						</c:if> <c:if test="${!empty authUser}">
				${authUser.nickname}님, 안녕하세요.<br />
							<a href="/changePwd">[로그아웃하기]</a>
							<a href="/changePwdForm">[암호변경하기]</a>
							<a href="/fileUpLoad">[마이페이지]</a>
						</c:if></td>
				</tr>
			</table>

			<br>
			<table>
				<tr>
					<td style="border: 1px"> 
				<a href="/나는가수다.msi" download=>Window다운로드</a>
					</td>

				</tr>
			</table>

		</aside>
		</div>
		<div id="content"  style="padding:10px; width: 65%;  float: left;" >

<div style="float: left; width: 30%;">
			<table >
	<tr><span style="color: #ff8385">최신음악</span></tr>
	<tr>
		<td><img  src="/webTest/img/newchart/다운로드.jpg" style="height: 80px; width: 80px;">	</td>
		<td><img  src="/webTest/img/newchart/다운로드 (1).jpg" style="height: 80px; width: 80px;">	</td>
		<td><img  src="/webTest/img/newchart/다운로드 (2).jpg" style="height: 80px; width: 80px;">	</td>
	</tr>
		<tr>
		<td><img  src="/webTest/img/newchart/다운로드 (3).jpg" style="height: 80px; width: 80px;">	</td>
		<td><img  src="/webTest/img/newchart/다운로드 (4).jpg" style="height: 80px; width: 80px;">	</td>
		<td><img  src="/webTest/img/newchart/다운로드 (5).jpg" style="height: 80px; width: 80px;">	</td>
	</tr>
			</table>
					<table >
	<tr><span style="color: #ff8385">이달의 음악</span></tr>
	<tr>
		<td><img  src="/webTest/img/newchart/다운로드 (6).jpg" style="height: 80px; width: 80px;">	</td>
		<td><img  src="/webTest//img/newchart/다운로드 (7).jpg" style="height: 80px; width: 80px;">	</td>
		<td><img  src="/webTest/img/newchart/다운로드 (8).jpg" style="height: 80px; width: 80px;">	</td>
	</tr>
		<tr>
		<td><img  src="/webTest/img/newchart/다운로드 (9).jpg" style="height: 80px; width: 80px;">	</td>
		<td><img  src="/webTest/img/newchart/다운로드 (10).jpg" style="height: 80px; width: 80px;">	</td>
		<td><img  src="/webTest/img/newchart/다운로드 (11).jpg" style="height: 80px; width: 80px;">	</td>
	</tr>
			</table>
			
</div>
<div>
<!-- 가운데 컨텐츠 삽입용 -->
</div>
<div style="float: right; width: 30%">
		
			<span style="color: #ff8385">추천음악</span><br>
		<img  src="/webTest/img/newchart/다운로드 (16).jpg" style="height: 200px; width:200px;">
		
</div>	


</div>


	
	<!-- 바텀 -->
	<div align="center">


	</div>

</body>
</html>