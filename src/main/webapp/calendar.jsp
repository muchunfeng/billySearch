<%@   page language="java" import="java.util.*"%>
<%@   page contentType="text/html;   charset=gb2312"%>
<%!String year;
	String month;%>
<%
	month = request.getParameter("month");
	year = request.getParameter("year");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;   charset=gb2312">
<title>��</title>
<script Language="JavaScript">
<!--
	function changeMonth() {
		var mm = "calendar.jsp?month=" + document.sm.elements[0].selectedIndex
				+ "&year=" +
<%=year%>
	;
		window.open(mm, "_self");
	}
//-->
</script>
</head>
<%!String days[];%>
<%
	days = new String[42];
	for (int i = 0; i < 42; i++) {
		days[i] = "";
	}
%>
<%
	Calendar thisMonth = Calendar.getInstance();
	if (month != null && (!month.equals("null")))
		thisMonth.set(Calendar.MONTH, Integer.parseInt(month));
	if (year != null && (!year.equals("null")))
		thisMonth.set(Calendar.YEAR, Integer.parseInt(year));
	year = String.valueOf(thisMonth.get(Calendar.YEAR));
	month = String.valueOf(thisMonth.get(Calendar.MONTH));
	thisMonth.setFirstDayOfWeek(Calendar.SUNDAY);
	thisMonth.set(Calendar.DAY_OF_MONTH, 1);
	int firstIndex = thisMonth.get(Calendar.DAY_OF_WEEK) - 1;
	int maxIndex = thisMonth.getActualMaximum(Calendar.DAY_OF_MONTH);
	for (int i = 0; i < maxIndex; i++) {
		days[firstIndex + i] = String.valueOf(i + 1);
	}
%>
<body>
	<FORM method="post" action="calendar.jsp">
		<%=year%>��
		<%=Integer.parseInt(month) + 1%>��
		<table border="0" width="168" height="81">
			<div align=center>
				<tr>
					<th width="25" height="16" bgcolor="#FFFF00"><font color="red">��</font>
					</th>
					<th width="25" height="16" bgcolor="#FFFF00">һ</th>
					<th width="25" height="16" bgcolor="#FFFF00">��</th>
					<th width="25" height="16" bgcolor="#FFFF00">��</th>
					<th width="25" height="16" bgcolor="#FFFF00">��</th>
					<th width="25" height="16" bgcolor="#FFFF00">��</th>
					<th width="25" height="16" bgcolor="#FFFF00"><font
						color="green">��</fon     
  t></th>
				</tr>
				<%
					for (int j = 0; j < 6; j++) {
				%>
				<tr>
					<%
						for (int i = j * 7; i < (j + 1) * 7; i++) {
					%>
					<td width="15%" height="16" bg?color="#C0C0C0" valign="middle"
						align="ce     
  nter"><a
						href="jump.jsp?year=<%=year%>&month=<%=Integer.parseInt(month) + 1%>&date=<%=days[i]%>"
						target="main"><%=days[i]%></a></td>
					<%
						}
					%>
				</tr>
				<%
					}
				%>
			</div>
		</table>
		<table border="0" width="168" height="20">
			<tr>
				<td width=30%><select size="1">
						<option value="0">һ��</option>
						<option value="1">����</option>
						<option value="2">����</option>
						<option value="3">����</option>
						<option value="4">����</option>
						<option value="5">����</option>
						<option value="6">����</option>
						<option value="7">����</option>
						<option value="8">����</option>
						<option value="9">ʮ��</option>
						<option value="10">ʮһ��</option>
						<option value="11">ʮ����</option>
				</select></td>
				<td width=28%><input type=text value=<%=year%> size=4
					maxlength=4></td>
				<td>��</td>
				<td width=28%><input type=submit value="�ύ"></td>
			</tr>
		</table>
	</FORM>
	<script Language="JavaScript">
	<!--
		document.sm.month.options.selectedIndex=
	<%=month%>
		;
	//-->
	</script>
</body>
</html>