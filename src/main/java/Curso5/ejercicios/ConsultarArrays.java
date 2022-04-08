package Curso5.ejercicios;

public class ConsultarArrays {

    public static void arrayJuguetes(){

        String juguetes[] = new String[10];
        juguetes[9] = "pelota";
        juguetes[8] = "telefono";
        juguetes[7] = "televisor";
        juguetes[6] = "computador";
        juguetes[5] = "silla";
        juguetes[4] = "Goku";
        juguetes[3] = "licuadora";
        juguetes[2] = "lampara";
        juguetes[1] = "mesa";
        juguetes[0] = "audifonos";

//        System.out.println("El primer juguete de la lista es: " + juguetes[0]);

        for(int x = 0; x < juguetes.length; x++){
            System.out.println("Juguete en la posicion " + x + " = " + juguetes[x]);
        }
    }

    public static void arrayPrecios(){

        double precios[] = {5000,2000,2500,1200,4500,6000,8100,2900,7400,9000};

//        System.out.println("El precio del primer juguete es: $" + precios[0] + " pesos.");

        for(int i = 0; i < precios.length; i++){
            System.out.println("Valor del juguete en la posicion " + i + " = $" + precios[i]);
        }
    }
}
