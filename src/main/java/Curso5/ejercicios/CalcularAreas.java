package Curso5.ejercicios;

public class CalcularAreas {

    private static double calcularAreaCuadrado(double lado){
        return lado * lado;
    }

    private static double calcularAreaRectangulo(double base, double altura){
        return base * altura;
    }

    private static double calcularAreaTriangulo(double base, double altura){
        return base * altura / 2;
    }

    public static double calcularAreaCirculo(double radio){
        return ((Math.PI) * Math.pow(radio,2));
    }

}
