
package modelo;

import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class Consultas {
     Conexion conn = new Conexion();
     ResultSet respuesta;
     
   public String[] consultarDatosUsuario(String nombre) {
       String[] datos = new String[3];
       String consultaUs = "SELECT NOMBRE,CONTRASEÑA,TIPO_USUARIO FROM USUARIO where NOMBRE='" +nombre+ "'";
        try {
            conn.conexion();
            respuesta = conn.consulta(consultaUs);

            if (respuesta.next()) {
                System.out.println(respuesta.getString("NOMBRE"));
                datos[0] = respuesta.getString("NOMBRE");
                datos[1]= respuesta.getString("CONTRASEÑA");
                datos[2] = respuesta.getString("TIPO_USUARIO");
                return datos;
            }else{
                return null;
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error de coneccion USER " + e.getMessage());
        }
        return null;
    }
   
   public DefaultComboBoxModel obt_Proveedores(String url, String columna){
       DefaultComboBoxModel listadoProveedores = new DefaultComboBoxModel();
       //listadoProveedores.addElement("elija un proveedor");
       try {
           conn.conexion();
           respuesta = conn.consulta(url);
           while(respuesta.next()){
               listadoProveedores.addElement(respuesta.getString(columna));
           }
       } catch (Exception e) {
           System.out.println("error: " +e.getMessage() );
       }
    return listadoProveedores;
   }
}
