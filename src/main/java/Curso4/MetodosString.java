package Curso4;

public class MetodosString {

    public static void metodosString(){

        String saludo = "Probando, esto es un saludo";
        //Cantidad de caracteres del String
        int longitudString = saludo.length();

        //Verificar si el String es vacio
        boolean stringVacio = saludo.isEmpty();//En este caso es false

        //Identificar el caracter en la posicion indicada
        char myChar = saludo.charAt(2);

        ///Saber si un String contiene una palabra
        boolean contieneString = saludo.contains("or");

        //Muestra que caracteres hay en un rango de posiciones
        String cualesString = saludo.substring(1,6);

        //Cambia una parte del String por otros caracteres
        String reemplazoString = saludo.replace("o", "0");
    }
}
