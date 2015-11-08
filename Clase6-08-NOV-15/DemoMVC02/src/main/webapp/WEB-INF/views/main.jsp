<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/estilos.css"/>">
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/menu/menu.css"/>">
<script type="text/javascript" src="<c:url value="/resources/jquery/jquery-2.1.4.min.js"/>"></script>
<title>EUREKA APP SOLUTION</title>
<style type="text/css">
#_MARCO{
  width: 900px;
  background: #E0F8E0;
  color: #151515;
  margin: 10px auto;
  padding: 10px;
}


</style>
</head>
<body>
  <div id="_MARCO"></div>
  <script type="text/javascript">
  
  $("#_MARCO").load("logon.htm");

  </script>
</body>
</html>