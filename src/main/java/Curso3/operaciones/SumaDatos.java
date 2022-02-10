package Curso3.operaciones;

import javax.swing.*;
import java.sql.SQLOutput;

public class SumaDatos {

    //Metodo para sumar enteros
    public static void sumarEnteros() {

        //Declaracion de variables
        int a;
        int b;

        //Suma de tipos enteros
        a = Integer.parseInt((JOptionPane.showInputDialog(null, "Ingresa el primer numero entero a sumar: ")));
        b = Integer.parseInt((JOptionPane.showInputDialog(null, "Ingresa el segundo numero entero a sumar: ")));
        int sumaEntero = a + b;
        System.out.println("La suma de los dos valores es: " + sumaEntero);
    }

    //Metodo para sumar decimales
    public static void sumarDecimales() {

        //Declaracion de variables
        double x;
        double y;

        //Suma de tipos double
        x = Double.parseDouble((JOptionPane.showInputDialog(null, "Ingresa el primer numero decimal a sumar: ")));
        y = Double.parseDouble((JOptionPane.showInputDialog(null, "Ingresa el segundo numero decimal a sumar: ")));
        double sumaDouble = x + y;
        System.out.println("La suma de los dos valores es: " + sumaDouble);
    }

}
