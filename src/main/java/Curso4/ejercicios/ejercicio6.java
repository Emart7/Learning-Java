package Curso4.ejercicios;

/*
Escribe un programa que te diga si un carro de Uber puede iniciar su recorrido. Para
esto se necesitan dos cosas, que el conductor esté cerca y que esté disponible, el
programa te pedirá dos valores, la distancia del conductor en kilómetros y su
disponibilidad, donde false = no disponible y true = disponible, según los datos que
insertes imprime lo siguiente:
➢ Si la distancia es menor o igual a 0.5 km y el conductor está disponible,
imprime “Listo para iniciar recorrido”
➢ Si la distancia es menor o igual a 0.5 km y el conductor NO está disponible,
imprime, “Conductor cercano, pero no disponible”
➢ Si la distancia es mayor a 0.5 km y el conductor está disponible, imprime,
“Conductor disponible pero muy lejos, aplicarán tarifas más altas”
➢ Si la distancia es mayor a 0.5 km y el conductor NO está disponible, imprime,
“No hay conductores disponibles”
➢ Usa if-else para esto
➢ Para negar una validación debes usar el símbolo !, por ejemplo if
(!isAvailable)
➢ No olvides imprimir las instrucciones antes de pedir las variables de entrada
*/

import java.util.Scanner;

public class ejercicio6 {

    public static void calcularDistanciaUber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la distancia del conductor en kilómetros");
        double distance = sc.nextDouble();
        System.out.println("Escribe si el conductor está disponible (true/false)");
        boolean isAvailable = sc.nextBoolean();
        if (distance <= 0.5 && isAvailable) {
            System.out.println("Listo para iniciar recorrido");
        } else if (distance <= 0.5 && !isAvailable) {
            System.out.println("Conductor cercano, pero no disponible");
        } else if (distance > 0.5 && isAvailable) {
            System.out.println("Conductor disponible pero muy lejos, aplicarán tarifas más altas");
        } else {
            System.out.println("No hay conductores disponibles");
        }
    }
}
