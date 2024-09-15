package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {

        System.out.println("Realizaremos una suma.");
        System.out.print("Ingrese el primer Numero: ");
        Scanner set_1 = new Scanner(System.in);
        int num_1 = set_1.nextInt();

        System.out.print("Ahora ingrese el segundo numero: ");
        Scanner set_2 = new Scanner(System.in);
        int num_2 = set_2.nextInt();

        int total = num_1 + num_2;

        System.out.println("La suma del numero "+num_1+" y el numero "+num_2+" es igual a: "+total);
    }
}
