<html>
<head>
<meta charset="UTF-8">
<title>Offer Service</title>
</head>
<body>
	<center>
    <p> Offer Service </p>
    <p> Welcome ${compteId}!! </p>
	<form action= "proposeService" method="post">
        Demande ID : <input type="text" name="serviceDemandeId" value = "${serviceId}"><br>
        Demand Compte: <input type="text" name="demandeCompte" value = "${demandeCompte}"><br>
        Propose Compte : <input type="text" name="proposeCompte" value = "${proposeCompte}"><br>
        Message : <input id="date" type="text" name="message"><br>
        <input type="submit" value = "Submit Proposition"/><br>
    </form>
    </center>
</body>
</html>