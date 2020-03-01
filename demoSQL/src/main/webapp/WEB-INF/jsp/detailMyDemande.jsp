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
# Nom : ${user.nom} #
	  -----# Prenom : ${user.prenom} #
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
                <td>Etat</td>>
        </tr>
		<tr class="text-info">
	                    <td>${demande.serviceDemandeId}</td>
	                    <td>${demande.nomService}</td>
	                    <td>${demande.typeService}</td>
	                    <td>${demande.natureService}</td>
	                    <td>${user.pseudonyme}</td>
	                    <td>${demande.dateValidDemande}</td>
	                    <td>${demande.localisationService}</td>
	                    <td>${demande.description}</td>
	                    <td>${demande.descriptionDetail}</td>
	                    <td>${demande.etatService}</td>
	    </tr>
    </table>
    <a href="${pageContext.request.contextPath}/modifierMyDemande/${demande.serviceDemandeId}">Modifier</a><br/>
    </div>
</body>
</html>