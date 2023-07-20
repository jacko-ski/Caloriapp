<%--
  Created by IntelliJ IDEA.
  User: cyfra
  Date: 14.07.2023
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Caloriapp - Products</title>
</head>
<body>
<table>
<thead>
<tr>
    <td>ID</td>
    <td>NAZWA</td>
    <td>WAGA [g]</td>
    <td>KCAL</td>
    <td></td>
    <td></td>
</tr>
</thead>
<tbody>
<c:forEach var="product" items="${products}">
    <tr>
        <td>${product.id}</td>
        <td>${product.name}</td>
        <td>${product.weight}</td>
        <td>${product.calorie}</td>
        <td><a href="/products/edit/${product.id}">[EDYTUJ]</a></td>
        <td><a href="/products/delete/${product.id}">[USUN]</a></td>
    </tr>
</c:forEach>
</tbody>
</table>
<br>
Menu: <a href="/">[HOME]</a> <a href="/products/add">[DODAJ]</a>
</body>
</html>
