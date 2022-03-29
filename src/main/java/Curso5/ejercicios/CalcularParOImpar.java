package Curso5.ejercicios;

import java.util.Scanner;

public class CalcularParOImpar {

    public static void calcularNumero(){

        final int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero entero a verificar: ");
        numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }
}
