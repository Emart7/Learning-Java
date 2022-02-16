package Curso4.ejercicios;

/*
Haz un ciclo for y while que obtenga la sumatoria de los números hasta n, ejemplo,
para 5 debes obtener 15 (1+2+3+4+5), para 3 debes obtener 6. Imprime el resultado
así: “La suma es 15” usando formatos de String
*/

public class ejercicio7 {

    public static void sumaNumeros() {
        int n = 6;
        int suma = 0;
        int i = 0;
        while (i <= n) {
            suma += i;
            i++;
        }
        System.out.println("La suma es " + String.format("%d",suma));

        int n2 = 6;
        int suma2= 0;

        for (int j = 0; j <= n2; j++) {
            suma2 += j;
        }
            System.out.println("La suma es " + String.format("%d",suma2));
    }

}

