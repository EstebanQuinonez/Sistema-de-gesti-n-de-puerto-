package gestionpuerto.sistemadegestiondepuerto;

public class Puerto {
    private String idPuerto;
    private String nombre;
    private String pais;
    private String ciudad;
    private float capacidadMaximaPuerto;
    private float capacidadActualPuerto;

    public void setIdPuerto(String idPuerto) {
        this.idPuerto = idPuerto;
    }
    public String getIdPuerto() {
        return idPuerto;
    } 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    } 

    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getPais() {
        return pais;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getCiudad() {
        return ciudad;
    }

    public void setCapacidadMaximaPuerto(float cmp) {
        capacidadMaximaPuerto = cmp;
    }
    public float getCapacidadMaximaPuerto() {
        return capacidadMaximaPuerto;
    }

    public void setCapacidadActualPuerto(float cap) {
        capacidadActualPuerto = cap;
    }
    public float getCapacidadActualBarco() {
        return capacidadActualPuerto;
    }
    
    public void atracarBarco() {

    }
    public void zarparBarco() {

    }
    public void registrarPuerto() {

    }
    public void listarPuertos() {

    }
    public void eliminarPuerto() {

    }
    public void registrarBarco() {
        
    }
    public void eliminarBarco() {
        
    }
    public void listarBarcos() {

    }
}
