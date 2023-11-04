<%--
  Created by IntelliJ IDEA.
  User: Seven
  Date: 2023/11/4
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>logResult</title>
</head>
<body>
<%@ page isELIgnored="false"%>
<jsp:useBean id="user" class="com.greenhub.Users" scope="page">
    <jsp:setProperty name="user" property="username"/>
</jsp:useBean>
欢迎你，<jsp:getProperty name="user" property="username"/><br>
<c:if test="${user.username eq 'admin'}">
    <a href="http://localhost">添加信息</a><br>
</c:if>
<a href="http://localhost">修改信息</a><br>
<a href="http://localhost">查看信息</a><br>

</body>
</html>
