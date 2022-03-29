package Curso5.ejercicios;

import java.util.Scanner;

public class ConversorDivisa {

    public static void deDolarAPesos() {

        final double dolar;
        double peso;
        double dolaresAConvertir;

        Scanner sc = new Scanner(System.in);
        System.out.println("____________________________________________________________");
        System.out.println("CALCULADORA DE CONVERSIÓN DE DIVISAS - DOLARES A PESOS");
        System.out.println("____________________________________________________________\n");
        System.out.println("Ingrese la cantidad de dolares $ a convertir: ");
        dolaresAConvertir = sc.nextDouble();

        dolar = 3783.14;
        peso = dolaresAConvertir * dolar;

        System.out.println();
        System.out.printf("$%.2f dolares son $%.2f pesos\n", dolaresAConvertir, peso);

    }

    public static void dePesosADolar() {

        final double dolar;
        double resultadoDolares;
        double pesosAConvertir;

        Scanner sc = new Scanner(System.in);
        System.out.println("____________________________________________________________");
        System.out.println("CALCULADORA DE CONVERSIÓN DE DIVISAS - PESOS A DOLARES");
        System.out.println("____________________________________________________________\n");
        System.out.println("Ingrese la cantidad de pesos $ a convertir: ");
        pesosAConvertir = sc.nextDouble();

        dolar = 3783.14;
        resultadoDolares = pesosAConvertir / dolar;

        System.out.println();
        System.out.printf("$%.2f pesos son $%.2f dolares\n", pesosAConvertir, resultadoDolares);

    }
}
