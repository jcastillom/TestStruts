<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Compuertas Lógicas</title>
</head>
<body>
	<s:form action="hello">
		<s:radio label="Compuerta" name="compuerta" list="listComp" value="compuerta" />
		<s:textfield name="valor1" />
		<s:property value="validaV1"/>
		<s:textfield name="valor2" />
		<s:property value="validaV2"/>
		<s:submit value="submit"/>
			<br>
			<br>
			<br>
		<table></table>
	</s:form>
	Compuerta elegida: <s:property value="resultado"/>
	<br><br>
	<s:if test="valorImg == 'and11'">
		<img src="<s:url value="images/and.jpg" />" alt="and" />
	</s:if>
</body>
</html>