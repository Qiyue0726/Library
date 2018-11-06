<%--
  Created by IntelliJ IDEA.
  User: Sakura
  Date: 2018/10/27 0027
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>添加新图书</title>
</head>
<body>
    <div align="center">
        <s:form method="POST" action="addBook">
            <s:textfield name="bookName" label="书名"></s:textfield>
            <s:textfield name="author" label="作者"></s:textfield>
            <s:textfield name="publishingCompany" label="出版社"></s:textfield>
            <s:textfield name="isbn" label="ISBN"></s:textfield>
            <s:textfield name="price" label="价格"></s:textfield>


             <s:submit value="添加图书"></s:submit>

        </s:form>
    </div>

</body>
</html>
