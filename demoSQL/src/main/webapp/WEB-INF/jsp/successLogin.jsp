<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome page</h1>
	<p>You have successfully logged in or create compte<br/>
	<a href="${pageContext.request.contextPath}/">Home page</a><br/></p>
	<a href="${pageContext.request.contextPath}/demande">Demande service</a><br/></p>
	<a href="${pageContext.request.contextPath}/offer">Offer service</a><br/></p>
	</body>
</html>