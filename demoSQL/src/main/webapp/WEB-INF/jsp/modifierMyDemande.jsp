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
        nom de service : <input type="text" name="nomService" value = "${demande.nomService}" /><br>
        type de service: <input type="text" name="typeService" value = "${demande.typeService}"/><br>
        nature de service : <input type="text" name="natureService" value = "${demande.natureService}"/><br>
        date valid offer: <input id="date" type="Date" name="dateValidDemande" value = "${demande.dateValidDemande}"><br>
        description : <input type="text" name="description" value = "${demande.description}"/><br>
        description detail: <input type="text" name="descriptionDetail" value = "${demande.descriptionDetail}"/><br>
        localisation de service :<input type="text" name="localisationService" value = "${demande.localisationService}" /><br>
        <input type="submit" value = "Submit modification"/><br>
    </form>
    </center>
</body>
</html>