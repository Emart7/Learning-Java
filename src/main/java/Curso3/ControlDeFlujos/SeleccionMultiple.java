package Curso3.ControlDeFlujos;

import javax.swing.*;

public class SeleccionMultiple {

    public static void numeroNeutroMayorOMenoraCero() {
        //Determine si el numero es neutro, mayor o menor a cero
        //Neutro = 0 ,

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));

        if (numero == 0) {
            System.out.println("El numero es neutro");
        } else if (numero > 0) {
            System.out.println("El numero es mayor a cero");
        } else {
            System.out.println("El numero es menor a cero");
        }
        System.out.println("Fin del programa");

    }

}
