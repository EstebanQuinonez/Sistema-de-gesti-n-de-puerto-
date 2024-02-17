package gestionpuerto.sistemadegestiondepuerto;
import java.sql.Connection;

public class SistemaDeGestionDePuerto {

    public static void main(String[] args) {
        Cconexion conexion = new Cconexion();
        Connection con = conexion.establecerConexion();
        if (con != null) {
            System.out.println("Conexión establecida correctamente.");
        } else {
            System.out.println("Error al establecer conexión.");
        }
    }
}
