<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Notification</h2>
<div class="body_notification">
    <div class="container">
        <div class="alert alert-success text-center" role="alert">Somemeone propose service</div>
        <table class="table table-striped table-bordered">
            <tr>
                <td>Demande ID</td>
                <td>Demand Compte</td>
                <td>Propose Compte</td>
                <td>Message</td>
            </tr>
            <c:forEach var="propositionService" items="${listpropositionService}">
                <tr class="text-info">
                    <td>${propositionService.serviceDemandeId}</td>
                    <td>${propositionService.demandCompte}</td>
                    <td>${propositionService.proposeCompte}</td>
                    <td>${propositionService.message}</td>
                    
                    <td>
                    	<a href="${pageContext.request.contextPath}/detailContractPerson/${propositionService.proposeCompte}">Detail of contract person</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

<div class="body_notification">
    <div class="container">
        <div class="alert alert-success text-center" role="alert"> Someone accept service</div>
        <table class="table table-striped table-bordered">
            <tr>
                <td>Offer ID</td>
                <td>Offer Compte</td>
                <td>Offer Compte</td>
                <td>Message</td>
            </tr>
            <c:forEach var="acc" items="${listAcc}">
                <tr class="text-info">
                    <td>${acc.offerId}</td>
                    <td>${acc.compteId}</td>
                    <td>${acc.acceptCompte}</td>
                    <td>${acc.message}</td>
                    <td>
                    	<a href="${pageContext.request.contextPath}/detailContractPerson/${acc.acceptCompte}">Detail of contract person</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>