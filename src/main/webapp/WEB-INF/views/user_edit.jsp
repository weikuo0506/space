<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wk
  Date: 2015/12/2
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" %>
<c:set var="BASE" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>Edit User</title>
</head>
<body>
<h1>Edit</h1>
<div id="global">
    <form action="${BASE}/user_update/${user.userId}" method="post">
        <fieldset>
            <legend>edit</legend>
            <p>
                <label for="username">username</label>
                <input type="text" id="username" name="username" value="${user.username}" tabindex="1">
            </p>
            <p>
                <label for="email">email</label>
                <input type="text" id="email" name="email" value="${user.email}" tabindex="1">
            </p>
            <p>
                <label for="password">password</label>
                <input type="text" id="password" name="password" value="${user.password}" tabindex="1">
            </p>

            <p id="buttons">
                <input id="reset" type="reset" tabindex="4">
                <input id="submit" type="submit" value="Add" tabindex="5">
            </p>
        </fieldset>
    </form>
</div>

</body>
</html>
