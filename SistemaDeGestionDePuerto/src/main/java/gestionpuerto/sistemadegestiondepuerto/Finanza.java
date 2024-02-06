package gestionpuerto.sistemadegestiondepuerto;

public class Finanza {
    private String idFinanza;
    private String idPuerto;
    private float ingresos;
    private float beneficio;

    public void setIdFinanza(String idFinanza) {
        this.idFinanza = idFinanza;
    }
    public String getIdFinanza() {
        return idFinanza;
    }

    public void setIdPuerto(String idPuerto) {
        this.idPuerto = idPuerto;
    }
    public String getIdPuerto() {
        return idPuerto;
    }

    // public void setIngresos(float ingresos) {
    //     this.ingresos = ingresos;
    // }
    public float getIngresos() {
        return ingresos;
    }
    
    // public void setBeneficio(float beneficio) {
    //     this.beneficio = beneficio;
    // }
    public float getBeneficio() {
        return beneficio;
    }

    public void registrarIngreso() {

    }
    public void calcularBeneficio() {

    }
    public void verHistorialIngresos() {

    }
}
