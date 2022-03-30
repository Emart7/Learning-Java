package Curso5.ejercicios;

import java.util.Scanner;

public class ClasificarNotas {

    public static void cualidadNota(){
        double nota;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota: ");
        nota = sc.nextDouble();
        System.out.println();

        if (nota < 6){
            System.out.println("Te falta esforzarte mas.");
        } else if(nota == 6 || nota < 7){
            System.out.println("De panzazo.");
        } else if(nota == 7 || nota < 8){
            System.out.println("Echale mas puch.");
        } else if(nota == 8 || nota < 9){
            System.out.println("Bien, puedes mejorar.");
        } else if(nota == 9 || nota < 10){
            System.out.println("Muy bien, te falta poco.");
        } else if(nota == 10){
            System.out.println("Excelente.");
        } else {
            System.out.println("No has introducido una nota valida.");
        }

    }
}
