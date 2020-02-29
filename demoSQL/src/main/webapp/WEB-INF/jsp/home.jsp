
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
<!-- barre de menu -->
	 
	  <a href="${pageContext.request.contextPath}/index" class="btn btn-default">-----# Index #</a>
	  <a href="${pageContext.request.contextPath}/notification" class="btn btn-default">-----# Notification #</a>
	  <a href="logout">-----# Logout #</a><br/></p>	
	<h1>Home</h1>
	<p>You have already successfully logged in or create compte</p> 
	
<h2>My Offer</h2>
<div class="body_offer">
    <div class="container">
        <div class="alert alert-success text-center" role="alert"> Services proposes</div>
        <table border="1">
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
                    <td>
                    	<a href="javascript:void(0)" onclick="delete_offer(${service.offerId})">supprimer</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

<h2>My Demande</h2>
<div class="body_offer">
    <div class="container">
        <div class="alert alert-success text-center" role="alert"> Services demandes</div>
        <table border="1">
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
                    <td>
                    	<a href="javascript:void(0)" onclick="delete_demande(${demand.serviceDemandeId})">supprimer</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

	<a href="${pageContext.request.contextPath}/demande">Demande service</a><br/></p>
	<a href="${pageContext.request.contextPath}/offer">Offer service</a><br/></p>
	<a href="${pageContext.request.contextPath}/afficheCompteInfo">Compte Info</a><br/></p>
	
	</body>
<script>
	function delete_demande(service_id){
		var r = confirm("Voulez vous vraiment supprimer ?");
		if (r == true) {
			window.location.href="${pageContext.request.contextPath}/supprimeDemande/"+service_id;
		}
	}
	function delete_offer(service_id){
		var r = confirm("Voulez vous vraiment supprimer ?");
		if (r == true) {
			window.location.href="${pageContext.request.contextPath}/supprimeOffer/"+service_id;
		}
	}
</script>	
</html>