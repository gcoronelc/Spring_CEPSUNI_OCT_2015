<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRAR DEPOSITO</title>
</head>
<body>
  <h1>REGISTRAR DEPOSITO</h1>
  <p><span style="color:blue;">${mensaje}</span><span style="color:red;">${error}</span></p>
  <form method="post" action="regDeposito.htm">
    <table>
      <tr>
        <td>Cuenta:</td>
        <td><input type="text" name="cuenta"/></td>
      </tr>
      <tr>
        <td>Importe:</td>
        <td><input type="text" name="importe"/></td>
      </tr>
    </table>
    <input type="submit" value="Procesar" />
  </form>
</body>
</html>