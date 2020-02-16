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
<title>Compte info</title>
</head>
<body>

<h2>Detail person info</h2>
<div>
    <div>
        <table>
            <tr>
                <td>Nom</td>
                <td>Prénom</td>
                <td>Pseudonyme</td>
                <td>Telephone</td>
                <td>Adress</td>
                <td>Description</td>
                
            </tr>
		        <tr>
		         <td>${userCompte.nom}</td>
		         <td>${userCompte.prenom}</td>
		         <td>${userCompte.pseudonyme}</td>
		         <td>${userCompte.telephone}</td>
		         <td>${userCompte.adresse}</td>
		         <td>${userCompte.description}</td>
		    </tr>
           
        </table>
        <a href="${pageContext.request.contextPath}/home">Home</a><br/>
        <a href="${pageContext.request.contextPath}/index">Index</a><br/>
    </div>
</div>
</body>
</html>