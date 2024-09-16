package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        boolean do_repeat = true;
        int i = 0, respuesta = 0;
        double promedio = 0, suma = 0;
        int num[] = new int[15];

        Scanner set_data = new Scanner(System.in);

        System.out.println("Promedio De Números");
        do {
            if (i < num.length) {
                System.out.print((i + 1) + ". Ingrese un número: ");
                num[i] = set_data.nextInt();
                i++;

                if (i < num.length) {
                    System.out.println("");
                    System.out.println("¿Quiere agregar otro número?");
                    System.out.println("1. Sí");
                    System.out.println("2. No");

                    while (true) {
                        System.out.print("Respuesta: ");
                        respuesta = set_data.nextInt();
                        if (respuesta == 1 || respuesta == 2) {
                            break;
                        } else {
                            System.out.println("Respuesta inválida, por favor ingrese 1 o 2.");
                        }
                    }
                } else {
                    System.err.println("");
                    System.out.println("Sorry, llegamos al límite de números");
                    respuesta = 2;
                }
            } else {
                System.out.println("");
                System.out.println("Sorry, llegamos al límite de números");
                respuesta = 2;
            }

            if (respuesta == 2) {
                for (int j = 0; j < i; j++) {
                    suma += num[j];
                }
                promedio = suma / i;

                System.out.println("El promedio de los números ingresados (" + i + ") es: " + String.format("%.2f", promedio));

                do_repeat = false;
            }
        } while (do_repeat);
        
        set_data.close();
    }
}
