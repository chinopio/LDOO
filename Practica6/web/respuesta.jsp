<!DOCTYPE html>
<html>
    <head>
        <title>REGISTRO</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%--Variables--%>

        <%
            
            String apellidop= request.getParameter("apellidop");
            String apellidom= request.getParameter("apellidom");
            String nombre= request.getParameter("nombre");
            String fecha= request.getParameter("fecha");
            String correo= request.getParameter("correo");
            String password= request.getParameter("password");
                
        %>

                    <h2>Tus datos son los siguientes:</h2>

                    <p>Apellido materno: <%=apellidom%></p><br>
                    <p>Apellido paterno:<%=apellidop%> </p><br>
                    <p>Nombre: <%=nombre%> </p><br>
                    <p>Fecha de nacimiento: <%=fecha%> </p><br>
                    <p>Correo: <%=correo%> </p><br>
                    <p>Password: <%=password%> </p><br>


    </body>
</html>