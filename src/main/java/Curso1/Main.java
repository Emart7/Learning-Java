package Curso1;

import Curso2.Smartphone;

public class Main {
    public static void main(String[] args) {
        //Curso 1
        //Llamando a la clase Hola Mundo
//        HolaMundo.saludoInicial();
//        Casting.ejemplosCasting();

        //Curso2

        //Instanciar un objeto de la clase Smartphone
        Smartphone smartphone = new Smartphone("white", "Xiaomi");
        Smartphone.Android android = smartphone.new Android("Redmi", "5");
        Smartphone.Iphone iphone = smartphone.new Iphone("Iphone", "X");

        //Llamar al método de la clase Smartphone
        smartphone.makeAPhoneCall();
        smartphone.makeAPhoneCall();

        android.makeAPhoneCall();
        iphone.makeAPhoneCall();
    }
}
