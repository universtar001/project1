<%@page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%-- <%....%>用于多条java片段  <%=....%>用于java表达式值--%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%--https://www.cnblogs.com/lyh233/p/14129543.html 把tomcat的tomcat.util.scan.StandardJarScanFilter.jarsToSkip=\ 改成了（*.jar）导致有些文件被跳过了，把它改回原来的配置即可
（换成 jar 速度会更快，但是有时候会莫名报错）--%>
<%--https://www.jianshu.com/p/c2e2a36923d2--%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>