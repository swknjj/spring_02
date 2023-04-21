<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-21
  Time: 오전 9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="hello-param1?age=27&name=이신욱">함수호출</a>
<button onclick="param1()">파라미터 전송</button>
</body>
<script>
    const param1 = () => {
        // location.href = "/hello-param1?age=27&name=이신욱"
        const age = "27";
        const name = "이신욱";
        location.href = "/hello-param1?age="+age+"&name="+name;
    }
</script>
</html>
