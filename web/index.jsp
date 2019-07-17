<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 7/16/2019
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Add new customer</h1>
  <form action="/savecustomer" method="post">
    <table>
      <tr>
        <td>Name: </td>
        <td><input type="text" name="username" required></td>
      </tr>
      <tr>
        <td>Password:</td>
        <td><input type="password" name="password" required></td>
      </tr>
      <tr>
        <td>Email:</td>
        <td><input type="email" name="email" required></td>
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
        <td colspan="2"><input type="submit" value="Save Employee"/></td>
      </tr>
    </table>
    <br>
    <a href="/viewallcustomer">view all customer</a>
  </form>
  </body>
</html>
