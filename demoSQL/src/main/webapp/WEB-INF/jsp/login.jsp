<html>
<head>
<title>Login ou creation du compte</title>
</head>
	<h1>Login</h1>
    <font color="red">${errorMessage}</font>
    <form method="post">
        Name : <input type="text" name="id" />
        Password : <input type="password" name="password" /> 
        <input type="submit" value = "Login"/>
    </form>
    <a href="${pageContext.request.contextPath}/index">Index</a><br/>   
</body>

</html>