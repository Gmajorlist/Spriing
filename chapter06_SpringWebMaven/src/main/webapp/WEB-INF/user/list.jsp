<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#currentPaging{
	color: red;
	border: 1px solid red;
	padding: 5px 8px; /* top / bottom, left / right  */
	margin: 5px; /* top, right, bottom, left  */
	cursor: pointer;
}
#paging{
	color: black;
	padding: 5px;
	margin: 5px;
	cursor: pointer;
}
</style>
</head>
<body>
<h3>
	<a href="/chapter06_SpringWebMaven/"><img src="/chapter06_SpringWebMaven/img/insta.PNG" width="50" height="50"></a>
	목록
</h3>

<input type="text" id="pg" value="${pg }">
<table id="userListTable" border="1" frame="hsides" rules="rows" cellspacing="0" cellpadding="5">
	<tr>
		<th width="200">이름</th>
		<th width="200">아이디</th>
		<th width="200">비밀번호</th>
	</tr>
	
	<!-- 동적 처리 -->
	
</table>
<div id="userPagingDiv" style= "width:650px; text-align:ceter; margin-top:3px;">
백산수
</div>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
<script type="text/javascript" src="../js/list.js"></script>
<script type="text/javascript">
function userPaging(pg){
	location.href = "/chapter06_SpringWebMaven/user/list?pg=" + pg;
}
</script>
</body>
</html>







