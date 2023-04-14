<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>업로드</title>

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
         	<img  id="showImg" width="30" height="30">
         	<img src="../img/OMG.png" alt="왜안떠" id="camara" width="55" height="20">
         		<input type="file" name="img[]" multiple="multiple" id="img" style="visibility:hidden;">
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

<!-- 업로드 버튼을 누르기 전에 카메라 아이콘을 통해서 선택한 이미지가 맞는지 확인하기 위해 이미지를 보이게 한다 -->
$('#img').change(function(){
	readURL(this);
});
function readURL(input){
	var reader = new FileReader();
	
	reader.onload = function(e){
		$('#showImg').attr('src', e.target.result); //e.target - 이벤트가 발생하는 요소를 반환해준다.
	}
	reader.readAsDataURL(input.files[0]);
	
	
}



</script>
   <!-- 2. AJax 통신 -->
</body>
</html>

<!-- 
FileReader 란?
FileReader는 type이 file인 input 태그 또는 API 요청과 같은 인터페이스를 통해 
File 또는 Blob 객체를 편리하게 처리할수있는 방법을 제공하는 객체이며
abort, load, error와 같은 이벤트에서 발생한 프로세스를 처리하는데 주로 사용되며,
File 또는 Blob 객체를 읽어서 result 속성에 저장한다.

FileReader도 비동기로 동작한다.

FileReader.onload()
load 이벤트의 핸들러. 이 이벤트는 읽기 동작이 성공적으로 완료되었을 때마다 발생한다.
 -->