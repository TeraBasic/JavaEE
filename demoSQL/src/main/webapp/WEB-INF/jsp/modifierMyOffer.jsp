<html>
<head>
<meta charset="UTF-8">
<title>Offer Service</title>
</head>
<body>
	<center>
	<font color="red">${errorMessage}</font>
    <p> Modifier Offer </p>
    <p> Welcome ${id}!! </p>
	<form action= "modifierOfferSuccess" method="post">
        Offer ID : <input type="text" name="offerId" value = "${offer.offerId}" /><br>
		Compte ID : <input type="text" name="compteId" value = "${offer.compteId}" /><br>
        nom de service : <input type="text" name="nomService" value = "${offer.nomService}" /><br>
        type de service: <input type="text" name="typeService" value = "${offer.typeService}"/><br>
        nature de service : <input type="text" name="natureService" value = "${offer.natureService}"/><br>
        date valid offer: <input id="date" type="Date" name="dateValidOffert" value = "${offer.dateValidOffert}"><br>
        description : <input type="text" name="description" value = "${offer.description}"/><br>
        description detail: <input type="text" name="descriptionDetail" value = "${offer.descriptionDetail}"/><br>
        localisation de service :<input type="text" name="localisationService" value = "${offer.localisationService}" /><br>
        Etat :<input type="text" name="etatService" value = "${offer.etatService}" /><br>
        <!-- etat du service : <input type="text" name="etatService" /><br> -->
        <input type="submit" value = "Submit offer"/><br>
    </form>
    </center>
</body>
</html>