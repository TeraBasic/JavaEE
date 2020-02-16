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
.btn btn-default{
	float:right;	

})
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-image: none;">

<ul style="list-style-type:disc">
 <li>
  <a href="login" class="btn btn-default"># Login #</a>
  <a href="creerCompte" class="btn btn-default">-----# Create compte#</a>
  <a href="home" class="btn btn-default">-----# Home #</a>
  <a href="rechercheDemande" class="btn btn-default">-----# Recherche Demande #</a>
  <a href="rechercheOffer" class="btn btn-default">-----# Recherche Offer #</a>
 </li>
</ul>  


<h2>Offer</h2>
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
            <c:forEach var="service" items="${serviceProList}">
                <tr class="text-info">
                    <td>${service.offerId}</td>
                    <td>${service.typeService}</td>
                    <td>${service.natureService}</td>
                    <td>${service.description}</td>
                    <td>
                    	<a href="${pageContext.request.contextPath}/detailOffer/${service.offerId}">detail</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

<h2>Demande</h2>
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
            <c:forEach var="demand" items="${demandProList}">
                <tr class="text-info">
                    <td>${demand.serviceDemandeId}</td>
                    <td>${demand.typeService}</td>
                    <td>${demand.natureService}</td>
                    <td>${demand.description}</td>
                    <td>
                    	<a href="${pageContext.request.contextPath}/detailDemande/${demand.serviceDemandeId}">detail</a>
                    </td>
                    
                    
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>