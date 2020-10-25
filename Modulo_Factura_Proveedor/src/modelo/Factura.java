
package modelo;

public class Factura {
    
    private String nomProv; 
    private String nomProct;
    private int cantidad;
    private String fechaIni;
    private String fechaLim;
    private String pagoCondi;
    private String divisa;
    private String nota;
    private int total;

    public Factura(String nomProv, String nomProct, int cantidad, String fechaIni, String fechaLim, String pagoCondi, String divisa, String nota, int total ) {
        this.nomProv = nomProv;
        this.nomProct = nomProct;
        this.cantidad = cantidad;
        this.fechaIni = fechaIni;
        this.fechaLim = fechaLim;
        this.pagoCondi = pagoCondi;
        this.divisa = divisa;
        this.nota = nota;
        this.total=total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    
    public String getNomProv() {
        return nomProv;
    }

    public void setNomProv(String nomProv) {
        this.nomProv = nomProv;
    }

    public String getNomProct() {
        return nomProct;
    }

    public void setNomProct(String nomProct) {
        this.nomProct = nomProct;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechaLim() {
        return fechaLim;
    }

    public void setFechaLim(String fechaLim) {
        this.fechaLim = fechaLim;
    }

    public String getPagoCondi() {
        return pagoCondi;
    }

    public void setPagoCondi(String pagoCondi) {
        this.pagoCondi = pagoCondi;
    }

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    
    
    
}
