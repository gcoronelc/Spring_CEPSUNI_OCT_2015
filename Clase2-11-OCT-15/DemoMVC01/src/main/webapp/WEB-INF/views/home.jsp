<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<p>YO: ${yo}</p>

<p><a href="cargaPagina.htm?pagina=sumar">Sumar 2 Números</a></p>
<p><a href="cargaPagina.htm?pagina=mcd">MCD de 2 Números</a></p>
<p><a href="cargaPagina.htm?pagina=pago">Calculo de Pago</a></p>

</body>
</html>
