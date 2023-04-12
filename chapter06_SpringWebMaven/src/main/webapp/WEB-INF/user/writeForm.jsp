<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#writeForm div{
	color: red;
	font-size: 8pt;
	font-weight: bold;
}
</style>
</head>
<body>
	<h1>대답해 드리는게 회원가입!</h1>
	<img src="../img/2.png">
	<form id="writeForm">
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
				<input type="button" value="등록">
				<input type="reset" value="취소">
				</td>
		</table>
	</form>
	<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
	<script type="text/javascript" src="../js/write.js"></script>
</body>

</html>