<html>

<head>
<title>Offer Service</title>
</head>

<body>
    <font color="red">${errorMessage}</font>
    <form method="post">
    	Type du service:
        <select name="typeService">
        	<option value="serviceOffrir">Service à offrir</option>
        	<option value="objetPreter">Objet à prêter</option>
        	<option value="objetDonner">Objet à donner</option>
        </select>
        <br> 
        Nature du service:
        <select name="natureService">
        	<option value="menages">tâches ménagères ou de bricolage</option>
        	<option value="courses">aider à faire des courses</option>
        	<option value="cours">donner des cours</option>
        </select>
        <br>
        Indiquez ici si la nature de votre service n'est pas dans la liste ci-dessus:
        <input type="text" name="otherService" />
        <br>
        La description courte du service (une phrase):
        <input type="text" name="desc" />
        <br>
        La description détaillée du service:
        <input type="text" name="descDetail" />
        <br>
        La localisation du service:<br>
        Département: <input type="text" name="departement" />
        Commune: <input type="text" name="commune" />
        Arrondissement/quartier: <input type="text" name="quartier" />
        <br>
        <input type="submit" />
    </form>
</body>

</html>