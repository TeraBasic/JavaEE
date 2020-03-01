<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-image: none;">
<!-- barre de menu -->
<a href="${pageContext.request.contextPath}/index"># index #</a>
	  <a href="${pageContext.request.contextPath}/home">-----# Home #</a>
	  <a href="${pageContext.request.contextPath}/notification">-----# Notification #</a>	

<ul style="list-style-type:disc">
 <li>
  <a href="login" class="btn btn-default">Login</a>
 </li>
 <li>
  <a href="creerCompte" class="btn btn-default">Create compte</a>
 </li>
 
</ul>  

<h2>Offert</h2>
<div class="body_offer">
    <div class="container">
        <div class="alert alert-success text-center" role="alert"> Service proposition</div>
        <table class="table table-striped table-bordered">
            <tr>
                <td>Référence</td>
                <td>Type</td>
                <td>Nature</td>
                <td>Description courte</td>
            </tr>
            <c:forEach var="offer" items="${offerList}">
                <tr class="text-info">
                    <td>${offer.offerId}</td>
                    <td>${offer.typeService}</td>
                    <td>${offer.natureService}</td>
                    <td>${offer.description}</td>
                    <td>
                    	<a href="${pageContext.request.contextPath}/detailOffer/${offer.offerId}">detail</a>
                    </td>
                    
                    
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>