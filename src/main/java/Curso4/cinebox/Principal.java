package Curso4.cinebox;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("_____________________________________________");

        System.out.println("Ciclo while");
        int i = 0;
        int duracion = 10;

        while (i <= duracion) {
            if (i < 3) {
                System.out.println("Reproducion Intro, segundo = " + i);
            } else if (i < 7) {
                System.out.println("Reproducion Pelicula, segundo = " + i);
            } else {
                System.out.println("Reproducion Creditos, segundo = " + i);
            }
            i++;
        }

        System.out.println("_____________________________________________");
        System.out.println("Ciclo for");

        for (int j = 0; j < duracion; j++) {
            if (j < 3) {
                System.out.println("Reproducion Intro, segundo = " + j);
            } else if (j < 7) {
                System.out.println("Reproducion Pelicula, segundo = " + j);
            } else {
                System.out.println("Reproducion Creditos, segundo = " + j);
            }
        }

        System.out.println("_____________________________________________");
        System.out.println("Ciclo do-while");

        int k = 0;
        do {
            if (k < 3) {
                System.out.println("Reproducion Intro, segundo = " + k);
            } else if (k < 7) {
                System.out.println("Reproducion Pelicula, segundo = " + k);
            } else {
                System.out.println("Reproducion Creditos, segundo = " + k);
            }
            k++;
        } while (k <= 10);


        System.out.println("_____________________________________________");
        System.out.println("Ciclo switch");

        int dayOfWeek = entrada.nextInt();

        switch (dayOfWeek) {
            case 0:
                System.out.println("Es lunes de comedia.");
                break;
            case 1:
                System.out.println("Es martes de drama.");
                break;
            case 2:
                System.out.println("Es miercoles de accion.");
                break;
            case 3:
                System.out.println("Es jueves de animadas.");
                break;
            case 4:
                System.out.println("Es viernes de terror.");
                break;
            case 5:
                System.out.println("Es sabado de documentales.");
                break;
            case 6:
                System.out.println("Es domingo de comodin.");
                break;
            default:
                System.out.println("No es un dia de la semana.");

        }
    }
}
