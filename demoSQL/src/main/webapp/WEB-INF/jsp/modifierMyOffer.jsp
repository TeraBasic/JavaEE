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
    <p> Modifier Offer </p>
    <p> Welcome ${offer.compteId}!! </p>
    <p>Veuillez saisir les informations que vous souhaitez modifier : </p>
	<form id="form" action= "modifierOfferSuccess" method="post">
		id offer : <input type="text" name="offerId" value = "${offer.offerId}" readonly="readonly" /><br>
		compte id: <input type="text" name="compteId" value = "${offer.compteId}" readonly="readonly"/><br>
        nom de service : <input type="text" name="nomService" value = "${offer.nomService}" /><br>
        type de service: <input type="text" name="typeService" value = "${offer.typeService}"/><br>
        nature de service : <input type="text" name="natureService" value = "${offer.natureService}"/><br>
        date valid offer: <input id="date" type="Date" name="dateValidOffert" value = "${offer.dateValidOffert}"><br>
        description : <input type="text" name="description" value = "${offer.description}"/><br>
        description detail: <input type="text" name="descriptionDetail" value = "${offer.descriptionDetail}"/><br>
        localisation de service :<input type="text" name="localisationService" value = "${offer.localisationService}" /><br>
        <c:choose> 
			  <c:when test="${userType.equals('Administrateur')}">
			    Etat offer: <select name="etatService" value = "${offer.etatService}">
	         				 <option value ="a_valide">A_VALIDER</option>
  			 				 <option value ="valide">VALIDE</option>
			 				 </select><br>
			  </c:when>
			  <c:otherwise>
			   Etat offer: <input type="text" name="etatService" value = "${offer.etatService}" readonly="readonly"/><br>
			  </c:otherwise>
		</c:choose>
        
        
        <input type="button" onclick="submit_confirm()" value = "Submit modification"/><br>
    </form>
    </center>
    <script>
    	function submit_confirm(){
    		var gnl=confirm("voulez-vous confirmer? ");
    		if (gnl==true){
    			document.getElementById("form").submit();
    		}
    	}
    </script>
</body>
</html>