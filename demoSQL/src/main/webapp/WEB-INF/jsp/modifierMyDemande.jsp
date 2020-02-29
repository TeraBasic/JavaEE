<html>
<head>
<meta charset="UTF-8">
<title>Offer Service</title>
</head>
<body>
<!-- barre de menu -->
	  # Nom : ${nom} #
	  -----# Prenom : ${prenom} #
	  <a href="${pageContext.request.contextPath}/index">-----# index #</a>
	  <a href="${pageContext.request.contextPath}/home">-----# Home #</a>
	  <a href="${pageContext.request.contextPath}/notification">-----# Notification #</a>	
	<center>
	<font color="red">${errorMessage}</font>
    <p> Modifier Demande </p>
    <p> Welcome ${compteId}!! </p>
    <p>Veuillez saisir les informations que vous souhaitez modifier : </p>
	<form action= "modifierDemandeSuccess" method="post">
		Id Demande: <input type="text" name="serviceDemandeId" value = "${demande.serviceDemandeId}" /><br>
		Compte utilisateur: <input type="text" name="compteId" value = "${demande.compteId}" /><br>
        nom de service : <input type="text" name="nomService" value = "${demande.nomService}" /><br>
        type de service: <input type="text" name="typeService" value = "${demande.typeService}"/><br>
        nature de service : <input type="text" name="natureService" value = "${demande.natureService}"/><br>
        date valid demande: <input id="date" type="Date" name="dateValidDemande" value = "${demande.dateValidDemande}"><br>
        description : <input type="text" name="description" value = "${demande.description}"/><br>
        description detail: <input type="text" name="descriptionDetail" value = "${demande.descriptionDetail}"/><br>
        localisation de service :<input type="text" name="localisationService" value = "${demande.localisationService}" /><br>
        Etat demande : <input type="text" name="etatService" value = "${demande.etatService}" /><br>
        <input type="submit" value = "Submit modification"/><br>
    </form>
    </center>
</body>
</html>