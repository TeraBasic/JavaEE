<html>
<head>
<meta charset="UTF-8">
<title>Accept Service</title>
</head>
<body>
	<center>
    <p> Accept Service </p>
    <p> Welcome ${id}!! </p>
	<form action= "acceptService" method="post">
        Offer ID : <input type="text" name="offerId" value = "${offerId}"><br>
        Offer Compte: <input type="text" name="compteId" value = "${compteId}"><br>
        Accept Person Compte : <input type="text" name="acceptCompte" value = "${acceptCompte}"><br>
        Message : <input id="date" type="text" name="message"><br>
        <input type="submit" value = "Submit acception"/><br>
    </form>
    </center>
</body>
</html>