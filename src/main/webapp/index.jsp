<html>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/activemq/queueSend" method="get">
    <input type="text" name="message"/>
    <input type="submit" value="send">
</form>
</body>
</html>
