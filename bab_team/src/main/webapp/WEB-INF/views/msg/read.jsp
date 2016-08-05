<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<DIV class="title">
  조회
</DIV>
 
<TABLE>
  <TR>
    <TH>제목</TH>
    <TD>${msgDTO.msgTitle}</TD>
  </TR>
  <TR>
    <TH>내용</TH>
    <TD>${msgDTO.msgContent}</TD>
  </TR>
  <TR>
    <TH>등록일</TH>
    <TD>${msgDTO.sendDate}</TD>
  </TR>
  
</TABLE>
 
<DIV class="bottom">
  <input type='button' value='등록' onclick="location.href='./createForm.jsp'">
  <input type='button' value='목록' onclick="location.href='./list.jsp'">
  <input type='button' value='수정' onclick="updateM()">
  <input type='button' value='삭제' onclick="deleteM()">
</DIV>

</body>
</html> 
