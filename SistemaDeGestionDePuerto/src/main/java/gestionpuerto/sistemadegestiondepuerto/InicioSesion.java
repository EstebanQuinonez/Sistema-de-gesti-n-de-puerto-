package gestionpuerto.sistemadegestiondepuerto;

import java.util.Scanner;

public class InicioSesion {
    private String usuario;
    private String contraseña;
    private Scanner scanner;
    private boolean resp;

    public InicioSesion(Scanner scanner) {
        this.scanner = scanner;
    }

  
        public boolean iniciarSesion(){

            System.out.println("Iniar Sesion");
            System.out.println("Usuario: ");
            usuario=scanner.nextLine();
            System.out.println("Contraseña: ");
            contraseña=scanner.nextLine();
               if (usuario.equals("Esteban") && contraseña.equals("123")) {
                   resp = true;
               } else {
                   resp = false;
               }

            return resp; 
        }

    public String getUsuario() {
        return usuario;
    }
 
    
}
