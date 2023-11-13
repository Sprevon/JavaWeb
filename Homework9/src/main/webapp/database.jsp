<%--
  Created by IntelliJ IDEA.
  User: Seven
  Date: 2023/11/13
  Time: 8:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page isELIgnored="false"%>
<%--    <sql:setDataSource dataSource="datasource" var="db"/>--%>
    <sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
                       url="jdbc:mysql://127.0.0.1:3306/contract_manage_system?user=root"
                       user="root"
                       password="SevenUv7"/>

    <sql:query var="result" sql="SELECT * FROM cms_contract" dataSource="${db}"/>
    <table>
        <tr>
            <td>合同单号</td>
            <td>供货单位编号</td>
        </tr>
        <c:forEach var="row" items="${result.rows}">
            <tr>
                <td>
                    ${row.contract_id}
                </td>
                <td>
                    ${row.supply_org_id}
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
