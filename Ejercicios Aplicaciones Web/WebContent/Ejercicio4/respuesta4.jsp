<%-- 
    Document   : resultado4
    Created on : 21 abr. 2021, 10:56:43
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
        <h1>La Media de Tus Tres Notas es...</h1>
        <%
            double nota1 = Double.parseDouble(request.getParameter("nota1"));
            double nota2 = Double.parseDouble(request.getParameter("nota2"));
            double nota3 = Double.parseDouble(request.getParameter("nota3"));
            double media = (nota1 + nota2 + nota3)/3;
            out.print("La media de sus notas es " + media);
        %>
    </body>
</html>
