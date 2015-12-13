<%--
  Created by IntelliJ IDEA.
  User: wk
  Date: 2015/11/25
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="BASE" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>all users</title>
</head>
<body>

<h1>客户列表</h1>

<table>
    <tr>
        <th>客户名称</th>
        <th>邮箱地址</th>
        <th>操作</th>
    </tr>
    <c:forEach var="user" items ="${users}">
        <tr>
            <td>${user.username}</td>
            <td>${user.email}</td>
            <td>
                <a href="${BASE}/user_edit/${user.userId}">edit</a>
                <a href="${BASE}/user_delete?userId=${user.userId}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
