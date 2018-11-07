package modelo;

public class ModeloClientes 
{
    public boolean validacion;
        public boolean FaltanDatos(String usuario,String apellidop,String apellidom,String nombre,String fecha,String correo, String password) 
       {
           if(usuario.equals("")&&apellidop.equals("")&&apellidom.equals("")&&nombre.equals("")&&fecha.equals("")&&correo.equals("")&&password.equals(""))
           {
               return validacion=false;
           }
           
           else
           {
               return validacion= true;
           }
           
       }
}
