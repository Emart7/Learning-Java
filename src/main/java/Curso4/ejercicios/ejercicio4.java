package Curso4.ejercicios;

public class ejercicio4 {
    public static void calcularPromedioCliente(){
        double clientes1 = 60 * 0.30;
        double clientes2 = 100 * 0.25;
        double clientes3 = 20 * 0.80;
        double promedioClientes = (clientes1 + clientes2 + clientes3) / 3;
        final double IVA = 0.16;
        double precioConIva = promedioClientes * IVA;
        double precioFinal = promedioClientes + precioConIva;

        System.out.println("El promedio de clientes es:$ " + String.format("%.2f",promedioClientes));
        System.out.println("El precio final con IVA es: $ " + String.format("%.2f",precioFinal));

    }
}
