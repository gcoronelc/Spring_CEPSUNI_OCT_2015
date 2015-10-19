<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NOMBRE DE CLIENTE</title>
</head>
<body>
  <h1>NOMBRE DE CLIENTE</h1>
  <form method="post" action="nombreCliente.htm">
    <p>Código: <input type="text" name="codigo" /></p>
    <p><input type="submit" value="Consultar" /></p>
  </form>
  <h2>RESULTADO</h2>
  <p>Nombre: ${nombre}</p>
</body>
</html>