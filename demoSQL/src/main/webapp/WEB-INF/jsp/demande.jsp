<html>
<head>
<meta charset="UTF-8">
<title>Demande Service</title>
</head>
<body>
	<div align='center'>
	    <p> Demande Service </p>
	    <p> Welcome ${id}!! </p>
		<form action= "demande/addDemandeSuccess" method="post">
	        nom de service : <input type="text" name="nomService" required /><br>
	        type de service: <select name="typeService">
	         				 <option value ="service_demande">Service demande</option>
  			 				 <option value ="louer">Objet a louer</option>
  							 <option value="obtenir">Objet a obtenir</option>
			 				 </select><br>
	        nature de service : <input type="text" name="natureService" /><br>
	        data valid Demande: <input id="date" type="Date" name="dateValidDemande"><br>
	        description : <input type="text" name="description" /><br>
	        description detail: <input type="text" name="descriptionDetail" /><br>
	        localisation de service :<input type="text" name="localisationService" /><br>
	        <input type="submit" value = "Submit demande"/><br>
	    </form>
    </div>
</body>
</html>