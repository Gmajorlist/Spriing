<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<a href="/chapter06_SpringWebMaven/"> <img src="../img/2.png">
		</a>회원정보수정일까
	</h1>
	<br>

	<p>
		수정할 아이디 입력: <input type="text" id="searchId" placeholder="아이디를 입력">
		<input type="button" id="searchIdBtn" value="검색">
	</p>
	<div id="resultDiv"></div>

	<div id="updateDiv">
		<form id="updateForm">
			<table>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name"></td>
					<div id="nameDiv"></div>
				</tr>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id"></td>
					<div id="idDiv"></div>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="text" name="pwd"></td>
					<div id="pwdDiv"></div>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="button" value="수정">
					<input type="reset" value="취소"></td>
			</table>
		</form>
	</div>

	<script type="text/javascript"src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
	<script type="text/javascript" src="../js/update.js"></script>
</body>
</html>
