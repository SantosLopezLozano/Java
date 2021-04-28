<%-- 
    Document   : ejercicio4
    Created on : 21 abr. 2021, 10:31:51
    Author     : Anfisbena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Media</title>
        <link rel="stylesheet" href="../Ejercicio4/ejercicio4.jsp">
    </head>
    <body>
        <h1>Media De Notas</h1>
        <p>Escriba la nota de tres examenes para calcular su media</p>
        <form action="respuesta4.jsp">
            <input name="nota1" type="number" required=""><br>
            <input name="nota2" type="number" required=""><br>
            <input name="nota3" type="number" required=""><br>
            <input type="submit" value="aceptar"><br>
        </form>
    </body>
</html>
