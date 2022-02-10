package Curso3.ControlDeFlujos;

import javax.swing.*;

public class SeleccionSimple {

    public static void numeroMayorACero() {
        //Seleccion simple
        //if
        //Validar si el numero es mayor a cero

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        if (numero > 0) {
            System.out.println("El numero es mayor a cero");
        }
            System.out.println("Fin del programa");
    }
}
