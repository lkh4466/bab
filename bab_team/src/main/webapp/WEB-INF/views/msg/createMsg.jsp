<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<FORM name='frm' method='POST' action='create'>
		<table>
		<tr>
			<td><input type="text" value="받는사람"></td>
		</tr>
		<tr>
			<td>체크박스 - 내게쓰기</td>
		</tr>
		<tr>
		<td><textarea rows="10" cols="50" name="content"></textarea></td> 
       </tr>
			    
		</table>
				<div class="bottom"><input type="submit" value="등록">
				</div>
	</form>

</body>
</html>