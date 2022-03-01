package Curso4.conceptos;

public class Areas {

    public static void areaCirculo(){
        int radio = 5;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area del circulo es: " + area);
    }

    public static void hallarHipotenusa(){
        int cateto1 = 5;
        int cateto2 = 7;

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("La hipotenusa es: " + hipotenusa);

        System.out.println("La hipotenusa es: " + Math.hypot(5,7));
    }
}
