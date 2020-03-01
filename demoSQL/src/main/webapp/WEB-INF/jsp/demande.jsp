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
		<font color="red">${errorMessage}</font>
	    <p> Demande Service </p>

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