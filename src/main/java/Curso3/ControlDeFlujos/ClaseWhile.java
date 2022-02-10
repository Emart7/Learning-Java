package Curso3.ControlDeFlujos;

import javax.swing.*;

public class ClaseWhile {

    public static void contarNumeros() {

        //While
        //Ciclo de repeticion

        int contador = 1;
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero final a contar:"));

        while (contador <= numero) {
            System.out.println("El contador tiene el numero: " + contador);
            contador++;

            //Hallando un numero
            if (contador == 15) {
                System.out.println("El contador tiene el numero: " + contador);
                break;
            }
        }
        System.out.println("Fin del programa");

    }
}
