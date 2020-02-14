<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Home</h1>
	<p>You have already successfully logged in or create compte<br/>
	<a href="${pageContext.request.contextPath}/index">Index</a><br/></p>
	<a href="${pageContext.request.contextPath}/demande">Demande service</a><br/></p>
	<a href="${pageContext.request.contextPath}/offer">Offer service</a><br/></p>
	<a href="${pageContext.request.contextPath}/afficheCompteInfo">Compte Info</a><br/></p>
	<a href="LogoutServlet">Logout</a><br/></p>
	</body>
</html>