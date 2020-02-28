<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- barre de menu -->
	  # Nom : ${nom} #
	  -----# Prenom : ${prenom} #
	  <a href="${pageContext.request.contextPath}/index">-----# index #</a>
	  <a href="${pageContext.request.contextPath}/home">-----# Home #</a>
	  <a href="${pageContext.request.contextPath}/notification">-----# Notification #</a>	
	<p> Detail for service ${serviceId}</p>
	<div class="container">
	<table border="1">
		<tr>
                <td>Référence</td>
                <td>Nom</td>
                <td>Type</td>
                <td>Nature</td>
                <td>Utilisateur pseudonyme</td>
                <td>Date valid service</td>
                <td>Localisation service</td>
                <td>Description courte</td>
                <td>Description détail</td>
                
        </tr>
		<tr class="text-info">
	                    <td>${offer.offerId}</td>
	                    <td>${offer.nomService}</td> 
	                    <td>${offer.typeService}</td>
	                    <td>${offer.natureService}</td>
	                    <td>${user.pseudonyme}</td>
	                    <td>${offer.dateValidOffert}</td>
	                    <td>${offer.localisationService}</td>
	                    <td>${offer.description}</td>
	                    <td>${offer.descriptionDetail}</td>
	    </tr>
    </table>
     <a href="${pageContext.request.contextPath}/acceptService/${offer.offerId}/${offer.compteId}">Accepter Service</a><br/>
    </div>
</body>
</html>