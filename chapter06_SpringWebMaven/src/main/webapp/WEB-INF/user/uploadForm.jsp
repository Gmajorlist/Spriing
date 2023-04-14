<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>업로드</title>
<link rel="stylesheet" href="../css/checkDiv.css">
</head>
<body>
   <!-- 단순 submit -->
   <form id="updateForm" enctype="multipart/form-data" method="post"
      action="/chapter06_SpringWebMaven/user/upload">
      <table border="1">
         <tr>
            <th>파일명</td>
            <td><input type="text" name="imageName"></td>
         </tr>
         <tr>
            <td colspan="2"><textarea name="imgContent" rows="15" cols="50"></textarea></td>
         </tr>
         <!-- 다중 파일 업로드 시 name 속성을 같은 이름으로 지정 -->
      <!--    <tr>
            <td colspan="2"><input type="file" name="img"></td>
         </tr>
         <tr>
            <td colspan="2"><input type="file" name="img"></td>
         </tr> -->
         
         
         <tr>
         	<td colspan="2">
         	<!-- 업로드 버튼을 누르기 전에 카메라 아이콘을 통해서 선택한 이미지가 맞는지 확인하기 위해 이미지를 보이게 한다 -->
         	<img alt="1" id="showImg" width="300" height="300">
         	<img src="../img/OMG.png" alt="인스타" id="camara" width="30" height="30">
         		<input type="file" name="img[]" multiple="multiple" id="img" style="visibility:hidden">
         	</td>
         <tr>
            <td colspan="2" align="center"><input type="submit" id="uploadBtn" value="이미지 등록"></td>
         </tr>
      </table>
      
   </form>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.4.min.js">
$('#camera').click(function(){
	//강제 이벤트 발생
	$('#img').trigger('click');
});
</script>
   <!-- 2. AJax 통신 -->
</body>
</html>