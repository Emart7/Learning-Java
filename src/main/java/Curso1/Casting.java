package Curso1;

public class Casting {

    public static void ejemplosCasting() {
        int alfa = 20;
        float beta = 23.5f;
        beta = alfa;

        alfa = (int) beta;
        alfa = (char) 'b';
        System.out.println(alfa);

        char caracter = (char) alfa;
        System.out.println(caracter);

        int numero = Integer.parseInt("10");//Pasamos de cadena a entero
        String cadena = Integer.toString(23);//Pasamos de entero a cadena
    }
}
