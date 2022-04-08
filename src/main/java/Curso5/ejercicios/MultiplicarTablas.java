package Curso5.ejercicios;

import java.util.Scanner;

public class MultiplicarTablas {

    public static void multiplicarTablas(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de tablas a multiplicar: ");
        int tablaElegida = sc.nextInt();

        System.out.println("\nHas elegido la tabla del " + tablaElegida +", la cual es: \n");
        for (int i = 1; i <= 10; i++){
            System.out.println(tablaElegida + " x " + i + " = " +  (i * tablaElegida));
        }
        System.out.println("\nFin del programa");

    }
}
