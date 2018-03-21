<%@ page import="com.ariix.myTest.ChinaPayUtil" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>chian pay test</title>
</head>
<body>

<%
    ChinaPayUtil cu = new ChinaPayUtil();
    cu.init();
%>
<form id="chinapay-form" action="http://newpayment-test.chinapay.com/CTITS/service/rest/forward/syn/000000000017/0/0/0/0" METHOD="POST">
	<input type=hidden name="Version" id="Version"  value="20150922">
	<input type=hidden name="MerId" id="MerId" value="000001707191527" >
	<input type=hidden name="MerOrderNo" id="MerOrderNo" value="1234567" >
	<input type=hidden name="TranDate" id="TranDate"  value="20170801">
	<input type=hidden name="TranTime" id="TranTime"  value="101122">
	<input type=hidden name="OrderAmt" id="OrderAmt"  value="10000">
	<input type=hidden name="TranType" id="TranType"  value="0006">
	<input type=hidden name="BusiType" id="BusiType"  value="0001">
	<input type=hidden name="CurryNo" id="CurryNo"  value="CNY">
	<input type=hidden name="MerBgUrl" id="MerBgUrl"  value="CNY">
	
</form>
</body>
</html>