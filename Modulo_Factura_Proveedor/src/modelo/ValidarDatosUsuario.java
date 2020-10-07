
package modelo;

import javax.swing.JOptionPane;
import vista.OpAdministrador;
import vista.OpUsuario;
public class ValidarDatosUsuario {
    
    public boolean validarDatos(String nombreUs, String contraseña) {
        System.out.println("nombre: "+nombreUs+" contraseña: " +contraseña);
        Consultas con = new Consultas();
        String[] datosR = new String[3];
        
        datosR = con.consultarDatosUsuario(nombreUs);
        incriptacion_contraseña_user sha1 = new incriptacion_contraseña_user();
        String incriptada = sha1.sha1(contraseña);
        if (nombreUs.equals("") && contraseña.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese El Usuario y Contraseña");
        } else if (nombreUs.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese El Usuario");
        } else if (contraseña.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese La Contraseña");
        }else if(datosR!=null){
            if(datosR[1].equals(incriptada)){
                if(datosR[2].equals("0")){
                    OpAdministrador adm = new OpAdministrador();
                    adm.setVisible(true);
                    return true;
                }else if(datosR[2].equals("1")){
                    OpUsuario us = new OpUsuario();
                    us.setVisible(true);
                    return true;
                }
            }else{
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }
           
        }else{
            JOptionPane.showMessageDialog(null, "Usuario no valido");
        }
        return false;
    }
}
