<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<form action="join_db.jsp" method="post" name="joinForm">
		<p>
			<label>아이디 : <input type="text" name="id"></label>
		</p>
		<p id="result"></p>
		<p><label>이름 : <input type="text" name="name"></label></p>
		<p><label>비밀번호 : <input type="password" name="password"></label></p>
		<p><label>비밀번호 확인 : <input type="password" name="password_re"></label></p>
		<p>
			성별 :
			남자 <input type="radio" name="gender" value="남자" checked>
			여자 <input type="radio" name="gender" value="여자">
		</p>
	</form>
</body>
</html>