<%@ page contentType="text/html;charset=utf-8"%>
<html>
<head>
<title>BillySearch</title>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<META HTTP-EQUIV="Cache-Control" CONTENT="max-age=0">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<meta http-equiv="expires" content="0">
<META HTTP-EQUIV="Expires" CONTENT="Tue, 01 Jan 1980 1:00:00 GMT">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
</head>
<body>
	<h2>Hello !</h2>

	年份:
	<input type="text" id="year" /> 月份:
	<input type="text" id="month" />
	<br>
	<script type="text/javascript">
		var year;
		var month;

		var result1;
		var result2;
		function parameterJudge() {
			result1=null;
			result2=null;
			year=null;
			month=null;
			year = document.getElementById("year").value;
			month = document.getElementById("month").value;
			var reg1 = /^\d{4}$/;
			var reg2 = /^\d{1,2}$/;
			result1 = reg1.exec(year);
			result2 = reg2.exec(month);
			if (result1 == null) {
				alert("年份输入错误");
				return false;
			}
			if (result2 == null || month > 12 || month < 1) {
				alert("月份输入错误");
				return false;
			}
			return true;
		}

		function gotoAllGames() {
			if (parameterJudge()) {
				window.open("billySearch/allGames.do?year=" + year + "&month="
						+ month);
			}
		}
		function gotoAllQuDao() {
			if (parameterJudge()) {
				window.open("billySearch/allQuDao.do?year=" + year + "&month="
						+ month);
			}
		}
	</script>
	<br>
	<br>
	<br>
	<a href="#" onclick="gotoAllGames()">所有游戏</a>
	<br>
	<br>
	<a href="#" onclick="gotoAllQuDao()">所有渠道</a>
	<p>
	<p><a href="j_spring_security_logout">Logout</a></p>

</body>
</html>
