<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-21
  Time: 오전 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/">index.jsp로 돌아가기</a>
<form action="/form-param1" method="get">
    <input type="text" name="p1"><br>
    <input type="text" name="p2"><br>
    <input type="submit" value="전송"><br>
</form>

<form action="/form-param2" method="post">
    <input type="text" name="p3"><br>
    <input type="text" name="p4"><br>
    <input type="submit" value="전송"><br>
</form>
</body>
</html>
