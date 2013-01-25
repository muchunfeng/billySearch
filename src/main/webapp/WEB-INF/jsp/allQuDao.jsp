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
		<td><b>渠道名</b></td>
		<td><b>日期</b></td>
		<td><b>充值金额</b></td>
	</tr>
	<c:forEach var="qudaoinfo" items="${allQuDaoInfo}">
		<tr bgcolor="#FFFF88">
			<td><b> <font color="BLACK"><c:out
							value="${qudaoinfo.quDaoName}" /></font>
			</b></td>
			<td><b> <font color="BLACK"><c:out
							value="${qudaoinfo.today}" /></font>
			</b></td>
			<td><b> <font color="BLACK"><c:out
							value="${qudaoinfo.money}" /></font>
			</b></td>
		</tr>
	</c:forEach>
</table>

</head>
</html>