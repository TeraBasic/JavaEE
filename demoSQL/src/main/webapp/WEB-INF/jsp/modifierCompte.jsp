<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Modifier les informations de compte</h2>
    <form action= "modifieCompteSuccess" method="post">
         Nom : <input type="text" name="nom" /><br>
         Prenom : <input type="text" name="prenom" /><br>
         Pseudonyme : <input type="text" name="pseudonyme" /><br>
         Addresse : <input type="text" name="adresse" /><br>
         Telephone : <input type="text" name="telephone" /><br>
         Description : <input type="text" name="description" /><br>      
        <input type="submit" value = "Submit"/><br>
    </form>
	
</body>
</html>