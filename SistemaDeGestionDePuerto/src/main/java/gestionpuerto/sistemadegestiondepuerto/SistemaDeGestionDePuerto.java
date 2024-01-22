
package gestionpuerto.sistemadegestiondepuerto;

import java.util.Scanner;

public class SistemaDeGestionDePuerto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InicioSesion inicioSesion;

        do {
            inicioSesion = new InicioSesion(scanner); 
            if (inicioSesion.iniciarSesion()) {
                System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + inicioSesion.getUsuario() + "!");

                int opcion;
                do {
                    // Menú principal
                    mostrarMenu();
                    System.out.println("Ingresar una opción: ");
                    opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Opción 1");
                            break;
                        case 2:
                            System.out.println("Opción 2");
                            break;
                        case 3:
                            System.out.println("Opción 3");
                            break;
                        case 4:
                            System.out.println("Opción 4");
                            break;
                        case 5:
                            System.out.println("Opción 5");
                            break;
                        case 6:
                            System.out.println("Cerrando sesión. ¡Hasta luego, " + inicioSesion.getUsuario() + "!");
                            break;
                        default:
                            System.out.println("Opción Incorrecta, intente de nuevo");
                    }
                } while (opcion != 6);
            } else {
                System.out.println("Usuario y/o contraseña incorrecta, intente nuevamente....");
            }

        } while (true); // Sigue solicitando credenciales mientras no haya iniciado sesión
    }


    public static void mostrarMenu() {
        System.out.println("\n--- Menú de Opciones ---");
        System.out.println("1. Registro y Gestión de Buques");
        System.out.println("2. Registro y Gestión de Cargas");
        System.out.println("3. Planificación de Atraques");
        System.out.println("4. Gestión de Empleados");
        System.out.println("5. Facturación y Finanzas");
        System.out.println("6. Salir del Sistema");
    }
    }

