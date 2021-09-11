<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
<h2><s:message code="user.login"/></h2>

<a href="change?lang=zh">中文</a>  <br>  <a href="change?lang=en">英文</a>
<form action="../user/login">
<s:message code="user.name"/><input type="text" value="${user.username}" name="username">${map.name} <br>
<s:message code="user.passwrod"/><input type="password"  name="password">${map.password} <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
