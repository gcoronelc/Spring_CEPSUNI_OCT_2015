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
  <h1>PAGO</h1>

  <form method="post" action="pago.htm">
    <p>Horas por día:<input type="text" name="horasDia" value="${pagoBean.horasDia}"/></p>
    <p>Días trabajados:<input type="text" name="dias" value="${pagoBean.dias}"/></p>
    <p>Pago por hora:<input type="text" name="pagoHora" value="${pagoBean.pagoHora}"/></p>
    <p><input type="submit" value="Procesar" /></p>
  </form>
  
  <c:if test="${pagoBean != null}">
    <h2>RESULTADO</h2>
    <p>Ingresos ==> ${pagoBean.ingresos}</p>  
    <p>Renta =====> ${pagoBean.renta}</p>
    <p>Neto ======> ${pagoBean.neto}</p>
  </c:if>
    
</body>
</html>