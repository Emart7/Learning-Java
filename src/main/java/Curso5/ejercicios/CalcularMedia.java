package Curso5.ejercicios;

import java.util.Scanner;

public class CalcularMedia {

    public static void hallarLaMedia(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al programa de calcular la media");
        System.out.println("___________________________________________\n");
        System.out.println("Cuantos valores tienes?");
        int cantidad = sc.nextInt();

        double contador = 0;

        for(int x = 0; x < cantidad; x++){
            System.out.println("Ingresa el valor " + (x+1) + ":");
            int aux = sc.nextInt();
            contador += aux;
        }

        double media = contador / cantidad;

        System.out.println("La media es: " + media);
    }
}
