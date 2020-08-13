<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" type="text/css" href="../../Model/login/info.css" />
</head>
<%-- 기본 기능 스크립트--%>
<script type="text/javascript" src="../../Model/login/info.js"></script>

<%-- 다음 주소 스크립트--%>
<script
	src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

<body>
	<form action="" name="join" method="post">
		<div align="center">
			<span> <font size="6px">회원가입</font>
			</span>
			<hr>
		</div>
		<div align="center">
			<table>
				<tr>
					<td align="center" id="iColor">아이디<span id="iSpan">*</span></td>
					<td><input type="text" size="30" name="id" value="${param.id}">
						<input type="submit" value="아이디중복확인" name="btn1" onclick="Btn(1)">
					</td>
				</tr>
				<tr>
					<td align="center" id="iColor">닉네임<span id="iSpan">*</span></td>
					<td><input type="text" size="30" name="nickname"> <c:if
							test="${errors.nickname }">닉네임을 입력하시오.</c:if></td>
				</tr>
				<tr>
					<td align="center" id="iColor">비밀번호<span id="iSpan">*</span></td>
					<td><input type="password" size="30" name="pw"> <c:if
							test="${errors.pw}}">암호를 입력하시오</c:if></td>
				</tr>
				<tr>
					<td align="center" id="iColor">비밀번호 확인<span id="iSpan">*</span></td>
					<td><input type="password" size="30"> <input type="submit"
						value="확인" name="confirmPw" onclick="Btn(3)"> <c:if
							test="${errors.confirmPw}">암호를 입력하시오.</c:if></td>
				</tr>
				<tr>
					<td align="center" id="iColor">이름<span id="iSpan">*</span></td>
					<td><input type="text" size="30" name="name"
						value="${param.name}"> <c:if test="${errors.name} }"></c:if>
					</td>
				</tr>

							<!-- 성별에서 디비 오류남 -->
				<tr>
					<td align="center" id="iColor">성별<span id="iSpan">*</span></td>
					<td><input type="radio" name="gender" value="남">남자 <input
						type="radio" name="gender" value="여">여자 <c:if
							test="${errors.gender}">성별을 클릭하시오.</c:if></td>
				</tr>
				<tr>
					<td align="center" id="iColor">전화번호<span id="iSpan">*</span></td>
					<td><input type="text" size="9" name="tel1">- <input
						type="text" size="9" name="tel2">- <input type="text"
						size="9" name="tel3"> <c:if test="${errors.tel }">전화번호를 입력하시오</c:if>
					</td>
				</tr>
				<tr>
					<td align="center" id="iColor">휴대폰<span id="iSpan">*</span></td>
					<td><input type="text" size="9" name="phone1"> <input
						type="text" size="9" name="phone2"> <input type="text"
						size="9" name="phone3"> <c:if test="${errors.phone}">번호를 입력하시오</c:if>
					</td>
				</tr>
				<tr>
					<td align="center" id="iColor">이메일<span id="iSpan">*</span></td>
				
				
			<td>
			<input type="text" name ="email1">@
			<input type="text" name ="email2">
			
			</td>
				<%-- 테스트 해야한다
<!-- 이메일  오류 있으니 이메일 체인지 찾아서 수정해서 완료할것(완료시 주석 삭제 요청함) --> 
					 
					<td>
						
						<input type="text" name="email1" onfocus="this.value='';"> @ 
						<input type="text" name="email2" value="" disabled>
						 <select name="email1" onchange="email_change()">
							<!--     <option value="0" >선택하세요</option> -->
							<option id="email2" value="9">직접입력</option>

							<option value="naver.com">naver.com</option>

							<option value="nate.com">nate.com</option>
					</select> <!-- 이메일끝 요기서 이메일 텍스트 부분을 3가지로 나눠서 생각하시오 --> <c:if
							test="errors.email">이메일을 입력하시오</c:if>
					</td>
					
					 --%>
				</tr>
				<tr>
					<td align="center" id="iColor">주소<span id="iSpan">*</span></td>

					<td><input type="text" id="sample4_postcode" name="addr1"
						placeholder="우편번호"> <input type="button"
						onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>

						<input type="text" id="sample4_roadAddress" name="addr2"
						placeholder="도로명주소"> <input type="text"
						id="sample4_jibunAddress" name="addr3" placeholder="지번주소">

						<span id="guide" style="color: #999; display: none"></span> <input
						type="text" id="sample4_detailAddress" name="addr4"
						placeholder="상세주소"> <input type="text"
						id="sample4_extraAddress" name="addr5" placeholder="참고항목">
						<c:if test="errors.addr">주소를 입력하시오</c:if></td>
				</tr>
				<tr>
					<td><input type="submit" value="보내기" name="btn2"
						onclick="Btn(2)"></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>