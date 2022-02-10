package Curso3.operaciones;

import javax.swing.*;

public class MultiplicacionDatos {

    public static void multiplicacionEnteros(){

        //Declaraion de variables
        int numero1;
        int numero2;
        int multiEntero;

        //Multiplicacion de numeros enteros
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero entero a multiplicar: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero entero a multiplicar:"));
        multiEntero = numero1 * numero2;
        System.out.println("El resultado de la multiplicacion de " + numero1 + " y " + numero2 + " es: " + multiEntero);

    }

    public static void multiplicacionDecimales(){

        //Declaraion de variables
        double numero3;
        double numero4;
        double multiDecimal;

        //Multiplicacion de numeros double
        numero3 =  Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero decimal a multiplicar: "));
        numero4 =  Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero decimal a multiplicar:  "));
        multiDecimal = numero3 * numero4;
        System.out.println("El resultado de la multiplicacion de " + numero3 + " y " + numero4 + " es: " + multiDecimal);

    }

}
