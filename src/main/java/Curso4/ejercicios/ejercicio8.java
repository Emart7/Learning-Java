package Curso4.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que imprima “¿Cómo es el clima de hoy?”, dependiendo del
número que insertes te imprima los siguientes valores
➢ 1 = “Soleado”
➢ 2 = “Nublado”
➢ 3 = “Lluvioso”
➢ 4 = “Tormentoso”
➢ 5 = “Nevado”
Si insertas cualquier otro valor debe imprimir “Pregúntale a Google”
Recomendación: Usa Switch.
*/

public class ejercicio8 {
    public static void menuClima() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numero 0 para salir del programa.");
        System.out.println("Introduce un número, segun tu preferencia sobre el dia de hoy: ");
        System.out.println();
        System.out.println("1. Soleado");
        System.out.println("2. Nublado");
        System.out.println("3. Lluvioso");
        System.out.println("4. Tormentoso");
        System.out.println("5. Nevado");
        System.out.println();

        System.out.println("Ingresa tu opcion: ");
        int opcionEscogida = entrada.nextInt();

        switch (opcionEscogida) {
            case 0:
                System.out.println("Fin del programa.");
                break;
            case 1:
                System.out.println("Soleado");
                break;
            case 2:
                System.out.println("Nublado");
                break;
            case 3:
                System.out.println("Lluvioso");
                break;
            case 4:
                System.out.println("Tormentoso");
                break;
            case 5:
                System.out.println("Nevado");
                break;
            default:
                System.out.println("Preguntale a Google.");
        }

    }
}
