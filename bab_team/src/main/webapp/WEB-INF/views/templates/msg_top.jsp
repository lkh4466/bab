<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
/* 상단 메뉴  */
.top{
	width : 100%;
	height : 25px;
}

/* 왼쪽 메뉴  */
.left{
	float: left;
	width : 130px;
	height : 100%;
}

TABLE{
  border-color: #AAAAAA;     
  border-width: 1px;         
  border-style: solid;       
  border-collapse: collapse;
  
  width: 100%;
}
 
tr{
  border-color: #AAAAAA;     
  border-width: 1px;         
  border-style: solid;           
}

td{
	padding:2 2 2 2;
	height: 30px;
	line-height:30px;
	vertical-align:middle;
}

/* 탭 선택 시 표시할 요소(div) 정의(1번 탭 선택 시 첫 번째 div 요소 표시) */
#css_tabs input:nth-of-type(1), #css_tabs input:nth-of-type(1) ~ div:nth-of-type(1),
#css_tabs input:nth-of-type(2), #css_tabs input:nth-of-type(2) ~ div:nth-of-type(2),
#css_tabs input:nth-of-type(3), #css_tabs input:nth-of-type(3) ~ div:nth-of-type(3) {
    display:none
}
#css_tabs input:nth-of-type(1):checked ~ div:nth-of-type(1),
#css_tabs input:nth-of-type(2):checked ~ div:nth-of-type(2),
#css_tabs input:nth-of-type(3):checked ~ div:nth-of-type(3) {
    display:block
}
/* 라벨 기본 스타일 지정 */
#css_tabs > label {
    display:inline-block;
    font-variant:small-caps;
    font-size:.9em;
    padding:5px;
    text-align:center;
    width:20%;
    line-height:1.8em;
    font-weight:700;
    border-radius:3px 3px 0 0;
    background:#eee;
    color:#777;
    border:1px solid #ccc;
    border-width:1px 1px 0
}
#css_tabs > label:hover {
    cursor:pointer
}
#css_tabs label[for=tab1] {
    margin-left:1.5em
}

/* 선택된 라벨, 커서를 올린 라벨 스타일 지정 */
#css_tabs input:nth-of-type(1):checked ~ label:nth-of-type(1), #css_tabs > label[for=tab1]:hover {
    background:tomato;
    color:#fff
}
#css_tabs input:nth-of-type(2):checked ~ label:nth-of-type(2), #css_tabs > label[for=tab2]:hover {
    background:gold;
    color:#fff
}
#css_tabs input:nth-of-type(3):checked ~ label:nth-of-type(3), #css_tabs > label[for=tab3]:hover {
    background:green;
    color:#fff
}

.left div{
	cursor: pointer;    
	background-color: rgb(255,255,255); 
}

.left div:hover{     
  text-decoration: none;  
  color: #9b9bff;      
}

.left div.on {
	color : #AAAAAA;
} /* 선택한 경우 css */

.left div:FOCUS{     
  text-decoration: none;  
  background-color: #9b9bff;      
}



/* 오른쪽 사용창  */
.right{
	float: left;
	width : auto;
	height: 100%;
}
.list tr{        
  border-left-color: #FFFFFF;     
  border-right-color: #FFFFFF;     
  border-width: 1px;         
  border-style: solid;
  
}
 

.list #from{
	width: 150px;
}
.list #title{
	width: 400px;
}
.list #time{
	width: 40px;
}

.bottom{
	text-align: center;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="../css/msg.css" rel="stylesheet">
</head>
<body>
	<div class="top"> 
		top 메뉴1
	</div>

	<div class="left" id="css_tabs">
		<table>
			<tr>
				<td>
					<div onclick="location.href='${pageContext.request.contextPath}/msg/recvMsg';">받은 쪽지</div>
					<div onclick="location.href='${pageContext.request.contextPath}/msg/sendMsg';">보낸 쪽지</div>
					<div onclick="location.href='${pageContext.request.contextPath}/msg/createMsg';">쪽지 쓰기</div>
				</td>
			</tr>
			<tr>
				<td>
					<div onclick="location.href='${pageContext.request.contextPath}/msg/delRecvMsg';">받은 휴지통</div>
					<div onclick="location.href='${pageContext.request.contextPath}/msg/delSendMsg';">보낸 휴지통</div>
	   			</td>
	   		</tr>
	   		<tr>
	   			<td>닫기</td>
	   		</tr>
   		</table>
   </div>
   
   <div class="right">