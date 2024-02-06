package gestionpuerto.sistemadegestiondepuerto;

public class Contenedor {
    private String idContenedor;
    private String numeroIdentificador;
    private float peso;
    private String tipoCarga;
    private String estado;
    private float capacidadMaximaContenedor;
    private float capacidadActualContenedor;

    public void setIdContenedor(String idContenedor) {
        this.idContenedor = idContenedor;
    }
    public String getIdContenedor() {
        return idContenedor;
    }

    public void setNumeroIdentificador(String numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }
    public String getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getPeso() {
        return peso;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }
    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getEstado() {
        return estado;
    }

    public void setCapacidadMaximaContenedor(float cmc) {
        this.capacidadMaximaContenedor = cmc;
    }
    public float getCapacidadMaximaContenedor() {
        return capacidadMaximaContenedor;
    }

    public void setCapacidadActualContenedor(float cac) {
        this.capacidadActualContenedor = cac;
    }
    public float getCapacidadActualContenedor() {
        return capacidadActualContenedor;
    }

    public void cargarMercancia() {

    }
    public void descargarMercancia() {

    }
    public void actualizarEstado() {

    }
    
}
