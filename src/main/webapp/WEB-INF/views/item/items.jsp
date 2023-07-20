<%--
  Created by IntelliJ IDEA.
  User: cyfra
  Date: 14.07.2023
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>Caloriapp - Items</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>ID</td>
        <td>DATA</td>
        <td>PRODUKT</td>
        <td>PORA DNIA</td>
        <td>ILOSC</td>
        <td>WAGA [g]</td>
        <td>KCAL</td>
        <td></td>
        <td></td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${items}">
        <tr>
            <td>${item.id}</td>
            <td>${item.date}</td>
            <td>${item.product.name}</td>
            <td>${timeOfDays.get(item.meal).name}</td>
            <td>${item.quantity}</td>
            <td>${item.weight}</td>
            <td>${item.calorie}</td>
            <td><a href="/items/edit/${item.id}">[EDYTUJ]</a></td>
            <td><a href="/items/delete/${item.id}">[USUN]</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>
Menu: <a href="/">[HOME]</a> <a href="/items/add">[DODAJ]</a>
</body>
</html>
