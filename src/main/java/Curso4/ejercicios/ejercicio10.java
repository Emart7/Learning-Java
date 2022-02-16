package Curso4.ejercicios;

import java.util.Scanner;

public class ejercicio10 {
    public static void contarNumeroPares() {

        boolean inicio = true;

        while (inicio) {

            Scanner tecladoUsuario = new Scanner(System.in);
            System.out.println("Introduce un número entero mayor a cero, hasta donde contar numeros pares: ");
            int numero = tecladoUsuario.nextInt();

            if (numero <= 0) {
                System.out.println("Ingresa un numero positivo o mayor a cero: ");
            } else {
                for (int i = 0; i <= numero; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }

            }
            System.out.println("¿Desea continuar? (s/n)");
            if (tecladoUsuario.next().equals("n")) {
                inicio = false;
            }
        }

    }

}
