
package modelo;

import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conexion {
    
    private static Connection conn = null;
    static Statement st;
    static ResultSet rs;
    
    private static String usuario_BD = "BD_Factura_Proveedor";
    private static String contraseña="erick67boch";
    private static String url="jdbc:oracle:thin:@localhost:1521:xe";
  
    public void conexion(){
        try {
            String url="jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url,usuario_BD,contraseña);
            st= conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error de coneccion "+e.getMessage());
        }
    }
   
    public void ejecutar(String Mensaje) throws SQLException{ 
        st.execute(Mensaje); 
         JOptionPane.showMessageDialog(null, "REGISTRO GARDADO");
        conn.close();
    }
    
    public ResultSet consulta(String consulta) throws SQLException{
        rs = st.executeQuery(consulta);
          return rs;  
    }
}
