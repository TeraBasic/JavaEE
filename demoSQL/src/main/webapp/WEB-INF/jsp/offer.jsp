<html>
<head>
<meta charset="UTF-8">
<title>Offer Service</title>
</head>
<body>
<!-- barre de menu -->
<a href="${pageContext.request.contextPath}/index"># index #</a>
	  <a href="${pageContext.request.contextPath}/home">-----# Home #</a>
	  <a href="${pageContext.request.contextPath}/notification">-----# Notification #</a>	
	<center>
	<font color="red">${errorMessage}</font>
    <p> Offer Service </p>

	<form action= "/offer/addOfferSuccesful" method="post">
        nom de service : <input type="text" name="nomService" /><br>
        type de service: <select name="typeService">
	         				 <option value ="service_offert">Service a offrir</option>
  			 				 <option value ="pret">Objet a preter</option>
  							 <option value="don">Objet a donner</option>
			 				 </select><br>
        nature de service : <select type="text" name="natureService" />
        						<option value ="tache">Taches menageres</option>
	  			 				 <option value ="courses">Faire des courses</option>
	  							 <option value="cours">Cours ponctuels</option>
        					</select><br>
        date valid offer: <input id="date" type="Date" name="dateValidOffert"><br>
        description : <input type="text" name="description" /><br>
        description detail: <input type="text" name="descriptionDetail" /><br>
        localisation de service :<input type="text" name="localisationService" /><br>
        <!-- etat du service : <input type="text" name="etatService" /><br> -->
        <input type="submit" value = "Submit offer"/><br>
    </form>
    </center>
</body>
</html>