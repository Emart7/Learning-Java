package Curso5.ejercicios;

public class ConversorDivisa {

    public static double deDolarAPesos(double dolaresACOnvertir) {
        final double dolar;
        double peso;

        dolar = 3783.14;
        peso = dolaresACOnvertir * dolar;

        return peso;
    }

    public static double dePesosADolar(double pesosACOnvertir) {
        final double dolar;
        double resultadoDolar;

        dolar = 3783.14;
        resultadoDolar = pesosACOnvertir / dolar;

        return resultadoDolar;
    }
}
