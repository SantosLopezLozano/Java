<%-- 
    Document   : ejercicio7
    Created on : 21 abr. 2021, 10:41:03
    Author     : Anfisbena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor Euros-Pesetas-Euros</title>
        <link rel="stylesheet" href="../style/style.css">
    </head>
    <body>
        <h1>conversor de moneda</h1>
    <form class="dinero" method="post" action="respuesta7.jsp">
      cantidad</br><input type="number" min="0" step="0.01" name="cantidad"></br></br>
      <input type="radio" name="cambio" value="eurosAPesetas" checked="checked"> euros -> pesetas</br></br>
      <input type="radio" name="cambio" value="pesetasAEuros"> pesetas -> euros</br></br>
      <input type="submit" value="Convertir">
    </form>
    </body>
</html>
