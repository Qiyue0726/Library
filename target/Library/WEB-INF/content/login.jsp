<%--
  Created by IntelliJ IDEA.
  User: Sakura
  Date: 2018/10/26 0026
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录</title>
</head>
<body>
    <div align="center" width="800px" height="500px" >
        <form method="post" action="login">
            用户名：<input type="text" name="name" placeholder="sakura">
            <br/>
            密码：<input type="password" name="password" placeholder="333">
            <br/>
            <button type="reset" value="重置">重置</button>
            <button type="submit" value="登录">登录</button>
        </form>
    </div>
</body>
</html>
