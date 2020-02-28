<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<font color="red">${errorMessage}</font>
	<h2>Modifier les informations de compte</h2>
	<p> Les informations modifiables </p>
    <form action= "/modifieCompteSuccess" method="post">
         Addresse : <input type="text" name="adresse" /><br>
         Telephone : <input type="text" name="telephone" /><br>
         Description : <input type="text" name="description" /><br>  
         Mot de passe: <input type="text" name="mdp" /><br>  
        <input type="submit" value = "Submit"/><br>
    </form>
	<p> Les informations non modifiables </p>
	<table border="1">
            <tr>
            	<td>User compte</td>
                <td>Nom</td>
                <td>Prénom</td>
                <td>Pseudonyme</td>
            </tr>
		        <tr>
		         <td>${user.userId}</td>
		         <td>${user.nom}</td>
		         <td>${user.prenom}</td>
		         <td>${user.pseudonyme}</td>
		    </tr>
           
        </table>
</body>
</html>