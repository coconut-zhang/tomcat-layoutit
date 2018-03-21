<html>
<body>
<h2>Kount Test</h2>
<h5>session id</h5>
<%
    String sessionId = session.getId();
    out.print(sessionId);
%>

<%-- 
<iframe width=30 height=30 frameborder=0 scrolling=no src="http://localhost:8080/home/logoHtm.htm?m=171130&s=<%=sessionId%>"> 
    <img width=30 height=30 src="http://localhost:8080/home/logoGif.gif?m=171130&s=<%=sessionId%>">
</iframe>
--%>

<h5>this DC image, must provide to kount</h5>
<br />
<iframe width=20 height=20 frameborder=0 scrolling=no src="https://tst.kaptcha.com/logo.htm?m=171130&s=<%=sessionId%>"> 
    <img width=20 height=20 src="https://tst.kaptcha.com/logo.gif?m=171130&s=<%=sessionId%>">
</iframe>

<br />
<form action="servlet/KountRisCallServlet" method="post">
<table>
 <tr>
 <td>Card Number:</td>
 <td><input name="param1" type="text" length="100" /></td>
 </tr>
 <tr>
 <td></td>
 <td><input name="param2" type="text" /></td>
 </tr>
 <tr>
 <td colspans="2">
     <input type="submit" value="submit payment information to kount">
 </td>
 </tr>
</table>
    
</form>

<h5>ris reponse</h5>
<br />
<%=(session.getAttribute("Inquiry") != null ? session.getAttribute("Inquiry") : "ris reponse is empty, please click submit button") %>
<br />
<br />
<%=(session.getAttribute("Update") != null ? session.getAttribute("Update") : "ris reponse is empty, please click submit button") %>
<br />
</body>
</html>
