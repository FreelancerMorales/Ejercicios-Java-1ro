package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        boolean do_repeat = true, while_repeat = true;
        int i = 1, respuesta = 0;
        double promedio = 0, suma = 0;
        int num[] = new int[4];

        System.out.println("Promedio De Números");
        do {
            if (i < num.length) {
                Scanner n_num = new Scanner(System.in);
                System.out.print( i + ".Ingrese un número: ");
                num[i] = n_num.nextInt();

                System.out.println("");
                System.out.println("¿Quiere agregar otro numero?");
                System.out.println("1. Si");
                System.out.println("2. No");
            }else{
                System.out.println("Sorry, llegamos al limite de números");
                respuesta = 2;
            }

            while (while_repeat) {
                try {
                    if (respuesta == 2) {
                        while_repeat = false;
                    }else{
                        System.out.print("Respuesta: ");
                        Scanner set_respuesta = new Scanner(System.in);
                        respuesta = set_respuesta.nextInt();
                        System.out.println("");
                            if (respuesta  == 1 || respuesta == 2) {
                                while_repeat = false;
                            }else{
                                System.out.print("Respuesta invalida, por favor ingrese 1 o 2: ");
                            }
                    }
                } catch (Exception e) {
                    System.out.println("Respuesta invalida, por favor ingrese 1 o 2.");
                }
            }

            switch (respuesta) {
                case 1:
                    i++;
                break;

                case 2:
                    for (int j = 0; j <= i; j++) {
                        suma += num[j];
                    };
                    promedio = suma / i;

                    System.out.println("El promedio de los números ingresados (" + i + ") es: " + String.format("%.2f", promedio));
                    // Merezco puntos extras por esto verdad que si?
                    do_repeat = false;
                break;
            }
        } while (do_repeat);
    }
}
