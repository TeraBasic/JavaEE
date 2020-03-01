<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <p> Modifier Demande </p>
    <p> Welcome ${demande.compteId}!! </p>
    <p>Veuillez saisir les informations que vous souhaitez modifier : </p>
	<form action= "modifierDemandeSuccess" method="post">
		Id Demande: <input type="text" name="serviceDemandeId" value = "${demande.serviceDemandeId}" readonly="readonly"/><br>
		Compte utilisateur: <input type="text" name="compteId" value = "${demande.compteId}" readonly="readonly" /><br>
        nom de service : <input type="text" name="nomService" value = "${demande.nomService}" /><br>
        type de service: <input type="text" name="typeService" value = "${demande.typeService}"/><br>
        nature de service : <input type="text" name="natureService" value = "${demande.natureService}"/><br>
        date valid demande: <input id="date" type="Date" name="dateValidDemande" value = "${demande.dateValidDemande}"><br>
        description : <input type="text" name="description" value = "${demande.description}"/><br>
        description detail: <input type="text" name="descriptionDetail" value = "${demande.descriptionDetail}"/><br>
        localisation de service :<input type="text" name="localisationService" value = "${demande.localisationService}" /><br>
       
        <c:choose> 
			  <c:when test="${userType.equals('Administrateur')}">
			    Etat demande: <select name="etatService" value = "${demande.etatService}">
	         				 <option value ="a_valide">A_VALIDER</option>
  			 				 <option value ="valide">VALIDE</option>
			 				 </select><br>
			  </c:when>
			  <c:otherwise>
			    Etat offer: <input type="text" name="etatService" value = "${demande.etatService}" readonly="readonly"/><br>
			  </c:otherwise>
		</c:choose>
        <input type="submit" value = "Submit modification"/><br>
    </form>
    </center>
</body>
</html>