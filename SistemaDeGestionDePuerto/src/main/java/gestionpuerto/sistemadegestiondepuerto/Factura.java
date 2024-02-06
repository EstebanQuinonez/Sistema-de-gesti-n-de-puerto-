package gestionpuerto.sistemadegestiondepuerto;

import java.util.Date;

public class Factura {
    private String idFactura;
    private String numeroFactura;
    private Date fechaEmision;

    public void generarNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    public void generarFactura(String idFactura) {
        this.idFactura = idFactura;
    }
    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    public Date getFechaEmision() {
        return fechaEmision;
    }
}
