package Solucion;

import java.util.Scanner;
//Clase principal (contiene el método main)
public class Main {
    public static void main(String[] args) {
        EquipoFutbol equipo = new EquipoFutbol();
        equipo.ingresarInformacion();

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nOpciones de reporte:");
            System.out.println("1. Reporte Básico");
            System.out.println("2. Reporte Detallado");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    equipo.reporteBasico();
                    break;
                case 2:
                    equipo.reporteDetallado();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }
}
