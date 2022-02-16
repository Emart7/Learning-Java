package Curso4.ejercicios;

import java.util.Arrays;

/*
haz un Arreglo de String de títulos de películas, imprime el título de la película con
el título más largo. Por ejemplo si tenemos un arreglo con los valores:
{“Jumanji”, “Toy Story”, “Pulp Fiction”, “Batman: El caballero de la noche”, “Kill Bill”}
Debería imprimir “Batman: El caballero de la noche”.
Imprime el índice del título más largo, para el ejemplo anterior,
debería imprimir el 3, porque es el índice de “Batman: El caballero de la noche”
 */

public class ejercicio9 {
    public static void stringMasLargo() {
        String[] titulos = {"Jumanji", "Toy Story", "Pulp Fiction", "Batman: El caballero de la noche", "Kill Bill"};
        int largo = 0;
        String titulo = "";
        for (String s : titulos) {
            if (s.length() > largo) {
                largo = s.length();
                titulo = s;
            }
        }
        System.out.println(titulo);
        System.out.println(Arrays.asList(titulos).indexOf(titulo));
    }
}

