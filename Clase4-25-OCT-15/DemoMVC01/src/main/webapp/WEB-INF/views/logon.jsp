<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>INGRESO AL SISTEMA</title>
</head>
<body>
  <h1>INGRESO AL SISTEMA</h1>
  <p style="color:red;">${error}</p>
  <form method="post" action="logon.htm">
    <p>Usuario: <input type="text" name="usuario"/> </p>
    <p>Clave: <input type="password" name="clave"/> </p>
    <p><input type="submit" value="Ingresar"/> </p>
  </form>
</body>
</html>