
package controlador;

import javax.swing.DefaultComboBoxModel;
import modelo.Consultas;
import modelo.Factura;
import vista.NuevaFactura;
public class ControladorFactura {

    Consultas conProb = new Consultas();
   
    //metodo para consultar al modelo los proveedores
    public DefaultComboBoxModel datosProveedor() {
        DefaultComboBoxModel modelo;
        String url = "SELECT NOMBRE FROM  PROVEEDOR";
        modelo = conProb.obt_Proveedores(url);
        return modelo;
    }
    
    public Factura crearFactura(){
        
    NuevaFactura obtDatosFac = new NuevaFactura();
    String nomProve = obtDatosFac.nomProv; 
    String nomProcto = obtDatosFac.nomProct;
    int cantidad = obtDatosFac.cantidad;
    String fechaIni = obtDatosFac.fechaIni;
    String fechaLim = obtDatosFac.fechaLim;
    String pagoCondi = obtDatosFac.pagoCondi;
    String divisa = obtDatosFac.divisa;
    String nota = obtDatosFac.nota;
    Factura CrearFac = new Factura(nomProve,nomProcto,cantidad,fechaIni,fechaLim,pagoCondi,divisa,nota);
    return CrearFac;
    
    }
}
