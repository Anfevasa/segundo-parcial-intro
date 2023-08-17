package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer opcionMenu;

        Integer numeroHoras;
        Double tarifaHora;

        String nombreEmpleado;
        Double salarioEmpleado;

        do {
            System.out.println("--- Nomina ---");
            System.out.println("1. Calcular Salario");
            System.out.println("2. Pagar nomina");
            System.out.println("3. SALIR");

            System.out.print("Digite el número de la opción: ");
            opcionMenu = teclado.nextInt();
            teclado.nextLine();


            switch (opcionMenu){
                case 1:
                    System.out.print("Ingrese el número de horas trabajadas: ");
                    numeroHoras = teclado.nextInt();
                    System.out.print("Ingrese la tarifa por hora: ");
                    tarifaHora = teclado.nextDouble();

                    System.out.println("El salario base es de: $"+numeroHoras*tarifaHora);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del empleado: ");
                    nombreEmpleado = teclado.nextLine();
                    System.out.print("Ingrese el salario a pagar: ");
                    salarioEmpleado = teclado.nextDouble();

                    System.out.println("Se realizó el pago de $"+salarioEmpleado*0.92+" a "+nombreEmpleado);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;

            }

        }while (opcionMenu!=3);


    }
}