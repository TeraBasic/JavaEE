<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-image: none;">

<ul style="list-style-type:disc">
 <li>
  <a href="login" class="btn btn-default">Login</a>
 </li>
 <li>
  <a href="creerCompte" class="btn btn-default">Create compte</a>
 </li>
 
</ul>  

<h2>Demande</h2>
<div class="body_offer">
    <div class="container">
        <div class="alert alert-success text-center" role="alert"> Service proposition</div>
        <table class="table table-striped table-bordered">
            <tr>
                <td>Nom</td>
                <td>Prénom</td>
                <td>Téléphone</td>
                <td>Adresse</td>
                
            </tr>
            
		        <tr class="text-info">
		         <td>${userCompte.nom}</td>
		         <td>${userCompte.prenom}</td>
		         <td>${userCompte.telephone}</td>
		         <td>${userCompte.adresse}</td>                
		    </tr>
           
        </table>
        <a href="${pageContext.request.contextPath}/modifierCompte">Modifier Compte</a><br/>
    </div>
</div>
</body>
</html>