<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CONSULTAR CLIENTES</title>
</head>
<body>
  <h1>CONSULTAR CLIENTES</h1>
  <form method="post" action="conClientes.htm">
    <table>
      <tr>
        <td colspan="2">Nombre</td>
      </tr>
      <tr>
        <td><input type="text" name="nombre" /></td>
        <td><input type="submit" value="Consultar" /></td>
      </tr>
    </table>
  </form>
  
  <h2>RESULTADO</h2>
  <table>
    <thead>
      <tr>
        <th>CODIGO</th>
        <th>PATERNO</th>
        <th>MATERNO</th>
        <th>NOMBRE</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${lista}" var="clienteBean">    
	      <tr>
	        <td>${clienteBean.codigo}</td>
	        <td>${clienteBean.paterno}</td>
	        <td>${clienteBean.materno}</td>
	        <td>${clienteBean.nombre}</td>
	      </tr>
      </c:forEach>
    </tbody>
  </table>
</body>
</html>