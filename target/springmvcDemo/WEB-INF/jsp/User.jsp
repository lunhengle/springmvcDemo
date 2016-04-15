<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/4/12
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
    <title>用户页面</title>
</head>
<body>
userid=<c:out value="${user.id}"/>
name=<c:out value="${user.name}"/>
password=<c:out value="${user.password}"/>
message=<c:out value="${message}"/>
</body>
</html>