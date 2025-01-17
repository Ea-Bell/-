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
				<a href="../login/index.jsp"> <img
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
						&nbsp; <a href="" onmouseover="TextMover3()"
					onmouseout="TextMount3()" id="nav3" style="color: black;">게시판</a>					
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
							<a href="/WebTest/LogoutHandler">[로그아웃하기]</a>
							<a href="changePwdForm.jsp">[암호변경하기]</a>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="../list/newMusicForm.jsp">[마이페이지]</a>
						</c:if></td>
				</tr>
			</table>

			<br>
			<table border="1">
				<tr>
					<a href="../../../나는가수다.msi" download=>Window다운로드</a>
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
<!-- /WebTest/UpLoad.do -->
<form action="/webTest/View/fileUpLoad/FileUpload.jsp" method="post" enctype="multipart/form-data">



<div align="center">
<p>
	
	&nbsp;	&nbsp;&nbsp;음악파일: <input type="file" name="music_file">
<br>
</p>

<p>
	음악이름:<input type="text" name="music_name" >
	
</p>
	



<p>
	
	앨범:<input type="text" name="album" >
</p>


<br>

<!-- 
<p>
	사진:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	  <input type="file" name="music_pictuer">
</p>
 -->

<br>
	<input type="submit" value="파일 등록">
</div>



</form>
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