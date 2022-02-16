package Curso4;

public class MetodosString {

    public static void metodosString(){

        String saludo = "Probando, esto es un saludo";
        System.out.println(saludo);
        System.out.println();

        //Cantidad de caracteres del String
        int longitudString = saludo.length();
        System.out.println("Implementando .length " + longitudString);

        //Verificar si el String es vacio
        boolean stringVacio = saludo.isEmpty();//En este caso es false
        System.out.println("Implementando .isEmpy " + saludo.isEmpty());

        //Identificar el caracter en la posicion indicada
        char myChar = saludo.charAt(2);
        System.out.println("Implementando .charAt " + myChar);

        ///Saber si un String contiene una palabra
        boolean contieneString = saludo.contains("or");
        System.out.println("Implementando .contains " + contieneString);

        //Muestra que caracteres hay en un rango de posiciones
        String cualesString = saludo.substring(1,6);
        System.out.println("Implementando .substring " + cualesString);

        //Cambia una parte del String por otros caracteres
        String reemplazoString = saludo.replace("o", "0");
        System.out.println("Implementando .replace " + reemplazoString);
    }
}
