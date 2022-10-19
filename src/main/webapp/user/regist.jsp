<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/10/13
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%-- <%....%>用于多条java片段  <%=....%>用于java表达式值--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//w3C//DTD HTML4.01 Transitions1//EN">
<html>
<head>
  <title>Title</title>
</head>
<body>
<h1><strong>注册</strong></h1>
<%--${pageContext.request.contextPath}/RegistServlet 获取绝对路径--%>
<%--request.contextPath 获取项目名--%>
<form action="<c:url value="/RegistServlet"/>" method="post">
  用户名：<input type="text" value="username">
  <%--    --%>

  密码：  <input type="password" value="password">
  <input type="submit" value="注册">
</form>
</body>
</html>