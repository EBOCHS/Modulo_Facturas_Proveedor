
package controlador;
import javax.swing.DefaultComboBoxModel;
import modelo.Calcular_Total_producto;
import modelo.Consultas;
import modelo.Factura;
import modelo.Formato_Fecha;
import vista.Vista_Factura;
public class ControladorFactura {
    String url;
    String columna;
    Consultas conProb = new Consultas();
   
    //metodo para consultar al modelo los proveedores
    public DefaultComboBoxModel datosProveedor() {
        DefaultComboBoxModel modelo;
        url = "SELECT NOMBRE FROM  PROVEEDOR";
        columna ="NOMBRE";
        modelo = conProb.obt_Proveedores(url,columna);
        return modelo;
    }
    public DefaultComboBoxModel ProductosProveedor(String nombreProv) {
        DefaultComboBoxModel modelo;
        url = "SELECT NOMBRE_ARTICULO FROM  PROVEEDOR PV RIGHT JOIN ARTICULO AR ON pv.id_proveedor = AR.FK_PROVEEDOR WHERE pv.nombre ='"+nombreProv+"'";
        columna = "NOMBRE_ARTICULO";
        modelo = conProb.obt_Proveedores(url, columna);
        return modelo;
    }
    public String PrecioProducto(String nomProduc){
        String precio; 
        url = "select precio from articulo where nombre_articulo='"+nomProduc+"'";
        precio = conProb.consulta_precio(url);
        return precio;
    }
    
    public String CalcularTotal(int cantidad, int precio){
        Calcular_Total_producto total = new Calcular_Total_producto();
        return total.calcular_precio(cantidad, precio);
    }
    
    public Factura crearFactura(){
    Formato_Fecha formato = new Formato_Fecha();
    Vista_Factura obtDatosFac = new Vista_Factura();
    String nomProve = obtDatosFac.nomProv; 
    String nomProcto = obtDatosFac.nomProct;
    int cantidad = obtDatosFac.cantidad;
    String fechaIni = formato.formatoFecha(obtDatosFac.fecha1);
    String fechaLim =  formato.formatoFecha(obtDatosFac.fecha2);
    String pagoCondi = obtDatosFac.pagoCondi;
    String divisa = obtDatosFac.divisa;
    String nota = obtDatosFac.nota;
    int total= obtDatosFac.total;
    Factura CrearFac = new Factura(nomProve,nomProcto,cantidad,fechaIni,fechaLim,pagoCondi,divisa,nota,total);
    return CrearFac;
    }
    
    public void facNueva(){
        conProb.Guardar_factura(crearFactura());
        System.out.println("proveecor:" +crearFactura().getNomProv());
        System.out.println("fecha" +crearFactura().getFechaIni());
    }
    public void detalleFac(){
        conProb.detalle_Factura(crearFactura());
        
    }
    
    public String  Cod_prob(String nombre){
        String nombreProv;
        nombreProv=conProb.Codigo_proveedor(nombre);
        return nombreProv;
    }
    
    
}
