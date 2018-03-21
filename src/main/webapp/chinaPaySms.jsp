<%@ page import="com.ariix.myTest.ChinaPayUtil" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>china pay sms</title>
</head>
<body>

<%
    ChinaPayUtil cpu = new ChinaPayUtil();
    String cardTranData = cpu.getCardTranData();
    String sign = cpu.getSignature4Sms();
    out.println(cardTranData);
    out.println(sign);
%>
<form id="chinapay-form" action="http://newpayment-test.chinapay.com/CTITS/service/rest/forward/syn/000000000017/0/0/0/0/0" METHOD="POST">
	<input type=hidden name="Version" id="Version"  value="20150922">
	<input type=hidden name="MerId" id="MerId" value="000001707191527" >
	<input type=hidden name="MerOrderNo" id="MerOrderNo" value="12345678" >
	<input type=hidden name="TranDate" id="TranDate" value="20170802" >
	<input type=hidden name="TranTime" id="TranTime" value="114901" >
	<input type=hidden name="OrderAmt" id="OrderAmt" value="1" >
	<input type=hidden name="TranType" id="TranType"  value="0607">
	<input type=hidden name="BusiType" id="BusiType"  value="0001">
	<input type=hidden name="TranReserved" id="TranReserved"  value='{"TerminalType":"05"}'>
	<input type=hidden name="CardTranData" id="CardTranData"  value="<%=cardTranData%>">
	<input type=hidden name="Signature" id="Signature"  value="<%=sign%>">
	<input type="submit" value="sign query">
</form>
</body>
</html>