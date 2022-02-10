package Curso3.ControlDeFlujos;

import javax.swing.*;

public class ClaseDoWhile {

    public static void IndicarSeleccionMenu() {
        //Do While
        //Mostrar una salida de datos dependiendo del numero seleccionado por el usuario

        int numero;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero del 1 al 5: "));
            switch (numero) {
                case 1:
                    System.out.println("Hola Usuario!");
                    System.out.println("Has seleccionado el numero 1.");
                    break;
                case 2:
                    System.out.println("Hola Usuario!");
                    System.out.println("Has seleccionado el numero 2.");
                    break;
                case 3:
                    System.out.println("Hola Usuario!");
                    System.out.println("Has seleccionado el numero 3.");
                    break;
                case 4:
                    System.out.println("Hola Usuario!");
                    System.out.println("Has seleccionado el numero 4.");
                    break;
                case 5:
                    System.out.println("Hola Usuario!");
                    System.out.println("Has seleccionado el numero 5.");
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("El numero ingresado no esta dentro del rango.");
            }
        } while (numero != 5);
    }
}
