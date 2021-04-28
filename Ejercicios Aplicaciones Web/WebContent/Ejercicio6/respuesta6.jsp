<%-- 
    Document   : respuesta6
    Created on : 21 abr. 2021, 11:08:43
    Author     : Anfisbena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Aquí tiene sus pesetas en euros</h1>
        <%
            double pesetas = Double.parseDouble(request.getParameter("pesetas"));
            double euros = pesetas / 166.386;
            out.print("Las Pesetas que has introducido son " + euros + " euros");
        %>
    </body>
</html>
