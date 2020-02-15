<html>
<head>
<meta charset="UTF-8">
<title>Demande Service</title>
</head>
<body>
	<div align='center'>
	    <p> Recherche Service Offert</p>
	    <p> Welcome ${id}!! </p>
		<form action= "infoDeRechercheOffer" method="post">
			Id de service <input type="number" name="idOffert" min="1" /><br>
	        Type de service: <select name="typeService">
	        				 <option value ="">choissez un type de service</option>
	         				 <option value ="service_demande">Service demande</option>
  			 				 <option value ="louer">Objet a louer</option>
  							 <option value="obtenir">Objet a obtenir</option>
			 				 </select><br>
			 Nature de service : <input type="text" name="natureService" /><br>
			 Compte utilisateur:  <input type="text" name="compteId" /><br>
			 Localisation de service: <input type="text" name="localisationService" /><br>
			 Description de service: <input type="text" name="description" /><br>
			 Description détail de service: <input type="text" name="descriptionDetail" /><br>
			 Date valide de service: <input type="Date" name="dateValidOffert" /><br>
			 
	        <input type="submit" value = "Recherche"/><br>
	    </form>
    </div>
</body>
</html>