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
    <title>Caloriapp - Edit product</title>
</head>
<body>
<form:form modelAttribute="product" action="/products/edit">
    <form:hidden name="id" path="id"/>
    Nazwa: <form:input type="text" name="name" path="name"/> <form:errors path="name"/><br>
    Waga [g]: <form:input type="text" name="weight" path="weight"/> <form:errors path="weight"/><br>
    KCAL: <form:input type="text" name="calorie" path="calorie"/> <form:errors path="calorie"/><br>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
