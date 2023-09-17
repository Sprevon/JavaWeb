<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Seven
  Date: 2023/9/17
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 >Beer Recommendations JSP</h1>
<%
    List<String> styles = (List<String>) request.getAttribute("style");
    String color = (String) request.getAttribute("color");
    out.println("got beer color " + color + "<br>");
    out.println("try: " + "<br>");

    for (String s : styles){
        out.println(s + "<br>");
    }
    %>


    </body>
</html>
