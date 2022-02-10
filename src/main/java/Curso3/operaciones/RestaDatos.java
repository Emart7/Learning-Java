package Curso3.operaciones;

import javax.swing.*;

public class RestaDatos {

    //Metodo para restar numeros enteros
    public static void restarEnteros() {

        //Declaracion de variables
        int num1;
        int num2;
        int restaEntero;

        //Resta de numeros enteros
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero entero a restar: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero entero a restar:: "));
        restaEntero = num1 - num2;
        System.out.println("La resta de los numeros es: " + restaEntero);

    }

    //Metodo para restar numeros decimales
    public static void restarDecimales() {

        //Declaracion de variables
        double num3;
        double num4;
        double restaDouble;

        //Resta de numeros decimales
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero decimal a restar: "));
        num4 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero decimal a restar:"));
        restaDouble = num3 - num4;
        System.out.println("La resta de los numeros es: " + restaDouble);

    }

}
