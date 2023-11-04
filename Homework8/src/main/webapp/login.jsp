<%--
  Created by IntelliJ IDEA.
  User: Seven
  Date: 2023/11/4
  Time: 19:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<jsp:useBean id="user" class="com.greenhub.Users" scope="page">

</jsp:useBean>
<form action="logResult.jsp">
<table>
    <tr>
        <td>用户名</td>
        <td><label>
            <input type="text" name="username">
        </label></td>
    </tr>
    <tr>
        <td>密码</td>
        <td><label>
            <input type="password" name="password">
        </label>
        </td>
    </tr>
    <tr>
        <td><input type="submit" value="提交"></td>
        <td><input type="reset" value="重置"></td>
    </tr>
</table>
</form>
</body>
</html>
