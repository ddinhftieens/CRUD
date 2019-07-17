<%@ page import="java.util.List" %>
<%@ page import="model.customer" %><%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 7/16/2019
  Time: 9:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%
        customer cs = (customer) request.getAttribute("customer");
    %>
</head>
<body>
<form action="/updatecustomer?ID=<%=cs.getID()%>" method="post">
    <table>
        <tr>
            <td><label><b>ID:</b></label></td>
            <td><input type="text" value="<%=cs.getID()%>" disabled></td>
        </tr>
        <tr>
            <td>Name: </td>
            <td><input type="text" name="username" value="<%=cs.getName()%>"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="password" value="<%=cs.getPass()%>"></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="email" name="email" value="<%=cs.getMail()%>"></td>
        </tr>
        <tr>
            <td>Country:</td>
            <td>
                <select name="country" style="width:150px">
                    <option>India</option>
                    <option>USA</option>
                    <option>UK</option>
                    <option>Other</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Edit&Save"/></td>
        </tr>
    </table>
</form>
</body>
</html>
