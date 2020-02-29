<html>
<head>
<meta charset="UTF-8">
<title>Demande Service</title>
</head>
<body>
<!-- barre de menu -->
	  # Nom : ${nom} #
	  -----# Prenom : ${prenom} #
	  <a href="index" class="btn btn-default">-----# index #</a>
	  <a href="home" class="btn btn-default">-----# Home #</a>
	  <a href="notification" class="btn btn-default">-----# Notification #</a>	
	  
	<div align='center'>
		<font color="red">${errorMessage}</font>
	    <p> Demande Service </p>
	    <p> Welcome ${compteId}!! </p>
		<form action= "/demande/addDemandeSuccess" method="post">
	        nom de service : <input type="text" name="nomService"><br>
	        type de service: <select name="typeService">
	         				 <option value ="service_demande">Service demande</option>
  			 				 <option value ="louer">Objet a louer</option>
  							 <option value="obtenir">Objet a obtenir</option>
			 				 </select><br>
	        nature de service : <select type="text" name="natureService" />
        						<option value ="tache">Taches menageres</option>
	  			 				 <option value ="courses">Faire des courses</option>
	  							 <option value="cours">Cours ponctuels</option>
        					</select><br>
	        data valid Demande: <input id="date" type="Date" name="dateValidDemande"><br>
	        description : <input type="text" name="description" /><br>
	        description detail: <input type="text" name="descriptionDetail" /><br>
	        localisation de service :<input type="text" name="localisationService" /><br>
	        <input type="submit" value = "Submit demande"/><br>
	    </form>
    </div>
</body>
</html>