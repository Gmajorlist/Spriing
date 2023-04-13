$(function(){
	$('#updateDiv').hide();
	
	//아이디 찾기
	$('#searchIdBtn').click(function(){
		$('#resultDiv').empty();
		
		$.ajax({
			type: 'post',
			url: '/chapter06_SpringWebMaven/user/getUser',
			data: 'id=' + $('#searchId').val(),
			//dataType: 'json'
			/*
			아이디가 있으면 UserDTO가 JSON으로 오지만
			아이디가 없으면 JSON으로 오지를 못한다.
			그래서 dataType를 생략한다. (dataType를 생략하면 자료에 맞게 자동으로 형식이 지정된다.)
			*/
			
			success: function(data){
				console.log(JSON.stringify(data));
				
				if(data == ''){
					$('#updateDiv').hide();
				
					$('#resultDiv').text('찾고자 하는 아이디가 없습니다');
					$('#resultDiv').css('color', 'red').css('font-weight', 'bold');
				
				}else{
					$('#updateDiv').show();
					
					$('#name').val(data.name);
					$('#id').val(data.id);
					$('#pwd').val(data.pwd);
				}
			},
			error: function(err){
				console.log(err);
			}			
		});//ajax
	});
	
	
});
	//취소버튼
$('#resetBtn').click(function(){
// 강제 이벤트 발생  트리거
	$('#searchIdBtn').trigger('click');

});

	//수정버튼
$('#updateBtn').click(function(){
	 if($('#id').val() == ''){
		$('#idDiv').text('아이디 입력');
		$('#id').focus();
		
	}else if($('#pwd').val() == ''){
		$('#pwdDiv').text('비밀번호 입력');
		$('#pwd').focus();
	
	}else{
		$.ajax({
			type: 'post',
			url: '/chapter06_SpringWebMaven/user/update',
			data: $('#updateForm').serialize(),
			success: function(){
				alert("회원정보를 수정.");
				location.href='/chapter06_SpringWebMaven/user/list';
			},
			error: function(err){
				console.log(err);
			}
		});
	}		
});






















