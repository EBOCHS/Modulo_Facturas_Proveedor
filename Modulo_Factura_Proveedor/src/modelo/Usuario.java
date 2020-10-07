
package modelo;
public class Usuario {
    private String nombre;
    private String apellido;
    private String contraseña;
    private int telefono;
    private String correo;
    private int tipo;

    public Usuario(String nombre, String apellido, String contraseña, int telefono, String correo, int tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.correo = correo;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
