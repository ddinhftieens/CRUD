
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 7/16/2019
  Time: 10:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="index.jsp">add new customer</a>
<h1>Customer list</h1>
<table border="1" width="100%">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Pass</th>
        <th>Email</th>
        <th>Country</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
        <c:forEach items="${customerList}" var="i">
            <tr>
                <td><c:out value="${i.getID()}"/></td>
                <td><c:out value="${i.getName()}"/></td>
                <td><c:out value="${i.getPass()}"/></td>
                <td><c:out value="${i.getMail()}"/></td>
                <td><c:out value="${i.getCountry()}"/></td>
                <td><a href="/editcustomer?ID=${i.getID()}">edit</a></td>
                <td><a href="/deletecustomer?ID=${i.getID()}">delete</a></td>
            </tr>
        </c:forEach>
</table>
</body>
</html>
