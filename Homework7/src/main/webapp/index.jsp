<%--
  Created by IntelliJ IDEA.
  User: Seven
  Date: 2023/11/4
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<jsp:useBean id="user" class="com.tinklebi.www.Users" scope="application">
    <jsp:setProperty name="user" property="name" value="王五"/>
    <jsp:setProperty name="user" property="age" value="20"/>
    <jsp:setProperty name="user" property="address" value="中国"/>
</jsp:useBean>
用户信息：用户：<jsp:getProperty name="user" property="name"/>；
年龄：<jsp:getProperty name="user" property="age"/>；来自于<jsp:getProperty name="user" property="address"/>
<br>
用户年龄：<jsp:getProperty name="user" property="age"/>，用户姓名：<jsp:getProperty name="user" property="name"/>
</body>
</html>