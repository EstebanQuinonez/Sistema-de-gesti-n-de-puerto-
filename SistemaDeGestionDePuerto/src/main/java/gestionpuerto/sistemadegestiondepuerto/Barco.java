package gestionpuerto.sistemadegestiondepuerto;

public class Barco {
    private String idBarco;
    private String nombre;
    private String estado;
    private float capacidadMaximaBarco;
    private float capacidadActualBarco;

    public void setIdBarco(String idBarco) {
        this.idBarco = idBarco;
    }
    public String getIdBarco() {
        return idBarco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getEstado() {
        return estado;
    }

    public void setCapacidadMaximaBarco(float cmb) {
        capacidadMaximaBarco = cmb;
    }
    public float getCapacidadMaximaBarco() {
        return capacidadMaximaBarco;
    }

    public void setCapacidadActualBarco(float cab) {
        capacidadActualBarco = cab;
    }
    public float getCapacidadActualBarco() {
        return capacidadActualBarco;
    }

    public void registrarContenedor() {

    }
    public void eliminarContenedor() {

    }
    public void listarContenedores() {

    }
    public void cargarContenedores() {

    }
    public void descargarContenedor() {

    }
    public void actualizarEstado() {

    }
}
