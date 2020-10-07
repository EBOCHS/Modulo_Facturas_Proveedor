
package modelo;

import javax.swing.JOptionPane;

public class NuevoUsuario {
    Conexion conn = new Conexion();
    public void GuardarUsuarioDB(Usuario nuevo){
    String datos = "INSERT INTO USUARIO VALUES (SEC_USUARIO.nextval,'"+nuevo.getNombre()+
            "','"+nuevo.getApellido()+"','"+nuevo.getContraseña()+"','"+nuevo.getTelefono()+"','"+nuevo.getCorreo()+"','"+nuevo.getTipo()+"')";
        try {
            conn.conexion();
            conn.ejecutar(datos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error:"+ e);
        }
    
    }
    
}
