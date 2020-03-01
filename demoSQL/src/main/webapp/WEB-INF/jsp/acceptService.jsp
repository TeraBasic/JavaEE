<html>
<head>
<meta charset="UTF-8">
<title>Accept Service</title>
</head>
<body> 
<!-- barre de menu -->
	 
	  <a href="${pageContext.request.contextPath}/index" class="btn btn-default"># index #</a>
	  <a href="${pageContext.request.contextPath}/home" class="btn btn-default">-----# Home #</a>
	  <a href="${pageContext.request.contextPath}/notification" class="btn btn-default">-----# Notification #</a>	 
	<center>
    <h1> Accept Service </h1>
    <p> Welcome ${acceptCompte}!! </p>
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