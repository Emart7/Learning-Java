package Curso5;

import Curso5.ejercicios.CalcularAreas;
import Curso5.ejercicios.ConversorDivisa;
import Curso5.ejercicios.ConversorMedida;

public class Main {
    public static void main(String[] args) {

        System.out.println(ConversorMedida.deCentimetrosAPulgadas(5) + " pulgadas");
        System.out.println(ConversorMedida.dePulgadasACentimetros(5) + " centrimetros");

        System.out.println(ConversorDivisa.deDolarAPesos(5) + " pesos");
        System.out.println(ConversorDivisa.dePesosADolar(18915.7) + " dolares");

        System.out.println(CalcularAreas.calcularAreaCirculo(6) + " metros cuadrados");
    }
}
