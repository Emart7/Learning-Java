package Curso5.ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeerDatos {

    public static int leerEntero( ) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        numero = teclado.nextInt();
        return numero;
    }

    public static double leerDecimal( ) {
        double numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número decimal: ");
        numero = teclado.nextDouble();
        return numero;
    }
}
