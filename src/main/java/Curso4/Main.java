package Curso4;

import Curso4.cinebox.movie.Movie;

public class Main {

    public static void main(String[] args) {
//        DatosPrimitivos.datosPrimitivos();
//        System.out.println();
//        FormatoDeString.formatoString();
//        System.out.println();
//        MetodosString.metodosString();
//        System.out.println();
//        Areas.areaCirculo();
//        System.out.println();
//        Areas.hallarHipotenusa();
//        System.out.println();
//        ejercicio1.volumenRectangulo();
//        System.out.println();
//        ejercicio2.energiaCinetica();
//        System.out.println();
//        ejercicio4.calcularPromedioCliente();
//        System.out.println();


        //Exercises with class Movie
        Movie otherHouse = new Movie();
        Movie toyStory = new Movie("Toy Story", "Animation", 95);
        Movie starWars = new Movie("StarWars", "Fiction", 120);
        Movie backToTheFuture = new Movie("Back To The Future", "Fiction", 80);

        starWars.play();
        starWars.pause();
        toyStory.play();

        int toyStoryTotalFrames = toyStory.getTotalFrames();

        System.out.println("Total frames: " + toyStoryTotalFrames);
    }
}
