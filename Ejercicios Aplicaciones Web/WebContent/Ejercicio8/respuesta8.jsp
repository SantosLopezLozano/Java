<%-- 
    Document   : respuesta8
    Created on : 26 abr. 2021, 12:32:05
    Author     : Anfisbena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabla de Multiplicar</title>
    </head>
    <body>
        <%
            int numero = Integer.parseInt(request.getParameter("numero"));
            out.println("Ésta es la tabla de multiplicar de " + numero);
            for (int i = 1; i < 11; i++){
                out.println("<tr><td>" + numero + " x " + i + "</td><td> = </td><td>" + numero * i + "</td></tr>");
            }
        %>
    </body>
</html>
