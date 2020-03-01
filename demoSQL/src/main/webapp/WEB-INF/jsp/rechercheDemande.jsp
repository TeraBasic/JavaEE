<html>
<head>
<meta charset="UTF-8">
<title>Demande Service</title>
</head>
<body>
<!-- barre de menu -->
<a href="${pageContext.request.contextPath}/index"># index #</a>
	  <a href="${pageContext.request.contextPath}/home">-----# Home #</a>
	  <a href="${pageContext.request.contextPath}/notification">-----# Notification #</a>	
	<div align='center'>
	    <p> Recherche Service demande </p>
	    <p> Welcome ${compteId}!! </p>
		<form action= "infoDeRechercheDemande" method="post">
			Id de service <input type="number" name="idDemande" min="1" /><br>
	        Type de service: <select name="typeService">
	        				 <option value ="">choissez un type de service</option>
	         				 <option value ="service_demande">Service demande</option>
  			 				 <option value ="louer">Objet a louer</option>
  							 <option value="obtenir">Objet a obtenir</option>
			 				 </select><br>
			 Nature de service : <input type="text" name="natureService" /><br>
			 Pseudonyme utilisateur:  <input type="text" name="compteId" /><br>
			 Localisation de service: <input type="text" name="localisationService" /><br>
			 Description de service: <input type="text" name="description" /><br>
			 Description détail de service: <input type="text" name="descriptionDetail" /><br>
			 Date valide de service: <input type="Date" name="dateValidDemande" /><br>
			 
	        <input type="submit" value = "Recherche"/><br>
	    </form>
    </div>
</body>
</html>