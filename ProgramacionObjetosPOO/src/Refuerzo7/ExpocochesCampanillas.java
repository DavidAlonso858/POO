package Refuerzo7;

import java.util.Scanner;

public class ExpocochesCampanillas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zona salaPrincipal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona zonaVIP = new Zona(25);

        int opcion = 0;
        int opcion2 = 0;
        int n = 0;
        do {
            System.out.println("\n1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("\n\nEn la zona principal hay " + salaPrincipal.getEntradasPorVender());
                System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasPorVender());
                System.out.println("En la zona vip hay " + zonaVIP.getEntradasPorVender());
            }
            if (opcion == 2) {
                System.out.println("\n\n1. Principal");
                System.out.println("2. Compra-venta");
                System.out.println("3. Vip");
                System.out.print("Elige la zona para la que quieres comprar las entradas: ");
                opcion2 = sc.nextInt();
                System.out.print("¿Cuántas entradas quieres? ");
                n = sc.nextInt();
                switch (opcion2) {
                    case 1 ->
                        salaPrincipal.vender(n);
                    case 2 ->
                        compraVenta.vender(n);
                    case 3 ->
                        zonaVIP.vender(n);
                }
            }
        } while (opcion < 3);
    }
}
