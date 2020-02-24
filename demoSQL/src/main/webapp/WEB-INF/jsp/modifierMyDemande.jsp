<html>
<head>
<meta charset="UTF-8">
<title>Offer Service</title>
</head>
<body>
	<center>
	<font color="red">${errorMessage}</font>
    <p> Modifier Demande </p>
    <p> Welcome ${id}!! </p>
	<form action= "modifierDemandeSuccess" method="post">
		Demande ID : <input type="text" name="serviceDemandeId" value = "${demande.serviceDemandeId}" /><br>
		Compte ID : <input type="text" name="compteId" value = "${demande.compteId}" /><br>
        nom de service : <input type="text" name="nomService" value = "${demande.nomService}" /><br>
        type de service: <input type="text" name="typeService" value = "${demande.typeService}"/><br>
        nature de service : <input type="text" name="natureService" value = "${demande.natureService}"/><br>
        date valid offer: <input id="date" type="Date" name="dateValidDemande" value = "${demande.dateValidDemande}"><br>
        description : <input type="text" name="description" value = "${demande.description}"/><br>
        description detail: <input type="text" name="descriptionDetail" value = "${demande.descriptionDetail}"/><br>
        localisation de service :<input type="text" name="localisationService" value = "${demande.localisationService}" /><br>
        Etat :<input type="text" name="etatService" value = "${demande.etatService}" /><br>
        
        <!-- etat du service : <input type="text" name="etatService" /><br> -->
        <input type="submit" value = "Submit offer"/><br>
    </form>
    </center>
</body>
</html>