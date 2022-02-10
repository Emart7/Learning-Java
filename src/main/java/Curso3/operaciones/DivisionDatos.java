package Curso3.operaciones;

import javax.swing.*;

public class DivisionDatos {

    public static void dividirEnteros() {

        //Declaracion de variables
        int numero1;
        int numero2;
        int divisionEntero;

        //Division de numero enteros
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero entero a dividir: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero entero a dividir: "));
        divisionEntero = numero1 / numero2;
        System.out.println("La division de los numeros es: " + divisionEntero);

    }

    public static void dividirDecimales() {

        //Declaracion de variables
        double numero3;
        double numero4;
        double divisionDecimal;


        //Division de numeros doubles
        numero3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero decimal a dividir: "));
        numero4 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero decimal a dividir:  "));
        divisionDecimal = numero3 / numero4;
        System.out.println("La division de los numeros es: " + divisionDecimal);

    }

}
