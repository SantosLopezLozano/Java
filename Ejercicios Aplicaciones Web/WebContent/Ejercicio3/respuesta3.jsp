<%-- 
    Document   : respuesta3
    Created on : 21 abr. 2021, 10:14:36
    Author     : Anfisbena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../style/style.css">
    </head>
    <body>
        <h1>¿Cómo te llamas?</h1>
        <%
        String nombre = request.getParameter("nombre");
        out.print("Hola, " + nombre);
        %>
    </body>
</html>
