<%--
  Created by IntelliJ IDEA.
  User: Sakura
  Date: 2018/10/26 0026
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>所有图书</title>
</head>
<body>
    <div align="center" height="1000px">

            <table>
                <tr>
                    <th width="100px">书名</th>
                    <th width="100px">作者</th>
                    <th width="100px">出版社</th>
                    <th width="100px">ISBN</th>
                    <th width="100px">价格</th>
                    <th width="100px">操作</th>
                </tr>
                <s:iterator var="Book" value="Books">
                <form action="bookDelete" method="post">
                    <tr>
                        <td align="center"><s:property value="#Book.bookName"></s:property> </td>
                        <td align="center"><s:property value="#Book.author"></s:property> </td>
                        <td align="center"><s:property value="#Book.publishingCompany"></s:property> </td>
                        <td align="center"><s:property value="#Book.isbn"></s:property></td>
                        <td align="center"><s:property value="#Book.price"></s:property> </td>
                        <td align="center">
                            <input type="hidden" name="id" value="<s:property value='#Book.id'/>">
                            <button id="delete_book" onclick="Delete()">删除</button>
                        </td>
                    </tr>
                </form>
                </s:iterator>
            </table>
    </div>


        <form action="toAdd" method="post">
            <p align="center">
                <button id="add_book" onclick="AddBook()">添加新图书</button>
            </p>
        </form>

</body>
<script type="text/javascript">
    function Delete() {
        var result = confirm("确认删除该图书？")
        if(result == true)
        {
            //设置标签属性
            document.getElementById("delete_book").setAttribute("type","submit");

        }else
            document.getElementById("delete_book").setAttribute("type","button");
    }

    function AddBook() {
        var result = confirm("是否添加新图书")
        if(result == true)
        {
            //设置标签属性
            document.getElementById("add_book").setAttribute("type","submit");

        }else
            document.getElementById("add_book").setAttribute("type","button");
    }

</script>
</html>
