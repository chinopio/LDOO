<%@page import="controlador.LoginCookie"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DATOS DEL USUARIO</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>

        <%
            
            String nombre1 = (String)session.getAttribute("nombre");
            String apellidop="Garcia";
            String apellidom="Castillo";
            String nombre = "Eber";
            String edad ="18";
            String correo="eber_chino@hotmail.com";
           
   
            
            String usuario = (String) request.getParameter("usuario");
            String password = (String) request.getParameter("password");
            
            Cookie cookie = new Cookie("usuario",usuario);
            Cookie cookie2 = new Cookie("password",password);
            
            cookie.setMaxAge(3600);
            cookie2.setMaxAge(3600);

            response.addCookie(cookie);
            response.addCookie(cookie2);
            
 
        %>

                    <form action="LogOut" method="post">
                        
                     <h3>Bienvenido:<%=nombre1%> </h3>
                     
                     <h3>Tus datos son los siguientes: </h3>
                      <p>Apellido paterno:<%=apellidop%> </p><br>
                      <p>Apellido materno: <%=apellidom%></p><br>
                      <p>Nombre: <%=nombre%> </p><br>        
                      <p>Correo: <%=correo%> </p><br>
                      
                      <button type="submit" name="logout" value="001" id="logout">Logout</button>
                    
                 </form>
    </body>
</html>
