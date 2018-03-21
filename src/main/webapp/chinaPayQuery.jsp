<%@ page import="com.ariix.myTest.ChinaPayUtil" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>chian pay sign query</title>
</head>
<body>

<%
    ChinaPayUtil cpu = new ChinaPayUtil();
    String cardTranData = cpu.getCardTranData();
    String sign = cpu.getSignature();
    out.println(cardTranData);
    out.println(sign);
%>
<form id="chinapay-form" action="http://newpayment-test.chinapay.com/CTITS/service/rest/forward/syn/000000000017/0/0/0/0/0" METHOD="POST">
	<input type=hidden name="Version" id="Version"  value="20150922">
	<input type=hidden name="MerId" id="MerId" value="000001707191527" >
	<input type=hidden name="TranType" id="TranType"  value="0504">
	<input type=hidden name="OriTranType" id="OriTranType"  value="9901">
	<input type=hidden name="BusiType" id="BusiType"  value="0001">
	<input type=hidden name="CardTranData" id="CardTranData"  value="<%=cardTranData%>">
	<input type=hidden name="Signature" id="Signature"  value="<%=sign%>">
	<input type="submit" value="sign query">
</form>
</body>
</html>