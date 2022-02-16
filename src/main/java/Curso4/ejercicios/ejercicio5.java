package Curso4.ejercicios;

/*
Crea un programa que te pida una cantidad en miligramos para una poción
multijugos, el valor debe ser de tipo entero, si el valor es mayor a 100 imprime
“¡Felicidades, es una buena poción!”, de lo contrario imprime “La poción es
mediocre, sangre sucia inmunda”.
*/

import java.util.Scanner;

public class ejercicio5 {

    public static void indicarPocion() {
        Scanner entrada = new Scanner(System.in);
        int miligramos;
        System.out.println("Introduce la cantidad de miligramos: ");
        miligramos = entrada.nextInt();

        if (miligramos > 100) {
            System.out.println("¡Felicidades, es una buena poción!");
        }
        else {
            System.out.println("La poción es mediocre, sangre sucia inmunda");
        }

    }
}
