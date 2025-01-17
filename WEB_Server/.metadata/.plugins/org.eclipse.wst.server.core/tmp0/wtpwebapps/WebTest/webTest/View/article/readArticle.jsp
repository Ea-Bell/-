<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="u" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 읽기</title>
<link rel="stylesheet" type="text/css" href="/webTest/Model/login/info.css" />
<link rel="stylesheet" type="text/css"
	href="/webTest/Model/mainForm/mainForm.css" />
<script type="text/javascript" src="/webTest/Model/mainForm/mainForm.js"></script>
</head>
<%-- 기본 기능 스크립트--%>
<script type="text/javascript" src="/webTest/Model/login/info.js"></script>

<%-- 다음 주소 스크립트--%>
<script
	src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

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
	<!-- 사이드 컨텐츠 -->
	<div style="padding:10px; width: 30%; float: right;">
		<aside id="main_aside">

			<table border="0">
				<tr>
					<td><c:if test="${empty authUser }">
							<div align="center"><a href=""></a> <a href="/signUp">회원가입</a></div>
							<a href="/Login" ><img alt="" src="/webTest/img/login/login.png" style="height: 42px; width: 244px;"></a>
							<br>

						</c:if> <c:if test="${!empty authUser}">
				${authUser.nickname}님, 안녕하세요.<br />
							<a href="/LogoutHandler">[로그아웃하기]</a>
							<a href="/changePwdForm">[암호변경하기]</a>
									<a href="/fileUpLoad">[마이페이지]</a>
						</c:if></td>
				</tr>
			</table>

			<br>
			<table border="0">
				<tr>

					<td>
				<a href="/나는가수다.msi" download=>Window다운로드</a>
					</td>

				</tr>
			</table>

		</aside>
		</div>
		
		<div id="content"  style="; padding:10px; width: 65%;  float: left;" >

<!-- 메인 컨텐츠 -->


<table border="1" >
<tr>
	<td>번호</td>
	<td>${articleData.article.number}</td>
</tr>

<tr>
 	<td>작성자</td>
 	<td>${articleData.article.writer.name }</td>
</tr>
 <tr>
 	<td>제목</td>
 	<td><c:out value="${articleData.article.title }"></c:out></td>
</tr>
<tr>
 	<td>내용</td>
 	<td><u:pre value="${articleData.content }"/></td>
</tr>
<tr>
	<td colspan="2">
	<c:set var="pageNo" value="${empty param.pageNo?'1':param.pageNo}"/>
		<a href="/ListArticle?pageNo=${pageNo}">[목록]</a>
		<c:if test="${authUser.id== articleData.article.writer.id }">
		<a href="/modify?no=${articleData.article.number}">[게시글 수정]</a>
		<a href="/delete?no=${articleData.article.number}"  onclick="return confirm('삭제하시겠습니까?')">[게시글 삭제]</a>
		</c:if>
		</td>
</tr>
</table>





</div>
		
	<!-- 바텀 -->
	<div align="center">

	
		
	</div>

</body>


</html>