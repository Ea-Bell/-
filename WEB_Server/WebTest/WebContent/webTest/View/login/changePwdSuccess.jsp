<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="/webTest/Model/mainForm/mainForm.css" />
<script type="text/javascript" src="/webTest/Model/mainForm/mainForm.js"></script>

<meta charset="UTF-8">
<title>비밀번호 변경완료</title>
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
				&nbsp; <a href="/webTest/View/fileUpLoad/fileList.jsp" onmouseover="TextMover2()"
					onmouseout="TextMount2()" id="nav2" style="color: black;">최신음악</a>
				&nbsp; <a href="" onmouseover="TextMover3()"
					onmouseout="TextMount3()" id="nav3" style="color: black;">장르음악</a>
						&nbsp; <a href="/webTest/article/list.jsp"  id="nav3" style="color: black;">게시판</a>					
				<br>
				<br>			
		</form>



	</div>
</header>
		<hr id="head_line" size="10px" color="#ECB237">
		<br>
	<!-- 콘텐츠 -->
<div>


<div  style="float:left; width: 65%; height:80% ">	
<div align="center" >
<h1 style="height: 30%;">암호가 변경되었습니다.</h1>
</div>
	</div>

	
	
	<div style="padding:10px; width: 30%; float: right;">
		<aside id="main_aside">

			<table border="0">
				<tr>
					<td><c:if test="${empty authUser }">
							<div align="center"><a href=""></a> <a href="/webTest/login/signUp.jsp">회원가입</a></div>
							<a href="/webTest/login/login.jsp" ><img alt="" src="/webTest/img/login/login.png" style="height: 42px; width: 244px;"></a>
							<br>

						</c:if> <c:if test="${!empty authUser}">
				${authUser.nickname}님, 안녕하세요.<br />
							<a href="/LogoutHandler">[로그아웃하기]</a>
							<a href="changePwdForm.jsp">[암호변경하기]</a>
									<a href="/webTest/list/newMusicForm.jsp">[마이페이지]</a>
						</c:if></td>
				</tr>
			</table>

			<br>
			<table border="0">
				<tr>

					<td>
				<a href="/webTest/나는가수다.msi" download=>Window다운로드</a>
					</td>

				</tr>
			</table>

		</aside>
		</div>
		
		</div>
		
	<!-- 바텀 -->
	<div align="center">

	
		
	</div>

</body>
</html>