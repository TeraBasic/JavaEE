<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- barre de menu -->
	  # Nom : ${nom} #
	  -----# Prenom : ${prenom} #
	  <a href="index" class="btn btn-default">-----# index #</a>
	  <a href="home" class="btn btn-default">-----# Home #</a>
	  <a href="notification" class="btn btn-default">-----# Notification #</a>	
	<font color="red">${errorMessage}</font>
	<h2>Modifier les informations de compte</h2>
	
	<p> Les informations non modifiables </p>
		User compte : ${user.userId} <br>
        Nom : ${user.nom} <br>
        Prénom : ${user.prenom} <br>
        Pseudonyme : ${user.pseudonyme} <br>
           
	<p> Veuillez saisir les informations que vous souhaitez modifier : </p>
    <form action= "/modifieCompteSuccess" method="post">
         Addresse : <input type="text" name="adresse" /><br>
         Telephone : <input type="text" name="telephone" /><br>
         Description : <input type="text" name="description" /><br>  
         Mot de passe: <input type="text" name="mdp" /><br>  
        <input type="submit" value = "Submit"/><br>
    </form>

</body>
</html>