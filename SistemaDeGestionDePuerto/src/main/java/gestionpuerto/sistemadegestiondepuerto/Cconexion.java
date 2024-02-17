package gestionpuerto.sistemadegestiondepuerto;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Cconexion {
    Connection conectar = null;
    String usuario = "root";
    String contraseña = "123456";
    String bd = "SistemaDeGestionDePuerto";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public Connection establecerConexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contraseña);
            return conectar;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se conectó a la base de datos, error " + e.toString());
            return null;
        }
    }
}
