<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<div class="_HEADER">
  <table style="width: 100%;">
    <tr>
      <td>Usuario: ${sessionScope.usuario.usuario}</td>
      <td style="text-align: right;"><a href="#">Salir</a></td>
    </tr>
  </table>
</div>
<div class="_MENU">
  <jsp:include page="menu.jsp"/>
</div>
<div id="_CONTENT" class="_CONTENT">
  <p></p>
  <p></p>
  <p></p>
</div>




<p><a href="cargaPagina.htm?pagina=sumar">Sumar 2 Números</a></p>
<p><a href="cargaPagina.htm?pagina=mcd">MCD de 2 Números</a></p>
<p><a href="cargaPagina.htm?pagina=pago">Calculo de Pago</a></p>
<p><a href="cantCuentas.htm">Cantidad de Cuentas</a></p>
<p><a href="cargaPagina.htm?pagina=conNombreCliente">Nombre del cliente</a></p>
<p><a href="cargaPagina.htm?pagina=conCliente">Datos del cliente</a></p>
<p><a href="cargaPagina.htm?pagina=conClientes">Datos del clientes</a></p>
<p><a href="cargaPagina.htm?pagina=conCuentaResumen">Cuenta resumen</a></p>
<p><a href="cargaPagina.htm?pagina=regDeposito">Registrar depósito</a></p>

  <script type="text/javascript">
  
  function fnCargarPagina(pagina){
	  console.log("Pagina: " + pagina);
	  var direccion;
	  console.log("i = " + pagina.search("s"));
	  if(pagina.indexOf(".") == -1){
		  direccion = "cargaPagina.htm?pagina=" + pagina;
	  } else {
		  direccion = pagina;
	  }
	  console.log("Direccion: " + direccion);
	  $("#_CONTENT").load(direccion);
  }
  
  </script>

</body>
</html>
