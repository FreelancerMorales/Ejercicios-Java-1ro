package com.thenoob.tareano2;

import java.util.Scanner;

public class TareaNo3 {
    public static void main(String[] args) {
        double saldo_1 = 500;
        double saldo_2 = 300;
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        double monto;
        
        do {
            System.out.println("");
            System.out.println("-------------------------------------");
            System.out.println("Saldos de Cuentas");
            System.out.println("Saldo de la Cuenta No 1: " + saldo_1);
            System.out.println("Saldo de la Cuenta No 2: " + saldo_2);
            System.out.println("");
            System.out.println("Elija una opción: ");
            System.out.println("1. Abonar");
            System.out.println("2. Debitar");
            System.out.println("3. Consultar saldos");
            System.out.println("4. Salir");
            System.out.println("-------------------------------------");
            System.out.print("Respuesta: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("¿A que cuenta desea abonar?");
                    System.out.println("1. Cuenta No 1");
                    System.out.println("2. Cuenta No 2");
                    System.out.print("Respuesta: ");
                    opcion = scanner.nextInt();
                    System.out.println("");
                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese un valor para abonar a la cuenta No 1: ");
                            monto = scanner.nextDouble();
                            saldo_1 += monto;
                        break;
                        case 2:
                            System.out.print("Ingrese un valor para abonar a la cuenta No 2: ");
                            monto = scanner.nextDouble();
                            saldo_2 += monto;
                        break;
                    
                        default:
                            System.out.println("Opción no válida");
                        break;
                    }
                break;
                case 2:
                    System.out.println("");
                    System.out.println("¿A que cuenta desea Debitar?");
                    System.out.println("1. Cuenta No 1");
                    System.out.println("2. Cuenta No 2");
                    System.out.print("Respuesta: ");
                    opcion = scanner.nextInt();
                    System.out.println("");
                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese cuanto desea debitar de la cuenta No 1: ");
                            monto = scanner.nextDouble();
                            if (monto <= saldo_1) {
                                saldo_1 -= monto;
                            } else {
                                System.out.println("No tiene suficientes fondos.");
                            }
                        break;
                        case 2:
                            System.out.print("Ingrese cuanto desea debitar de la cuenta No 2: ");
                            monto = scanner.nextDouble();
                            if (monto <= saldo_2) {
                                saldo_2 -= monto;
                            } else {
                                System.out.println("No tiene suficientes fondos.");
                            }
                        break;
                    
                        default:
                            System.out.println("Opción no válida");
                        break;
                    }
                break;
                case 3:
                    System.out.println("");
                    System.out.println("¿Que cuenta desea consultar?");
                    System.out.println("1. Cuenta No 1");
                    System.out.println("2. Cuenta No 2");
                    System.out.print("Respuesta: ");
                    opcion = scanner.nextInt();
                    System.out.println("");
                    switch (opcion) {
                        case 1:
                            System.out.println("Saldo de la Cuenta No 1: " + saldo_1);
                        break;
                        case 2:
                            System.out.println("Saldo de la Cuenta No 2: " + saldo_2);
                        break;
                    
                        default:
                            System.out.println("Opción no válida");
                        break;
                    }
                break;
                case 4:
                    System.out.println("Saliendo...");
                break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                break;
            }
            System.out.println("-------------------------------------");
        } while (opcion != 4);
    }
}