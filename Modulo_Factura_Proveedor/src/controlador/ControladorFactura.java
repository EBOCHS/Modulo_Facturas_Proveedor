
package controlador;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import modelo.Consultas;
import modelo.Factura;
import modelo.Formato_Fecha;
import vista.NuevaFactura;
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
    
    public Factura crearFactura(){
    Formato_Fecha formato = new Formato_Fecha();
    NuevaFactura obtDatosFac = new NuevaFactura();
    String nomProve = obtDatosFac.nomProv; 
    String nomProcto = obtDatosFac.nomProct;
    int cantidad = obtDatosFac.cantidad;
    String fechaIni = formato.formatoFecha(obtDatosFac.fecha1 );
    String fechaLim =  formato.formatoFecha(obtDatosFac.fecha2);
    String pagoCondi = obtDatosFac.pagoCondi;
    String divisa = obtDatosFac.divisa;
    String nota = obtDatosFac.nota;
    Factura CrearFac = new Factura(nomProve,nomProcto,cantidad,fechaIni,fechaLim,pagoCondi,divisa,nota);
    return CrearFac;
    }
    
}
