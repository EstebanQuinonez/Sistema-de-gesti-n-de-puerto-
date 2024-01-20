
package gestionpuerto.sistemadegestiondepuerto;

import java.util.Scanner;

public class SistemaDeGestionDePuerto {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Opción 1 ");
                    break;
                case 2:
                    System.out.println("Opción 2 ");
                    break;
                case 3:
                    System.out.println("Opción 3 ");
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n--- Menú de Opciones ---");
        System.out.println("1. Realizar tarea 1");
        System.out.println("2. Realizar tarea 2");
        System.out.println("3. Realizar tarea 3");
        System.out.println("4. Salir");
    }
    }

