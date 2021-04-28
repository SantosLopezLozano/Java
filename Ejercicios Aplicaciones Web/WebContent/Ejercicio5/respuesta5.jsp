<%-- 
    Document   : respuesta5
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
        <h1>Aquí tiene sus euros en pesetas</h1>
        <%
            double euros = Double.parseDouble(request.getParameter("euros"));
            double pesetas = euros * 166.386;
            out.print("Los Euros que has introducido son " + pesetas + " pesetas");
        %>
    </body>
</html>
