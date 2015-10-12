<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MCD</title>
</head>
<body>
  <h1>MCD</h1>

  <form method="post" action="mcd.htm">
    <p>Número 1:<input type="text" name="num1" value="${n1}"/></p>
    <p>Número 2:<input type="text" name="num2" value="${n2}"/></p>
    <p><input type="submit" value="Procesar" /></p>
  </form>
   
   
  <c:if test="${mcd != null}">
    <h2>RESULTADO</h2>
    <p>Número 1 ==> ${n1}</p>  
    <p>Número 2 ==> ${n2}</p>
    <p>MCD ======> ${mcd}</p>
  </c:if>
    
</body>
</html>