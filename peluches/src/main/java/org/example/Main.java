package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Integer opcionMenu;

        String nombrePeluche="";
        Double valorUnitario=0.0;
        Double precioVenta=0.0;

        do {


            System.out.println("--- Peluches ---");
            System.out.println("1. Agregar nuevo peluche");
            System.out.println("2. Calcular costo de venta");
            System.out.println("3. Mostrar información del nuevo peluche");
            System.out.println("4. Editar costo unitario");
            System.out.println("5. SALIR");

            System.out.print("Digite el número de la opción: ");
            opcionMenu = teclado.nextInt();
            teclado.nextLine();

            switch (opcionMenu) {
                case 1:
                    System.out.print("Digite el nombre del nuevo peluche: ");
                    nombrePeluche = teclado.nextLine();

                    System.out.print("Digite el precio unitario: ");
                    valorUnitario = teclado.nextDouble();
                    break;
                case 2:
                    if (valorUnitario == 0) {
                        System.out.println("No es posible calcular iva sin valor unitario");
                    } else {
                        precioVenta = valorUnitario * 1.19;
                        System.out.println("Precio calculado");
                    }
                    break;
                case 3:
                    System.out.println("---- Nuevo peluche ----");
                    System.out.println("- Nombre: " + nombrePeluche);
                    System.out.println("- Valor unitario: $" + valorUnitario);
                    System.out.println("- Precio de venta: $" + precioVenta);
                    System.out.println("-----------------------");
                    break;
                case 4:
                    System.out.print("Digite el nuevo valor unitario: $");
                    valorUnitario = teclado.nextDouble();
                    precioVenta = valorUnitario * 1.19;
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;

            }
            System.out.print("Presione enter para continuar");
            teclado.nextLine();
            teclado.nextLine();
        }while (opcionMenu!=5);
    }
}