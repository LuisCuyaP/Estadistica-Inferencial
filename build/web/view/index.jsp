<%-- 
    Document   : index
    Created on : 25-jul-2017, 19:10:45
    Author     : UPT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../css/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Formulario</h1>
        <form name="form" action="/Demo12/Procesar" method="post">
            Apellidos
            <input name="txtape" type="text" size="30">
            <br>
            Monto
            <input name="txtmon" type="text" size="15">
            <br>
            Fecha
            <input name="txtfecha" type="date" size="15">
            <br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
