package gestionpuerto.sistemadegestiondepuerto;

public class Tarifa {
    private String idTarifa;
    private float tarifaServicio;
    private float tarifaCargamento;

    public void setIdTarifa(String idTarifa) {
        this.idTarifa = idTarifa;
    }
    public String getIdTarifa() {
        return idTarifa;
    }

    public void asignarTarifaServicio(float tarifaServicio) {
        this.tarifaServicio = tarifaServicio;
    }
    public float getTarifaServicio() {
        return tarifaServicio;
    }

    public void asignarTarifaCargamento(float tarifaCargamento) {
        this.tarifaCargamento = tarifaCargamento;
    }
    public float getTarifaCargamento() {
        return tarifaCargamento;
    }

    public void listarTipoServicio() {

    }
    public void listarTipoCargamento() {

    }
}