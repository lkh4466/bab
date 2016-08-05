<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table class="list">
		<c:choose>
			<c:when test="${empty list}">
				<tr>
					<td id="from"></td>
					<td id="title">받은 쪽지가 없습니다.</td>
					<td id="time"></td>
				</tr>
				<c:forEach begin="0" end="9" step="1">
					<tr>
						<td id="from"></td>
						<td id="title"></td>
						<td id="time"></td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<c:forEach var="msgDTO" items="${list}">
					<tr>
						<td id="from">${msgDTO.sendID}</td>
						<td id="title">
							<a href="./read?msgNum=${msgDTO.msgNum}">${msgDTO.msgTitle}</a>
						</td>
						<td id="time">시간</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
	
	<DIV class='bottom'>
	    ${paging}
	</DIV>
</body>
</html>