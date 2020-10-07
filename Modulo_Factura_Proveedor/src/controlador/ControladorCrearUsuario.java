
package controlador;
import modelo.NuevoUsuario;
import modelo.Usuario;

import modelo.incriptacion_contraseña_user;
import vista.CrearUsuario;


public class ControladorCrearUsuario {
    
    CrearUsuario vistaCrearUsuario = new CrearUsuario();
    NuevoUsuario guardarDB = new NuevoUsuario();
    
    public void BotonCrearUsuario() {
        incriptacion_contraseña_user incriptar = new incriptacion_contraseña_user();
        String nombre = vistaCrearUsuario.nombre;
        String apellido = vistaCrearUsuario.apellido;
        String contraseña = incriptar.sha1(vistaCrearUsuario.contraseña);
        int tel = Integer.parseInt(vistaCrearUsuario.telefono);
        String correo = vistaCrearUsuario.contraseña;
        int TipoUsuario = vistaCrearUsuario.tipoUs;
        Usuario UsuarioNuevo = new Usuario(nombre, apellido, contraseña, tel, correo, TipoUsuario);
        guardarDB.GuardarUsuarioDB(UsuarioNuevo);

    }
}