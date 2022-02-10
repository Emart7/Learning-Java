package Curso3;
import javax.swing.JOptionPane;

public class EntradaDatos {


    public static void main(String[] args) {
        //Declarar variables
        int numeroEntero;
        String cadenaCaracteres;

        //Inicializar variables - verificar su valor inicial
        numeroEntero = 10;
        cadenaCaracteres = "Hola";
        System.out.println("El numero entero es: " + numeroEntero);
        System.out.println("La cadena de caracteres es: " + cadenaCaracteres);

        //Pedir datos al usuario - actualizar variables
        numeroEntero = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un numero entero"));
        cadenaCaracteres = JOptionPane.showInputDialog(null,"Introduce una cadena de caracteres");
        System.out.println("El numero entero es: " + numeroEntero);
        System.out.println("La cadena de caracteres es: " + cadenaCaracteres);

        int cociente = 15/4;
        System.out.println("El cociente es: " + cociente);
    }
}
