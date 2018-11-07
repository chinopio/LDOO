<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
         <head>
                <title>Inicio de sesion</title>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
         </head>
    <body>
        <% String nombre = (String)session.getAttribute("nombre"); %>
        <h1>Bienvenido Usuario <%= nombre%></h1>
    </body>
</html>
