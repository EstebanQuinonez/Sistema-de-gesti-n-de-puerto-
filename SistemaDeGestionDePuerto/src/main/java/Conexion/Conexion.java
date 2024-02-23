
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection conectar;
    
    String usuario = "root";
    String contraseña = "123456";
    String bd = "SistemaDeGestionDePuerto";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
       
    public Connection estableceConexion() {
        try {
            // Imprimir mensaje antes de intentar establecer la conexión
            System.out.println("Intentando establecer la conexión...");

            // Intenta cargar el controlador JDBC y establecer la conexión
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contraseña);

            // Imprimir mensaje después de intentar establecer la conexión
            System.out.println("Conexion establecida correctamente.");

        } catch (ClassNotFoundException | SQLException e) {
            // Imprimir mensaje si hay una excepción
            System.out.println("ERROR: " + e.toString());
        }
        return conectar;
    }

    // Método para cerrar la conexión
    public void cerrarConexion() {
        try {
            if (conectar != null) {
                // Imprimir mensaje antes de intentar cerrar la conexión
                System.out.println("Intentando cerrar la conexión...");

                conectar.close();

                // Imprimir mensaje después de intentar cerrar la conexión
                System.out.println("Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            // Imprimir mensaje si hay una excepción al cerrar la conexión
            System.out.println("ERROR al cerrar la conexión: " + e.toString());
        }
    }
}
