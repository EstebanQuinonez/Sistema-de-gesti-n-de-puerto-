
package Clases;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import CRUDusuarios.CRUDadmin;

public class Usuario {
    int idUsuario;
    String nombre;
    String apellido;
    String tipoUsuario;
    String contrasenia;

    public Usuario(int idUsuario, String nombre, String apellido, String tipoUsuario, String contrasenia) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoUsuario = tipoUsuario;
        this.contrasenia = contrasenia;
    }

    public Usuario(int idUsuario, String contrasenia) {
        this.idUsuario = idUsuario;
        this.contrasenia = contrasenia;
    }

    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    public void iniciarPrograma() {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("------ Menú Inicial ------");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Salir del Programa");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el entero

            switch (opcion) {
                case 1:
                    ingresandoSistema();
                    break;
                case 2:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0); // Termina la ejecución del programa
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 2);
    }
    
    private void ingresandoSistema(){
        Scanner scanner = new Scanner(System.in);
        
        boolean sistema = false;
        
         do {
            System.out.print("Ingrese id de usuario: ");
            int idUsuario = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Ingrese contraseña: ");
            String contrasenia = scanner.nextLine();
            
            validarUsuario(idUsuario, contrasenia);
            
            this.setIdUsuario(idUsuario);
            this.setContrasenia(contrasenia);          
        } while (!sistema);
    }
       
    private void validarUsuario(int idUsuario,String contrasenia){              
         try {
            ResultSet rs = null;
            PreparedStatement ps = null;

            Conexion objetoConexion = new Conexion();

            // Establecer la conexión
            Connection conexion = objetoConexion.estableceConexion();

            if (conexion != null) {               
                String consulta = "select * from usuario where idUsuario = ? and Contraseña = ?";
                ps = conexion.prepareStatement(consulta);

                ps.setInt(1, idUsuario);
                ps.setString(2, contrasenia);

                rs = ps.executeQuery();

                if (rs.next()) {
                    String tipoUsuario = rs.getString("TipoDeUsuario");
                    System.out.println("USUARIO CONFIRMADO");

                    switch (tipoUsuario) {
                        case "OperadorAtraque":
                            menuAtraque();
                            break;
                        case "OperadorEmbarque":
                            menuEmbarqueDesembarque();
                            break;
                        case "OperadorAlmacenamiento":
                            menuAlmacenamiento();
                            break;
                        case "AdministradorSistema":
                            menuAdministrador();
                            break;
                    }
                    iniciarPrograma();
                } else {
                    System.out.println("USUARIO INEXISTENTE");
                    System.out.println("Intente nuevamente.");
                    iniciarPrograma();
                }          
            } else {
                System.out.println("No se pudo establecer la conexión.");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.toString());
            e.printStackTrace();  // Imprimir la traza completa del error
        }
    }
    
    public void menuAdministrador(){
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        do {
            System.out.println("------ Menú de Operaciones en Puertos Marítimos ------");
            System.out.println("1. Gestionar usuarios");
            System.out.println("2. Registrar barco");
            System.out.println("3. Registrar contenedars de salida");
            System.out.println("4. Gestionar muelles");
            System.out.println("5. Gestionar zonas de almacenamiento");
            System.out.println("6. Visualizar reportes");
            System.out.println("7. Gestionar salida de barco");
            System.out.println("0. Cerrar sesion");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el entero

            switch (opcion) {
                case 1:
                    System.out.println("Gestionar usuarios");
                    CRUDadmin c = new CRUDadmin();
                    c.setVisible(true);
                    break;
                case 2:
                    System.out.println("Registrar barco");
                    break;
                case 3:
                    System.out.println("Registrar contenedars de salida");
                    break;
                case 4:
                    System.out.println("Gestionar muelles");
                    break;
                case 5:
                    System.out.println("Gestionar zonas de almacenamiento");
                    break;
                case 6:
                    System.out.println("Visualizar reportes");
                    break;
                case 7:
                    System.out.println("Gestionar salida de barco");
                    break;
                case 0:
                    System.out.println("Regresando al login.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    }
    
    public void menuAtraque(){
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        do {
            System.out.println("------ Menú de Operaciones en Puertos Marítimos ------");
            System.out.println("1. Visualizar info barco");
            System.out.println("2. Gestionar disponibilidad muelle");
            System.out.println("3. Generar reporte");           
            System.out.println("0. Cerrar sesion");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el entero

            switch (opcion) {
                case 1:
                    System.out.println("Visualizar info barco");
                    break;
                case 2:
                    System.out.println("Gestionar disponibilidad muelle");
                    break;
                case 3:
                    System.out.println("Generar reporte");
                    break;               
                case 0:
                    System.out.println("Regresando al login.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    }
    
    public void menuEmbarqueDesembarque(){
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        do {
            System.out.println("------ Menú de Operaciones en Puertos Marítimos ------");
            System.out.println("1. Gestionar Laytime");
            System.out.println("2. Embarcar contenedores");
            System.out.println("3. Desembarcar contenedores");
            System.out.println("4. Generar Reporte de operacion");
            System.out.println("0. Cerrar sesion");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el entero

            switch (opcion) {
                case 1:
                    System.out.println("gestionar laytime.");
                    break;
                case 2:
                    System.out.println("embarcar contenedores");
                    break;
                case 3:
                    System.out.println("desembarcar contenedores");
                    break;
                case 4:
                    System.out.println("Generar Reporte de operacion");
                    break;
                case 0:
                    System.out.println("Regresando al login.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    }
    
    public void menuAlmacenamiento(){
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        do {
            System.out.println("------ Menú de Operaciones en Puertos Marítimos ------");
            System.out.println("1. Visualizar validez de contenedores de importacion");
            System.out.println("2. Verificar validez de contenedores de exportacion");
            System.out.println("3. Gestionar almacen");
            System.out.println("4. Generar reporte");
            System.out.println("0. Cerrar sesion");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el entero

            switch (opcion) {
                case 1:
                    System.out.println("Visualizar validez de contenedores de importacion");
                    break;
                case 2:
                    System.out.println("Verificar validez de contenedores de exportacion");
                    break;
                case 3:
                    System.out.println("Gestionar almacen");
                    break;
                case 4:
                    System.out.println("Generar reporte");
                    break;
                case 0:
                    System.out.println("Regresando al login.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    }  
}
