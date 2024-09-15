package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {

        System.out.print("Ingrese el numero 1: ");
        Scanner set_1 = new Scanner(System.in);
        int num_1 = set_1.nextInt();

        System.out.print("Ingrese el numero 2: ");
        Scanner set_2 = new Scanner(System.in);
        int num_2 = set_2.nextInt();

        System.out.print("Ingrese el numero 3: ");
        Scanner set_3 = new Scanner(System.in);
        int num_3 = set_3.nextInt();

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
