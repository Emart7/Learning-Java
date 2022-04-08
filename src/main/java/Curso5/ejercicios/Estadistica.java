package Curso5.ejercicios;

import java.util.Scanner;

public class Estadistica {

    public static void calcularLaMedia() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de numeros que tienes: ");
        int total = sc.nextInt();
        double arrayValoresMedia[] = new double[total];
        double suma = 0;

        for (int i = 0; i < total; i++) {
            System.out.println("Ingresa el numero " + (i + 1) + ": ");
            double aux = sc.nextDouble();

            arrayValoresMedia[i] = aux;
            suma += aux;
        }

        double media = suma / total;
        System.out.println();
        System.out.printf("La media es %.2f: \n", media);
        System.out.println();
    }

    public static void calcularVarianza() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de valores: ");
        int nCantidad = sc.nextInt();

        double arrayValoresVarianza[] = new double[nCantidad];
        double suma = 0;

        for (int i = 0; i < nCantidad; i++) {
            System.out.println("Ingresa el numero " + (i + 1) + ": ");
            double aux = sc.nextDouble();

            arrayValoresVarianza[i] = aux;
            suma += aux;
        }

        double media = suma / nCantidad;

        double varianzaDeValores = 0;
        for (int x = 0; x < arrayValoresVarianza.length; x++) {
            varianzaDeValores += (Math.pow(arrayValoresVarianza[x] - media, 2) / nCantidad);
//            varianzaDeValores += sumaDiferenciaCuadrada;
        }

        System.out.println();
        System.out.printf("La varianza de los valores es: %.2f", varianzaDeValores);
        System.out.println("\n");
    }

    public static void calcularDesviacionEstandar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la varianza obtenida: ");
        double varianzaDeValores = sc.nextDouble();

        double desviacionEstandar = Math.sqrt(varianzaDeValores);

        System.out.println();
        System.out.printf("La desviacion estandar de la varianza %.2f es:  %.2f ", varianzaDeValores, desviacionEstandar);
    }
}
