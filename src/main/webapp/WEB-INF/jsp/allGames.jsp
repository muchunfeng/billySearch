<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>BillySearch</title>
<meta content="text/html; charset=utf-8"
	http-equiv="Content-Type" />
<META HTTP-EQUIV="Cache-Control" CONTENT="max-age=0">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<meta http-equiv="expires" content="0">
<META HTTP-EQUIV="Expires" CONTENT="Tue, 01 Jan 1980 1:00:00 GMT">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
</head>

<table align="center" bgcolor="#008800" border="0" cellspacing="2"
	cellpadding="3">
	<tr bgcolor="#CCCCCC">
		<td><b>游戏名</b></td>
		<td><b>日期</b></td>
		<td><b>充值金额</b></td>
	</tr>
	<c:forEach var="gameinfo" items="${allGamesInfo}">
		<tr bgcolor="#FFFF88">
			<td><b> <font color="BLACK"><c:out
							value="${gameinfo.gameName}" /></font>
			</b></td>
			<td><b> <font color="BLACK"><c:out
							value="${gameinfo.today}" /></font>
			</b></td>
			<td><b> <font color="BLACK"><c:out
							value="${gameinfo.money}" /></font>
			</b></td>
		</tr>
	</c:forEach>
</table>

</head>
</html>