
package modelo;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Formato_Fecha {
    
    public String formatoFecha(Date fecha){
        SimpleDateFormat formato = new SimpleDateFormat();
        if(fecha!=null){
            return formato.format(fecha);
                }
        else{
            return null;
        }
    }
    
}
