package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_9 {
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
        System.out.println("El número mayor es: " + max);
    }
}
