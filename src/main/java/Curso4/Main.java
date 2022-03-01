package Curso4;

import Curso4.cinebox.movie.Movie;
import Curso4.cinebox.series.Series;

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

        otherHouse.setTitle("Finding Nemo");
        otherHouse.setGender("childish");
        otherHouse.setWonOscar(true);

        Series theBigBangTheory = new Series();
        theBigBangTheory.setTitle("The Big Bang Theory");
        theBigBangTheory.setGender("comedy");
        theBigBangTheory.setEpisodeDuration(45);
        theBigBangTheory.setTotalEpisodes(10);
        theBigBangTheory.setTotalSeasons(5);

        System.out.println(otherHouse.getTitle());

        System.out.println(otherHouse);
        System.out.println(theBigBangTheory);

        theBigBangTheory.play();
        theBigBangTheory.pause();
        otherHouse.play();
        otherHouse.pause();

    }
}
