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
    <p> Modifier Offer </p>
    <p> Welcome ${compteId}!! </p>
    <p>Veuillez saisir les informations que vous souhaitez modifier : </p>
	<form action= "modifierOfferSuccess" method="post">
        nom de service : <input type="text" name="nomService" value = "${offer.nomService}" /><br>
        type de service: <input type="text" name="typeService" value = "${offer.typeService}"/><br>
        nature de service : <input type="text" name="natureService" value = "${offer.natureService}"/><br>
        date valid offer: <input id="date" type="Date" name="dateValidOffert" value = "${offer.dateValidOffert}"><br>
        description : <input type="text" name="description" value = "${offer.description}"/><br>
        description detail: <input type="text" name="descriptionDetail" value = "${offer.descriptionDetail}"/><br>
        localisation de service :<input type="text" name="localisationService" value = "${offer.localisationService}" /><br>
        <input type="submit" value = "Submit modification"/><br>
    </form>
    </center>
</body>
</html>