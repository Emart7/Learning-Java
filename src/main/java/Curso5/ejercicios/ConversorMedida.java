package Curso5.ejercicios;

import java.util.Scanner;

public class ConversorMedida {

    public static void deCentimetrosAPulgadas() {

        final double centimetros;
        double pulgadas;
        double centimetrosAConvertir;

        Scanner teclado = new Scanner(System.in);
        System.out.println("____________________________________________________________");
        System.out.println("CALCULADORA DE CONVERSIÓN DE MEDIDAS - CENTIMETROS A PULGADAS");
        System.out.println("____________________________________________________________\n");
        System.out.println("Introduce la cantidad de centimetros a convertir: ");
        centimetrosAConvertir = teclado.nextDouble();

        centimetros = 2.54;
        pulgadas = centimetrosAConvertir / centimetros;

        System.out.println();
        System.out.printf("%.2f centimetros son %.2f pulgadas\n", centimetrosAConvertir, pulgadas);
    }

    public static void dePulgadasACentimetros() {

        final double centimetros;
        double resultadoCM;
        double pulgadasAConvertir;

        Scanner teclado = new Scanner(System.in);
        System.out.println("____________________________________________________________");
        System.out.println("CALCULADORA DE CONVERSIÓN DE MEDIDAS - PULGADAS A CENTIMETROS");
        System.out.println("____________________________________________________________\n");
        System.out.println("Introduce la cantidad de pulgadas a convertir: ");
        pulgadasAConvertir = teclado.nextDouble();

        centimetros = 2.54;
        resultadoCM = pulgadasAConvertir * centimetros;

        System.out.println();
        System.out.printf("%.2f pulgadas son %.2f centimetros\n", pulgadasAConvertir, resultadoCM);
    }

}
