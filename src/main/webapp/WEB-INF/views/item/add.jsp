<%--
  Created by IntelliJ IDEA.
  User: cyfra
  Date: 14.07.2023
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="pl">
<head>
    <title>Caloriapp - Add item</title>
</head>
<body>
<form:form modelAttribute="item">
    Data: <form:input type="date" name="date" path="date" /><br>
    Produkt: <form:select itemValue="id" itemLabel="name" path="product.id" items="${products}"/><br>
    Pora dnia: <form:select itemValue="index" itemLabel="name" items="${timeOfDays}" name="meal" path="meal"/><br>
    Ilosc: <form:input type="text" name="quantity" path="quantity"/> <form:errors path="quantity"/><br>
    Waga [g]: <form:input type="text" name="weight" path="weight"/> <form:errors path="weight"/><br>
    <form:hidden name="user" path="user"/> <%-- zeby sie nie dalo zmieniac user'a --%>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
