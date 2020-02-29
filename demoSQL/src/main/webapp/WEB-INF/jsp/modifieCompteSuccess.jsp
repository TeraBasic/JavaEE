<html>
<head>
<meta charset="UTF-8">
<title>Demande Service</title>
</head>
<body>
<!-- barre de menu -->
	  # Nom : ${nom} #
	  -----# Prenom : ${prenom} #
	  <a href="${pageContext.request.contextPath}/index" class="btn btn-default">-----# index #</a>
	  <a href="${pageContext.request.contextPath}/home" class="btn btn-default">-----# Home #</a>
	  <a href="${pageContext.request.contextPath}/notification" class="btn btn-default">-----# Notification #</a>	
    <p> Modifie Compte Success</p>
    <h2>Compte INFO</h2>
	<div class="body_offer">
    <div class="container">
        
        <table border="1">
            <tr>
            	<td>User ID</td>
                <td>Nom</td>
                <td>Prénom</td>
                <td>Téléphone</td>
                <td>Adresse</td>
                <td>Pseudonyme</td>
                <td>Description</td>
                <td>Mot de passe</td>
                
            </tr>
            
		        <tr>
		         <td>${userCompte.userId}</td>
		         <td>${userCompte.nom}</td>
		         <td>${userCompte.prenom}</td>
		         <td>${userCompte.telephone}</td>
		         <td>${userCompte.adresse}</td>
		         <td>${userCompte.pseudonyme}</td>
		         <td>${userCompte.description}</td>
		         <td>${userCompte.password}</td>                
		    </tr>
           
        </table>
        
    </div>
</div>
	
	
</body>
</html>