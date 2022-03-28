package Curso5.ejercicios;

public class ConversorMedida {

    public static double deCentimetrosAPulgadas(double centimetrosAConvertir) {

        final double centimetros;
        double pulgadas;

        centimetros = 2.54;
        pulgadas = centimetrosAConvertir / centimetros;

        return pulgadas;
    }

    public static double dePulgadasACentimetros(double pulgadasAConvertir) {

        final double centimetros;
        double resultadoCM;

        centimetros = 2.54;
        resultadoCM = pulgadasAConvertir * centimetros;

        return resultadoCM;
    }

}
