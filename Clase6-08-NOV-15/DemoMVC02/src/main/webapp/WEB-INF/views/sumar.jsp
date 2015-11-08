<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SUMAR</title>
</head>
<body>
  <h1>SUMAR</h1>
  
  <form id="form1" action="sumar.htm">
    <p>Número 1:<input type="text" name="num1" value="${n1}"/></p>
    <p>Número 2:<input type="text" name="num2" value="${n2}"/></p>
    <p><input type="button" id="btnSumar" value="Procesar" /></p>
  </form>
  
  <div id="divResultado" style="display: none;">
	  <h2>RESULTADO</h2>
	  <p>Número 1 ==> <span id="n1"></span></p>  
	  <p>Número 2 ==> <span id="n2"></span></p>
	  <p>Suma =====> <span id="suma"></span></p>
  </div>
  
  <script type="text/javascript">
     $("#btnSumar").click(function(){
    	 var data = $("#form1").serialize();
    	 $.post("sumar.htm",data,function(objJson){
    		 $("#n1").html(objJson.n1);
    		 $("#n2").html(objJson.n2);
    		 $("#suma").html(objJson.suma);
    		 $("#divResultado").show();
    	 });
     });
  </script>
  
</body>
</html>