package Curso4.ejercicios;

/*
Obtén la energía cinética si la masa es m = 12 kg y la velocidad es v = 3 m/s,
imprime el resultado con solo 2 decimales.
*/

public class ejercicio2 {

    public static void energiaCinetica(){
        int m = 12;
        int v = 3;
        Double E = (1.0/2.0) * (m) * Math.pow(v,2);
        System.out.println("La energía cinética es: " + String.format("%.2f",E));
    }
}
