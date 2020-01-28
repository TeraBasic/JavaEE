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
<div class="body_wrap">
    <div class="container">
        <div class="alert alert-success text-center" role="alert"> Service proposition</div>
        <table class="table table-striped table-bordered">
            <tr>
                <td>Référence</td>
                <td>Type</td>
                <td>Nature</td>
                <td>Description courte</td>
            </tr>
            <c:forEach var="service" items="${serviceProList}">
                <tr class="text-info">
                    <td>${service.reference}</td>
                    <td>${service.typeService}</td>
                    <td>${service.natureService}</td>
                    <td>${service.description}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>