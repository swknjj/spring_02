<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-21
  Time: 오전 8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button onclick="fun1()">hello1.jsp 출력</button>>
<button onclick="fun2()">hello2.jsp 출력</button>

<a href="/hello3">hello3</a>
<a href="/hello4">hello4</a>
<a href="/hello5">hello5</a>
</body>
<script>
    const fun1 = () => {
        location.href = "/hello1";
    }
    const fun2 = () => {
        location.href = "/hello2";
    }
</script>
</html>
