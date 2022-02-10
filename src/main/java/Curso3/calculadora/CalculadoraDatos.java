package Curso3.calculadora;

import Curso3.operaciones.DivisionDatos;
import Curso3.operaciones.MultiplicacionDatos;
import Curso3.operaciones.RestaDatos;
import Curso3.operaciones.SumaDatos;

import java.util.Scanner;

public class CalculadoraDatos {

    public static void calculadora(){
        Scanner entrada = new Scanner(System.in);

        System.out.println();
        System.out.println("Bienvenido a la calculadora!");
        System.out.println();
        System.out.println("Escoge una opción: ");
        System.out.println();
        System.out.println("1. Suma de numeros enteros");
        System.out.println("2. Suma de numeros decimales");
        System.out.println("3. Resta de numeros enteros");
        System.out.println("4. Resta de numeros decimales");
        System.out.println("5. Multiplicación de numeros enteros");
        System.out.println("6. Multiplicación de numeros decimales");
        System.out.println("7. División de numeros enteros");
        System.out.println("8. División de numeros decimales");
        System.out.println();
        System.out.print("Ingresa tu eleccion: ");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has elegido la opción Suma de numeros enteros.");
                SumaDatos.sumarEnteros();
                break;
            case 2:
                System.out.println("Has elegido la opción Suma de numeros decimales.");
                SumaDatos.sumarDecimales();
                break;
            case 3:
                System.out.println("Has elegido la opción Resta de numeros enteros.");
                RestaDatos.restarEnteros();
                break;
            case 4:
                System.out.println("Has elegido la opción Resta de numeros decimales.");
                RestaDatos.restarDecimales();
                break;
            case 5:
                System.out.println("Has elegido la opción Multiplicación de numeros enteros.");
                MultiplicacionDatos.multiplicacionEnteros();
                break;
            case 6:
                System.out.println("Has elegido la opción Multiplicación de numeros decimales.");
                MultiplicacionDatos.multiplicacionDecimales();
                break;
            case 7:
                System.out.println("Has elegido la opción División de numeros enteros.");
                DivisionDatos.dividirEnteros();
                break;
            case 8:
                System.out.println("Has elegido la opción División de numeros decimales.");
                DivisionDatos.dividirDecimales();
                break;
            default:
                System.out.println("Has elegido una opción incorrecta.");
                System.out.println("Vuelve a intentarlo.");
                calculadora();
                break;
        }
    }
}
