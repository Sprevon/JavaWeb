<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<jsp:useBean id="user" class="com.greenhub.Users" scope="page">
    <jsp:setProperty name="user" property="username" param="username"/>
</jsp:useBean>

<form action="index.jsp">
    <label>
        My name is duck. What is yours?<br>
        <input type="text" name="username">
    </label>
    <input type="submit" value="提交">
    <input type="reset" value="重置">
</form>

<h1>Hello,
    ${user.username}
    !</h1>
<br>
<a href="login.jsp">第二题</a>
</body>
</html>
