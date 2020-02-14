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
                <td>Type</td>
                <td>Nature</td>
                <td>Utilisateur</td>
                <td>Date valid service</td>
                <td>Localisation service</td>
                <td>Description courte</td>
                <td>Description détail</td>
        </tr>
		<tr class="text-info">
	                    <td>${demande.serviceDemandeId}</td>
	                    <td>${demande.typeService}</td>
	                    <td>${demande.natureService}</td>
	                    <td>${demande.compteId}</td>
	                    <td>${demande.dateValidDemande}</td>
	                    <td>${demande.localisationService}</td>
	                    <td>${demande.descriptionDetail}</td>
	                    <td>${demande.localisationService}</td>
	    </tr>
    </table>
    <a href="${pageContext.request.contextPath}/proposeService/${demande.serviceDemandeId}/${demande.compteId}">Proposer Service</a><br/>
    <a href="${pageContext.request.contextPath}/index">Index</a><br/>
    </div>
</body>
</html>