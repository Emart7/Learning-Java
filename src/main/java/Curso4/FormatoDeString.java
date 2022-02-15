package Curso4;

public class FormatoDeString {

    public static void formatoString(){
        //Formato de Stings
        int a = 3;
        double b = 12.40;

        System.out.println("El valor de a es: " + a);
        System.out.println(String.format("El valor de a es: %d", a));

        System.out.println("El valor de b es: " + b);
        System.out.println(String.format("El valor de b es: %.2f", b));
    }
}
