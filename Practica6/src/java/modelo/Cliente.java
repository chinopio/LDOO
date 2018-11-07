package modelo;

public class Cliente
{
    private String usuario;
    private String ApPaterno;
    private String ApMaterno;
    private String Nombre;
    private String Fecha;
    private String Correo;
    private String Password;
    
    Cliente(String usuario,String apellidop, String apellidom, String nombre, String fecha, String correo, String password) 
    {
        usuario="juanjito09";
        apellidop="Ornelas";
        apellidom="Herrera";
        nombre="Juan Jose";
        fecha="16/10/1998";
        correo="juanjo@gmail.com";
        password="1234";
    }

    public String getApPaterno() {
        return ApPaterno;
    }

    public void setApPaterno(String ApPaterno) {
        this.ApPaterno = ApPaterno;
    }

    public String getApMaterno() {
        return ApMaterno;
    }

    public void setApMaterno(String ApMaterno) {
        this.ApMaterno = ApMaterno;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
