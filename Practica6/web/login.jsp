<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INICIAR SESION</title>
    </head>
    <body>

                    <h2>Iniciar sesion:</h2>

                    <form action="loginServlet" method="post" >
                            <label for="InputApellidoM">Usuario: </label>
                            <input type="text" name="usuario" id="Usuario" aria-describedby="Usuario" placeholder="Usuario">

                            <label for="InputApellidoM">Password: </label>
                            <input type="password" name="password" id="Password" aria-describedby="Password" placeholder="Password">

                         <button type="submit" value="Enviar valores">ENVIAR</button>
                    </form>
    </body>
</html>
