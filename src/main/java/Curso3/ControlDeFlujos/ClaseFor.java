package Curso3.ControlDeFlujos;

import javax.swing.*;

public class ClaseFor {

    public static void tablasDeMultiplicar() {
        //For repeticiones de acuerdo como se requiera
        //Tablas del 1 al 10
        //Utilizando un Swich

        int num;
        int contador = 0;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de la tabla necesaria\nIngrese (cero) para salir: "));
            switch (num) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Tabla del numero 1.");
                    System.out.println();
                    for (int i = 0; i <= 10; i++) {
                        System.out.println(num + " por " + i + " = " + (num * i));
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Tabla del numero 2.");
                    System.out.println();
                    for (int i = 0; i <= 10; i++) {
                        System.out.println(num + " por " + i + " = " + (num * i));
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Tabla del numero 3.");
                    System.out.println();
                    for (int i = 0; i <= 10; i++) {
                        System.out.println(num + " por " + i + " = " + (num * i));
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Tabla del numero 4.");
                    System.out.println();
                    for (int i = 0; i <= 10; i++) {
                        System.out.println(num + " por " + i + " = " + (num * i));
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Tabla del numero 5.");
                    System.out.println();
                    for (int i = 0; i <= 10; i++) {
                        System.out.println(num + " por " + i + " = " + (num * i));
                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Tabla del numero 6.");
                    System.out.println();
                    for (int i = 0; i <= 10; i++) {
                        System.out.println(num + " por " + i + " = " + (num * i));
                    }
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Tabla del numero 7.");
                    System.out.println();
                    for (int i = 0; i <= 10; i++) {
                        System.out.println(num + " por " + i + " = " + (num * i));
                    }
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Tabla del numero 8.");
                    System.out.println();
                    for (int i = 0; i <= 10; i++) {
                        System.out.println(num + " por " + i + " = " + (num * i));
                    }
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Tabla del numero 9.");
                    System.out.println();
                    for (int i = 0; i <= 10; i++) {
                        System.out.println(num + " por " + i + " = " + (num * i));
                    }
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Tabla del numero 10.");
                    System.out.println();
                    for (int i = 0; i <= 10; i++) {
                        System.out.println(num + " por " + i + " = " + (num * i));
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("El numero ingresado no esta dentro del rango");
                    System.out.println();
                    break;
            }
        } while (num != 0);
        System.out.println("Fin del programa");

    }

}
