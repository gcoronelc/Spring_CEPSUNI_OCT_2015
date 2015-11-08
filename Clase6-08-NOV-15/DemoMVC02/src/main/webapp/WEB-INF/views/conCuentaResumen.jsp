<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>RESUMEN DE CUENTA</h1>
  <form method="post" action="conCuentaResumen.htm">
    <table>
      <tr>
        <td colspan="2">Cuenta</td>
      </tr>
      <tr>
        <td><input type="text" name="cuenta" /></td>
        <td><input type="submit" value="Consultar" /></td>
      </tr>
    </table>
  </form>
  
  <h2>RESULTADO</h2>
  <table>
    <thead>
      <tr> 
        <th>CUENTA</th>
        <th>SALDO</th>
        <th>ACCION</th>
        <th>IMPORTE</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${lista}" var="map">    
        <tr>
          <td>${map.CUENTA}</td>
          <td>${map.SALDO}</td>
          <td>${map.ACCION}</td>
          <td>${map.IMPORTE}</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</body>
</html>