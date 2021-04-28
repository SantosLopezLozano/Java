<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Aquí tiene su  pirámide</title>
		<%
		      int alturaTotal = Integer.parseInt(request.getParameter("altura"));
		      int altura = 1;
		      int i = 0;
		      int espacios = alturaTotal - 1;
		
		      while (altura <= alturaTotal) {

		          // inserta espacios (imagenes en blanco)
		          for (i = 1; i <= espacios; i++) {
		          	  out.print("<img src=\"images\fuji-san.jpg\">");
		          }
		
		          // pinta la línea
		          for (i = 1; i < altura * 2; i++) {
		          	  out.print("<img src=\"images\fuji-san.jpg\">");
		          }
		
		          out.println("</br>");
		  
		          altura++;
		          espacios--;
	          } // while
       %>
	</head>
<body>

</body>
</html>