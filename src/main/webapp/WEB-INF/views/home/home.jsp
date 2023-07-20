<%--
  Created by IntelliJ IDEA.
  User: cyfra
  Date: 10.07.2023
  Time: 00:39
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caloriapp</title>
</head>
<body>
<h1>Witaj w Caloriapp!</h1>
<sec:authorize access="isAuthenticated()"> <!-- wyswietlam, gdy user jest zalogowany -->
    <a href="/items"><h3>TWOJA KALORYCZNOSC</h3></a>
    <sec:authorize access="hasRole('ADMIN')"> <!-- wyswietlam, gdy user jest zalogowany i ma role admin'a-->
        <a href="/products"><p>[LISTA PRODUKTOW]</p></a>
    </sec:authorize>
<form action="<c:url value="/logout"/>" method="post">
    <input class="fa fa-id-badge" type="submit" value="Wyloguj">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
</sec:authorize>
<sec:authorize access="!isAuthenticated()"> <!-- wyswietlam, gdy nikt nie jest zalogowany -->
    MENU: <a href="/login">[ZALOGUJ]</a> <a href="/register">[ZAREJESTRUJ]</a>
</sec:authorize>
</body>
</html>
