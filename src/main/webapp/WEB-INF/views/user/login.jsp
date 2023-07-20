<%--
  Created by IntelliJ IDEA.
  User: cyfra
  Date: 10.07.2023
  Time: 00:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caloriapp - Login</title>
</head>
<body>
<h1>Zaloguj sie</h1>
<form method="post">
    <div><label> Login: <input type="text" name="username"/> </label></div>
    <div><label> Password: <input type="password" name="password"/> </label></div>
    <div><input type="submit" value="Sign In"/></div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
</body>
</html>
