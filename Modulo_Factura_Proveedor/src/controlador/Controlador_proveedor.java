
package controlador;

import javax.swing.table.DefaultTableModel;
import modelo.Consultas_Proveedor;
import modelo.Proveedor;
import vista.vista_crear_proveedor;

public class Controlador_proveedor {
    vista_crear_proveedor prov = new vista_crear_proveedor();
    Consultas_Proveedor bdProv=new Consultas_Proveedor();
    String nombre;
    String apellido;
    String dir;
    String correo;
    String telefono;
    String nit;
     public static DefaultTableModel tabla_datos; 
    public void crear_proveedor(){
 
        Proveedor  proveedor = new Proveedor(prov.nombre,prov.apellido,prov.direccion,prov.correo,prov.telefono,prov.nit);
        
        bdProv.creaar_proveedor(proveedor.getNom(),proveedor.getApellido(),proveedor.getDireccion(),proveedor.getCorreo(),proveedor.getTelefono(),proveedor.getNit());
        
    }
    public DefaultTableModel listar_prov(){
        Consultas_Proveedor cons= new Consultas_Proveedor();
      tabla_datos = new DefaultTableModel();
   /* String con="SELECT * FROM PROVEEDOR";
    tabla_datos.addRow(cons.BUSCAR_prov(con));
    for(int i=0; i<cons.BUSCAR_prov(con).length;i++){
    System.out.println(cons.BUSCAR_prov(con)[i]);
    }*/
    
    return tabla_datos;
    }
    public void actualizar_proveedor(String nom ){
        
        
        
    }
    
    
}
