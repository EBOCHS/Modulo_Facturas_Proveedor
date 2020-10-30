
package modelo;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Consultas_Proveedor {
    Conexion conn = new Conexion();
    public void creaar_proveedor(String nom,String ap,String dir, String correo,String telefono,String nit ){
        String url= "INSERT INTO PROVEEDOR VALUES (SEC_PROV.NEXTVAL,'"+nom+"','"+ap+"','"+dir+"','"+correo+"','"+telefono+"','"+nit+"')";
        try {
            conn.conexion();
            conn.ejecutar(url);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error:"+ e);
        }
    }
    public DefaultTableModel  BUSCAR_prov(String con){
      ResultSet res;
      DefaultTableModel modelo= new DefaultTableModel();;
            
        try {
            conn.conexion();
            res=conn.consulta(con);
            ResultSetMetaData resMd= res.getMetaData();
            Object [] lista =new Object[resMd.getColumnCount()];
             
            while(res.next()){
                for(int i=0;i<resMd.getColumnCount();i++){
                lista[i] = res.getObject(i+1);
                }
                modelo.addRow(lista);
            }
             //modelo.addRow(lista);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error:"+ e);
        }
        return modelo;
    }
}
