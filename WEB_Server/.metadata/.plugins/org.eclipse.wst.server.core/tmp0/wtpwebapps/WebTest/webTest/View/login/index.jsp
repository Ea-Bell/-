<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@ page import="java.io.File" %>
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
				<a href="/index.do"> 
				
					 <img src="${pageContext.request.contextPath}/../img/logo.png"
					 style="position: relative; top: 15px; left: 0px; width: 140px; width:140px">
				</a> <input type="text" onclick=""
					style="position: relative; left: 20px;">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <br>
				<br>
				<br> <a href="" onmouseover="TextMover()"
					onmouseout="TextMount()" id="nav" style="color: black;">차트</a>
				&nbsp; <a href="<%=request.getContextPath()%>/../fileUpLoad/fileList.jsp" onmouseover="TextMover2()"
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
	<div id="content" align="center" style="background-color: #ffffff;">
		<section id="main_section">
			<article class="main_article"></article>
		</section>
		<!-- 메인 섹션 건들지 말것. -->

		<aside id="main_aside">

			<table border="1">
				<tr>
					<td><c:if test="${empty authUser }">
							<div align="center"><a href=""></a> <a href="../login/signUp.jsp">회원가입</a></div>
							<a href="../login/login.jsp" ><img alt="" src="../../img/login/login.png" style="height: 42px; width: 244px;"></a>
							<br>

						</c:if> <c:if test="${!empty authUser}">
				${authUser.nickname}님, 안녕하세요.<br />
							<a href="/LogoutHandler">[로그아웃하기]</a>
							<a href="changePwdForm.jsp">[암호변경하기]</a>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="../list/newMusicForm.jsp">[마이페이지]</a>
						</c:if></td>
				</tr>
			</table>

			<br>
			<table border="1">
				<tr>

					<td>
				<a href="../../../나는가수다.msi" download=>Window다운로드</a>
					</td>

				</tr>
			</table>

		</aside>
<aside id="main_bside">


			<table ><thead>
	<tr><span style="color: #ff8385">최신음악</span></tr>
	<tr>
		<td><img  src="../../img/newchart/다운로드.jpg" style="height: 80px; width: 80px;">	</td>
		<td><img  src="../../img/newchart/다운로드 (1).jpg" style="height: 80px; width: 80px;">	</td>
		<td><img  src="../../img/newchart/다운로드 (2).jpg" style="height: 80px; width: 80px;">	</td>
	</tr>
		<tr>
		<td><img  src="../../img/newchart/다운로드 (3).jpg" style="height: 80px; width: 80px;">	</td>
		<td><img  src="../../img/newchart/다운로드 (4).jpg" style="height: 80px; width: 80px;">	</td>
		<td><img  src="../../img/newchart/다운로드 (5).jpg" style="height: 80px; width: 80px;">	</td>
	</tr>
			</table>
					<table ><thead>
	<tr><span style="color: #ff8385">이달의 음악</span></tr>
	<tr>
		<td><img  src="../../img/newchart/다운로드 (6).jpg" style="height: 80px; width: 80px;">	</td>
		<td><img  src="../../img/newchart/다운로드 (7).jpg" style="height: 80px; width: 80px;">	</td>
		<td><img  src="../../img/newchart/다운로드 (8).jpg" style="height: 80px; width: 80px;">	</td>
	</tr>
		<tr>
		<td><img  src="../../img/newchart/다운로드 (9).jpg" style="height: 80px; width: 80px;">	</td>
		<td><img  src="../../img/newchart/다운로드 (10).jpg" style="height: 80px; width: 80px;">	</td>
		<td><img  src="../../img/newchart/다운로드 (11).jpg" style="height: 80px; width: 80px;">	</td>
	</tr>
			</table>
			

		</aside>

		<aside id="main_bside" style="float: left;">
			<span style="color: #ff8385">추천음악</span><br>
		<img  src="../../img/newchart/다운로드 (16).jpg" style="height: 200px; width:200px;">
		
		</aside>





	</div>
	<!-- 바텀 -->
	<div align="center">

		<br> <br>
		<hr>
	</div>

</body>
</html>