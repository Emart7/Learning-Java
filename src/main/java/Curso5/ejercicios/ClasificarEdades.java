package Curso5.ejercicios;

import java.util.Scanner;

public class ClasificarEdades {

    public static void caracteristicaEdad(){
        int edad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        edad = sc.nextInt();
        System.out.println();

        if(edad <= 10){
            System.out.println("Eres un niño.");
        } else if(edad >= 11 && edad <= 17){
            System.out.println("Eres un adolescente.");
        } else if(edad >= 18 && edad <= 30){
            System.out.println("Eres adulto.");
        } else if (edad >= 31 && edad <= 80){
            System.out.println("Eres mayor.");
        } else{
            System.out.println("Valor no reconocido o fuera del rango...");
        }
    }
}
