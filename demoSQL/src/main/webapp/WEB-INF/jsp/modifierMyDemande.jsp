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
	<form action= "modifierMyDemande/${demandeId}" method="post">
        nom de service : <input type="text" name="nomService" /><br>
        type de service: <input type="text" name="typeService" /><br>
        nature de service : <input type="text" name="natureService" /><br>
        date valid offer: <input id="date" type="Date" name="dateValidOffert"><br>
        description : <input type="text" name="description" /><br>
        description detail: <input type="text" name="descriptionDetail" /><br>
        localisation de service :<input type="text" name="localisationService" /><br>
        <!-- etat du service : <input type="text" name="etatService" /><br> -->
        <input type="submit" value = "Submit offer"/><br>
    </form>
    </center>
</body>
</html>