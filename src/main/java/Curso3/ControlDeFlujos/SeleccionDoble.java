package Curso3.ControlDeFlujos;

import javax.swing.*;

public class SeleccionDoble {

    public static void numeroMayorOMenorACero() {

        //Determinar si un numero es mayor o menor a cero
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a verficar: "));
        if (numero > 0) {
            System.out.println("El numero es mayor a cero");
        } else {
            System.out.println("El numero es menor a cero");
        }
        System.out.println("Fin del programa");
    }
}
