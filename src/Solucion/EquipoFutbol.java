package Solucion;

import java.util.ArrayList;
import java.util.Scanner;

//Definición de la clase EquipoFutbol
public class EquipoFutbol {
    String nombre;
    String estadio;
    int titulos;
    ArrayList<Jugador> jugadoresTitulares = new ArrayList<>();
    ArrayList<Jugador> jugadoresSuplentes = new ArrayList<>();

    // Método para ingresar la información del equipo
    void ingresarInformacion() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nombre del equipo: ");
        nombre = input.nextLine();
        System.out.print("Estadio del equipo: ");
        estadio = input.nextLine();
        System.out.print("Cantidad de títulos: ");
        titulos = input.nextInt();

        System.out.print("Número de jugadores titulares: ");
        int numTitulares = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numTitulares; i++) {
            System.out.print("Nombre del jugador titular " + (i + 1) + ": ");
            String nombreJugador = input.nextLine();
            System.out.print("Posición del jugador titular " + (i + 1) + ": ");
            String posicionJugador = input.nextLine();
            jugadoresTitulares.add(new Jugador(nombreJugador, posicionJugador));
        }

        System.out.print("Número de jugadores suplentes: ");
        int numSuplentes = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numSuplentes; i++) {
            System.out.print("Nombre del jugador suplente " + (i + 1) + ": ");
            String nombreJugador = input.nextLine();
            System.out.print("Posición del jugador suplente " + (i + 1) + ": ");
            String posicionJugador = input.nextLine();
            jugadoresSuplentes.add(new Jugador(nombreJugador, posicionJugador));
        }
    }
    // Método para generar el reporte básico
    void reporteBasico() {
        System.out.println("Reporte Básico:");
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("Títulos ganados: " + titulos);
        int totalJugadores = jugadoresTitulares.size() + jugadoresSuplentes.size();
        System.out.println("Cantidad total de jugadores: " + totalJugadores);
    }
 // Método para generar el reporte detallado
    void reporteDetallado() {
        System.out.println("Reporte Detallado:");
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("Jugadores Titulares:");
        for (Jugador jugador : jugadoresTitulares) {
            System.out.println("Nombre: " + jugador.nombre + ", Posición: " + jugador.posicion);
        }
        System.out.println("Jugadores Suplentes:");
        for (Jugador jugador : jugadoresSuplentes) {
            System.out.println("Nombre: " + jugador.nombre + ", Posición: " + jugador.posicion);
        }
    }
}