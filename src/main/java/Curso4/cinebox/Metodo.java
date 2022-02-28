package Curso4.cinebox;

import java.util.Random;

public class Metodo {
    public static void main(String[] args) {
        String[] titleArray = new String[]{"La naranja mecanica", "Buscando a Nemo", "Mision Imposible", "Star Wars"};


        String title2 = play(titleArray);
        System.out.println();
        System.out.println();
    }

    public static String play(String[] titleArray) {
        Random ramdom = new Random();
        int index = ramdom.nextInt(titleArray.length - 1);

        String title = titleArray[index];
        for (int i = 0; i < 1; i++) {
            System.out.println("Playing movie..." + title);
        }
        return title;
    }

}
