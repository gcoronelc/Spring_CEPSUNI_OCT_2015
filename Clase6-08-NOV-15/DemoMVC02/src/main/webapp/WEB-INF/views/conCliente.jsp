<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CONSULTAR CLIENTE</title>
</head>
<body>
  <h1>DATOS DEL CLIENTE</h1>
  <form method="post" action="traerCliente.htm">
    <p>Código: <input type="text" name="codigo" /></p>
    <p><input type="submit" value="Consultar" /></p>
  </form>
  <h2>RESULTADO</h2>
  <p>Codigo: ${clienteBean.codigo}</p>
  <p>Paterno: ${clienteBean.paterno}</p>
  <p>Materno: ${clienteBean.materno}</p>
  <p>Nombre: ${clienteBean.nombre}</p>
  <p>DNI: ${clienteBean.dni}</p>
  <p>Ciudad: ${clienteBean.ciudad}</p>
  <p>Direccion: ${clienteBean.direccion}</p>
  <p>Telefono: ${clienteBean.telefono}</p>
  <p>Email: ${clienteBean.email}</p>
</body>
</html>