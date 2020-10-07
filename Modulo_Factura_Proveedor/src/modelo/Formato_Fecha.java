/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ERICK BOCH
 */
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
