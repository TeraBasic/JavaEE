<%@ page language="java" contentType="text/html" pageEncoding="GBK"%>
<html>
<head>
<title>logout</title>
</head>
<body>
<%
 response.setHeader("refresh","2;url=login.jsp");
 session.invalidate();
%>
<h3>Hello, you have already logged out of the system, and you are back to the homepage in two seconds</h3>
<h3>If there is no jump, click <a href="login.jsp">here</a>
</body>
</html>
