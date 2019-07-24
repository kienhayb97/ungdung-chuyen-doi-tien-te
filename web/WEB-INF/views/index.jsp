<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 2019-07-24
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Greeting</title>
</head>
<body>
<form method="get" action="/calculate">
    <label>USD: </label>
    <input type="text" name="usd" placeholder="usd">
    <label>RATE: </label>
    <input type="text" name="rate" placeholder="rate">
    <input type="submit" value="Convert">
</form>
</body>
</html>

