package gestionpuerto.sistemadegestiondepuerto;

import java.util.Date;

public class Servicio {
    private String idServicio;
    private String idCliente;
    private String tipoServicio;
    private Date fecha;
    
    public void calcularCosto() {

    }
    public void registrarServicio() {

    }
    public void modificarServicio() {

    }
    public void mostrarHistorialServicios() {

    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }
    public String getIdServicio() {
        return idServicio;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    public String getIdCliente() {
        return idCliente;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Date getFecha() {
        return fecha;
    }
}
