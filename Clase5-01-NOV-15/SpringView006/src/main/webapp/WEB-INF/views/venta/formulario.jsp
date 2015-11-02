<!-- Autor: Gustavo Coronel -->
<!-- Blog: gcoronelc.blogspot.com -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<link href="<c:url value="/resources/css/estilos.css"/>"
	rel="stylesheet">
<title>VENTA</title>
<style type="text/css">
.etiqueta {
	width: 100px;
	display: inline-block;
}
</style>
</head>
<body>

	<h1>VENTA</h1>

	<form:form name="form1" commandName="ventaBean" method="post"
		action="doProcesarVenta.htm">

		<form:errors path="*" element="div" cssClass="errorMessage" />

    <div class="contenido">
    <table>
      <tr>
        <td align="left"><form:label cssClass="etiqueta" path="precio">Precio:</form:label></td>
        <td align="left"><form:input path="precio" /></td>
        <td align="left"><form:errors path="precio" cssStyle="color:red;" /></td>
      </tr>
      <tr>
        <td align="left"><form:label cssClass="etiqueta" path="cant">Cantidad:</form:label></td>
        <td align="left"><form:input path="cant" /></td>
        <td align="left"><form:errors path="cant" cssStyle="color:red;" /></td>
      </tr>
    </table>
    </div>

	</form:form>

	<a href="javascript: submitform()">Procesar</a>
	<a href="<c:url value="/"/>">Inicio</a>

</body>
<script type="text/javascript">
	function submitform() {
		document.form1.submit();
	}
</script>
</html>
