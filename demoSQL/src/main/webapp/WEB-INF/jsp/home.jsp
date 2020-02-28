
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Home</h1>
	<p>You have already successfully logged in or create compte<br/>
	
	
<h2>My Offer</h2>
<div class="body_offer">
    <div class="container">
        <div class="alert alert-success text-center" role="alert"> Service proposition</div>
        <table class="table table-striped table-bordered">
            <tr>
                <td>Référence</td>
                <td>Type</td>
                <td>Nature</td>
                <td>Description courte</td>
                <td>Etat</td>
                
            </tr>
            <c:forEach var="service" items="${offerList}">
                <tr class="text-info">
                    <td>${service.offerId}</td>
                    <td>${service.typeService}</td>
                    <td>${service.natureService}</td>
                    <td>${service.description}</td>
                    <td>${service.etatService}</td>
                    <td>
                    	<a href="${pageContext.request.contextPath}/detailMyOffer/${service.offerId}">detail</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

<h2>My Demande</h2>
<div class="body_offer">
    <div class="container">
        <div class="alert alert-success text-center" role="alert"> Service proposition</div>
        <table class="table table-striped table-bordered">
            <tr>
                <td>Référence</td>
                <td>Type</td>
                <td>Nature</td>
                <td>Description courte</td>
                <td>Etat</td>
            </tr>
            <c:forEach var="demand" items="${demandList}">
                <tr class="text-info">
                    <td>${demand.serviceDemandeId}</td>
                    <td>${demand.typeService}</td>
                    <td>${demand.natureService}</td>
                    <td>${demand.description}</td>
                    <td>${demand.etatService}</td>
                    <td>
                    	<a href="${pageContext.request.contextPath}/detailMyDemande/${demand.serviceDemandeId}">detail</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

	<a href="${pageContext.request.contextPath}/index">Index</a><br/></p>
	<a href="${pageContext.request.contextPath}/demande">Demande service</a><br/></p>
	<a href="${pageContext.request.contextPath}/offer">Offer service</a><br/></p>
	<a href="${pageContext.request.contextPath}/afficheCompteInfo">Compte Info</a><br/></p>
	
	</body>
</html>