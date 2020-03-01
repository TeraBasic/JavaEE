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
	  # Nom : ${user.nom} #
	  -----# Prenom : ${user.prenom} #
<a href="${pageContext.request.contextPath}/index">-----# index #</a>
	  <a href="${pageContext.request.contextPath}/home">-----# Home #</a>
	  <a href="${pageContext.request.contextPath}/notification">-----# Notification #</a>	
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