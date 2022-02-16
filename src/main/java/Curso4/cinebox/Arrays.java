package Curso4.cinebox;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        System.out.println("Escribe el numero de episodio que quieras saber su duracion: ");
        Scanner entrada = new Scanner(System.in);
        int numberEpisodio = entrada.nextInt();
        numberEpisodio--;

        int[] episodeDurationArray = new int[]{25, 27, 24, 22, 28};

        if (numberEpisodio >= 0 && numberEpisodio < 5) {
            int episodeDuration = episodeDurationArray[numberEpisodio];
            System.out.println("El episodio dura: " + episodeDuration + " minutos");
        } else {
            System.out.println("Error, El episodio no existe");
        }


        //recorrer un array y sumar sus valores
        int seasonDuration = 0;

        for (int j : episodeDurationArray) {
            seasonDuration += j;
        }
        System.out.println("La temporada dura: " + seasonDuration + " minutos");


        //Recorrer arreglo de Strings

        String[] movieTitleArray = new String[]{"Up", "Titanic", "Aladdin", "Pepe el Toro", "Avengers", "Matrix"};

        for (String movieTitle : movieTitleArray) {
            if (!movieTitle.contains("i")) {
                System.out.println(movieTitle);
            }

        }
    }
}
