package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner set_num = new Scanner(System.in);

        System.out.print("Ingrese el numero 1: ");
        int num_1 = set_num.nextInt();

        System.out.print("Ingrese el numero 2: ");
        int num_2 = set_num.nextInt();

        System.out.print("Ingrese el numero 3: ");
        int num_3 = set_num.nextInt();

        set_num.close();

        int max = Math.max(Math.max(num_1, num_2), num_3);
        int min = Math.min(Math.min(num_1, num_2), num_3);
        int medium = (num_1 + num_2 + num_3) - (max + min); 

        System.out.println("");
        System.out.println("El número mayor es: " + max);
        System.out.println("El número menor es: " + min);
        System.out.println("");
        System.out.println("El número mediano es: " + medium);
    }
}
