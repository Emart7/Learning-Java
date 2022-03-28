package Curso1;

import java.util.Scanner;

public class HolaMundo {

    public static void saludoInicial() {
        String nombreUsuario;
        System.out.println("Hola Mundo");
        System.out.println();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita tu nombre: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Bienvenido " + nombreUsuario);
    }
}
