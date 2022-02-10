package Curso3.ControlDeFlujos;

import javax.swing.*;

public class ClaseSwitch {

    public static void indicarNumeroSeleccionado() {
        //Switch
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero del uno al diez: "));
        switch (num) {
            case 1:
                System.out.println("Usted ha seleccionado el numero 1.");
                break;
            case 2:
                System.out.println("Usted ha seleccionado el numero 2.");
                break;
            case 3:
                System.out.println("Usted ha seleccionado el numero 3.");
                break;
            case 4:
                System.out.println("Usted ha seleccionado el numero 4.");
                break;
            case 5:
                System.out.println("Usted ha seleccionado el numero 5.");
                break;
            case 6:
                System.out.println("Usted ha seleccionado el numero 6.");
                break;
            case 7:
                System.out.println("Usted ha seleccionado el numero 7.");
                break;
            case 8:
                System.out.println("Usted ha seleccionado el numero 7.");
                break;
            case 9:
                System.out.println("Usted ha seleccionado el numero 9.");
                break;
            case 10:
                System.out.println("Usted ha seleccionado el numero 10.");
                break;
            default:
                System.out.println("Usted ha seleccionado un numero fuera del rango.");
                break;
        }
    }

}
