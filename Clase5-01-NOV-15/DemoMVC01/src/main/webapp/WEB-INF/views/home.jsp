<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<p>YO: ${sessionScope.usuario.usuario}</p>

<p><a href="cargaPagina.htm?pagina=sumar">Sumar 2 Números</a></p>
<p><a href="cargaPagina.htm?pagina=mcd">MCD de 2 Números</a></p>
<p><a href="cargaPagina.htm?pagina=pago">Calculo de Pago</a></p>
<p><a href="cantCuentas.htm">Cantidad de Cuentas</a></p>
<p><a href="cargaPagina.htm?pagina=conNombreCliente">Nombre del cliente</a></p>
<p><a href="cargaPagina.htm?pagina=conCliente">Datos del cliente</a></p>
<p><a href="cargaPagina.htm?pagina=conClientes">Datos del clientes</a></p>
<p><a href="cargaPagina.htm?pagina=conCuentaResumen">Cuenta resumen</a></p>
<p><a href="cargaPagina.htm?pagina=regDeposito">Registrar depósito</a></p>
</body>
</html>
