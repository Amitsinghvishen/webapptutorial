<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2/2/2019
  Time: 9:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Welcome Please login</h1>
<form action="/login" method="post">
    <input type="text" placeholder="Name" name="loginname"/>
    <input type="password" name="password" />
    <input type="submit" value="Login" />
</form>
<h2 style="color: red">${Errormessage}</h2>
</body>
</html>
