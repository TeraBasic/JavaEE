<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p> Detail for service ${serviceId}</p>
	<div class="container">
	<table border="1">
		<tr>
                <td>Référence</td>
                <td>Nom</td>
                <td>Type</td>
                <td>Nature</td>
                <td>Utilisateur</td>
                <td>Date valid service</td>
                <td>Localisation service</td>
                <td>Description courte</td>
                <td>Description détail</td>
                <td>Etat</td>>
        </tr>
		<tr class="text-info">
	                    <td>${offer.offerId}</td>
	                    <td>${offer.nomService}</td> 
	                    <td>${offer.typeService}</td>
	                    <td>${offer.natureService}</td>
	                    <td>${offer.compteId}</td>
	                    <td>${offer.dateValidOffert}</td>
	                    <td>${offer.localisationService}</td>
	                    <td>${offer.description}</td>
	                    <td>${offer.descriptionDetail}</td>
	                    <td>${offer.etatService}</td>
	    </tr>
    </table>
     <a href="${pageContext.request.contextPath}/modifierMyOffer/${offer.offerId}">Modifier</a><br/>
    <a href="${pageContext.request.contextPath}/home">Home</a><br/>
    </div>
</body>
</html>