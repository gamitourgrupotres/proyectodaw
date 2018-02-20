<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr><th>Nombre</th><th>Apellidos</th><th>Rol</th><th>Acción</th><th>Actualizar</th></tr>
<c:forEach items="${listaClientes}" var="unCliente">
<tr><td>${unCliente.nombre}</td>
<td>${unCliente.apellidos}</td>
<td>${unCliente.rol}</td>
<td><a href="borrarusuario.do?idUsuario=${unUsuario.idusuarios}">Borrar usuario</a></td>

<td><a href="actualizarusuario.jsp?idUsuario=${unUsuario.idusuarios}&nombre=${unUsuario.nombre}&password=${unUsuario.password}">Actualizar usuario</a>
</tr>
</c:forEach>
</table>
</body>
</html>