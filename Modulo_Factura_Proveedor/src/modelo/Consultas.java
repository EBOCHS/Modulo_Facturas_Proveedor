
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
                //System.out.println(respuesta.getString("NOMBRE"));
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
   public String consulta_precio( String Consulta){
       String precio;
       try {
           conn.conexion();
           respuesta = conn.consulta(Consulta);
           if(respuesta.next()){
               precio = respuesta.getString("precio");
               return precio;
           }
       } catch (Exception e) {
       }
          return " ";
   }
   
   public void Guardar_factura(Factura fc){
       String url = "INSERT INTO factura VALUES('1',SEC_FAC.NEXTVAL,'"+fc.getFechaIni()+"')";
       try {
           conn.conexion();
           conn.ejecutar(url);
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Error:"+ e);
       }
   } 

   
    public void detalle_Factura(Factura d_fac){
        String NUFAC = "";
        String Cod_Articulo="";
        String consulta_NUMERO_FACTURA="SELECT max(FACTURA_NUM) FROM FACTURA";
        String con_cod_articulo="SELECT COD_ARTICULO FROM articulo WHERE nombre_articulo='"+d_fac.getNomProct()+"'";
        //String url ="INSERT  INTO detallefactura VALUES(SEC_DFAC.nextval,6,1,1,100)"; 

        System.out.println("cantidad: "+d_fac.getCantidad());
        System.out.println("producto: "+d_fac.getNomProct());
         System.out.println("producto: "+d_fac.getTotal());
        try {
           conn.conexion();
          respuesta = conn.consulta(consulta_NUMERO_FACTURA) ;
          if(respuesta.next()){
          NUFAC=respuesta.getString("MAX(FACTURA_NUM)");
          }
          respuesta = conn.consulta(con_cod_articulo) ;
          if(respuesta.next()){
          Cod_Articulo=respuesta.getString("COD_ARTICULO");
          }
          String url ="INSERT  INTO detallefactura VALUES(SEC_DFAC.nextval,'"+ NUFAC+"','"+Cod_Articulo+"','"+d_fac.getCantidad()+"','"+d_fac.getTotal()+"')"; 
          conn.ejecutar(url);
          
        } catch (Exception e) {
            System.out.println("error: " +e.getMessage() );
        }
        System.out.println("numero fectura: "+NUFAC);
        System.out.println("CODIGO ARTICULO: "+Cod_Articulo); 
    }
    
    public String Codigo_proveedor(String nom){
        String res="";
        String Cons = "SELECT ID_PROVEEDOR FROM proveedor WHERE nombre='"+nom+"'";
        
        try {
            conn.conexion();
            respuesta=  conn.consulta(Cons);
            if(respuesta.next()){
                res = respuesta.getString("ID_PROVEEDOR");
            }
            return res;
        } catch (Exception e) {
            System.out.println("error: " +e.getMessage() );
         return res=" ";  
        }
        
    }
    

}
