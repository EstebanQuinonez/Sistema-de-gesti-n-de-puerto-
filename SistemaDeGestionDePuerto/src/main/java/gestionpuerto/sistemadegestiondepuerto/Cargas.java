
package gestionpuerto.sistemadegestiondepuerto;


public class Cargas {
    
    private String CodigoPropietario;
    private String NumSerie;
    private String Altura;
    private String PesoNeto;
    private String VolInterno;
    private boolean Estado = false;

    public String getCodigoPropietario() {
        return CodigoPropietario;
    }

    public void setCodigoPropietario(String CodigoPropietario) {
        this.CodigoPropietario = CodigoPropietario;
    }

    public String getNumSerie() {
        return NumSerie;
    }

    public void setNumSerie(String NumSerie) {
        this.NumSerie = NumSerie;
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    public String getPesoNeto() {
        return PesoNeto;
    }

    public void setPesoNeto(String PesoNeto) {
        this.PesoNeto = PesoNeto;
    }

    public String getVolInterno() {
        return VolInterno;
    }

    public void setVolInterno(String VolInterno) {
        this.VolInterno = VolInterno;
    }
    
    public void Desembarco(){
        if(Estado == true){
            System.out.println("Ya se encuentra el contenedor en el puerto");
        }else{
            Estado = true;
            System.out.println("Se realizo el desembarco del container");
    }
    }
    
    
}
