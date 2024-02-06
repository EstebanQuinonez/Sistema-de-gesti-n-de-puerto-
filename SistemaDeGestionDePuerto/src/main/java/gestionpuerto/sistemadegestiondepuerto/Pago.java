package gestionpuerto.sistemadegestiondepuerto;

public class Pago {
    private String idPago;
    private String idServicio;
    private String idFactura;
    private float montoPagado;
    private String metodo;

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }
    public String getIdPago() {
        return idPago;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }
    public String getIdServicio() {
        return idServicio;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }
    public String getIdFactura() {
        return idFactura;
    }

    public void setMontoPagado(float montoPagado) {
        this.montoPagado = montoPagado;
    }
    public float getMontoPagado() {
        return montoPagado;
    }
    
    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
    public String getMetodo() {
        return metodo;
    }

}
