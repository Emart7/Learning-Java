package Curso4.cinebox;

import java.util.Random;

public class Metodo {
    public static void main(String[] args) {
        String[] titleArray = new String[]{"La naranja mecanica", "Buscando a Nemo", "Mision Imposible", "Star Wars"};


        String title = play(titleArray, 1);
        String title2 = play(titleArray);
        System.out.println();
        pause(title);
        System.out.println();
        pause(title2);
    }

    public static String play(String[] titleArray, int index) {
        if (index < titleArray.length) {
            String title = titleArray[index];
            for (int i = 0; i < 1; i++) {
                System.out.println("Playing movie..." + title);
            }
            return title;
        } else {
            System.out.println("Index is too big");
            return "";
        }
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

    public static void pause(String title) {
        if (title.isEmpty()) {
            System.out.println("No movie playing.");
        } else {

            System.out.println("Movie paused...");
        }
    }
}
