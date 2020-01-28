<html>
<head>
<title>Creation du compte</title>
</head>
    <font color="red">${errorMessage}</font>
    <h2>Creer un compte</h2>
    <form action= "creerCompte" method="post">
         ID(E-mail) : <input type="text" name="userId" /><br>
         Pass word: <input type="text" name="password" /><br>
         Nom : <input type="text" name="nom" /><br>
         Prenom : <input type="text" name="prenom" /><br>
         Pseudonyme : <input type="text" name="pseudonyme" /><br>
         Addresse : <input type="text" name="adresse" /><br>
         Telephone : <input type="text" name="telephone" /><br>
         Description : <input type="text" name="description" /><br>      
        <input type="submit" value = "Submit demande"/><br>
    </form> 
</body>

</html>