
package controlador;
import modelo.ValidarDatosUsuario;
import modelo.incriptacion_contraseña_user;
import vista.login;
public class ControladorLogin{
        private String nom;
        private String pass;
       public static boolean estado = true;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public void ActivarBoton(){
        login vistaLogin = new login();
        setNom(vistaLogin.nombre);
        setPass(vistaLogin.password);
       
        ValidarDatosUsuario validar = new ValidarDatosUsuario();
        if(validar.validarDatos(getNom(),getPass())!=false){
            estado = false;
        }else{
            estado = true;
        }
    }
}
