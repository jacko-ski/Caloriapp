<%--
  Created by IntelliJ IDEA.
  User: cyfra
  Date: 14.07.2023
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Caloriapp - Edit item</title>
</head>
<body>
<form:form modelAttribute="item" action="/items/edit">
    <form:hidden name="id" path="id"/>
    Data: <form:input type="date" name="date" path="date"/><br>
    Produkt: <form:select itemValue="id" itemLabel="name" path="product.id" items="${products}"/><br>
    Pora dnia: <form:select itemValue="index" itemLabel="name" items="${timeOfDays}" name="meal" path="meal"/><br>
    Ilosc: <form:input type="text" name="quantity" path="quantity"/> <form:errors path="quantity"/><br>
    Waga [g]: <form:input type="text" name="weight" path="weight"/> <form:errors path="weight"/><br>
    <form:hidden name="user" path="user"/>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
