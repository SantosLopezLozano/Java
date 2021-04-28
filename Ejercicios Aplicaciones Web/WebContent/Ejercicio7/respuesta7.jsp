<%-- 
    Document   : respuesta7
    Created on : 26 abr. 2021, 12:19:12
    Author     : Anfisbena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor</title>
        <link rel="stylesheet" href="../style/style.css">
    </head>
    <body>
        <%
            double cantidad = Double.parseDouble(request.getParameter("cantidad"));
            
            if (request.getParameter("cambio").equals("eurosAPesetas")) {
                out.print(cantidad + " euros son " + Math.round(cantidad * 166.386) + " pesetas.");
            } else {
                out.print(Math.round(cantidad) + " pesetas son " + (cantidad / 166.386) + " euros.");
            }
        %>
    </body>
</html>
