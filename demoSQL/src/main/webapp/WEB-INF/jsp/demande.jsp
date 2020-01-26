<html>
<head>
<meta charset="UTF-8">
<title>Demande Service</title>
</head>
<body>
	<center>
    <p> Demande Service </p>
    <p> Welcome ${id}!! </p>
	<form action= "demande/addDemande" method="post">
        nom de service : <input type="text" name="nomService" /><br>
        type de service: <input type="text" name="typeService" /><br>
        nature de service : <input type="text" name="natureService" /><br>
        data valid Demande: <input id="date" type="Date" name="dateValidDemande"><br>
        description : <input type="text" name="description" /><br>
        description detail: <input type="text" name="descriptionDetail" /><br>
        localisation de service :<input type="text" name="localisationService" /><br>
        etat du service : <input type="text" name="etatService" /><br>
        <input type="submit" value = "Submit demande"/><br>
    </form>
    </center>
</body>
</html>