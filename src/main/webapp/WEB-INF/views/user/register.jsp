<%--
  Created by IntelliJ IDEA.
  User: cyfra
  Date: 10.07.2023
  Time: 00:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Caloriapp - Register</title>
</head>
<body>
<h1>Zarejestruj sie</h1>
<form:form modelAttribute="user">
    Login: <form:input type="text" name="username" path="username"/> <form:errors path="username"/><br>
    Password: <form:input type="password" name="password" path="password"/> <form:errors path="password"/><br>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
