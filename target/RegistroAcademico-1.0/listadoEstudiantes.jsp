<%-- 
    Document   : listadoEstudiantes
    Created on : 8 abr 2024, 19:40:40
    Author     : UFG
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Estudiantes</title>
    </head>
    <body>
        <h1>Listado de Estudiantes</h1>
        <ul>
            <c:forEach items="${estudiantes}" var="estudiante">
                <li>${estudiante.carnet} ${estudiante.nombre}</li>
            </c:forEach>
        </ul>
    </body>
</html>
