<html>
<head>
<meta charset="UTF-8">
<title>Offer Service</title>
</head>
<body>
<!-- barre de menu -->
	 
	  <a href="${pageContext.request.contextPath}/index" class="btn btn-default"># index #</a>
	  <a href="${pageContext.request.contextPath}/home" class="btn btn-default">-----# Home #</a>
	  <a href="${pageContext.request.contextPath}/notification" class="btn btn-default">-----# Notification #</a>	
	<center>
    <h1> Offer Service </h1>
	<p> Welcome ${proposeCompte}!! </p>
	
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