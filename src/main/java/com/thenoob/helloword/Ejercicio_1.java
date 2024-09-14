package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        System.out.print("Ingrese dato 1: ");
        Scanner set_1 = new Scanner(System.in);
        int num_1 = set_1.nextInt();

        System.out.print("Ingrese dato 2: ");
        Scanner set_2 = new Scanner(System.in);
        int num_2 = set_2.nextInt();

        System.out.println("Aquí vemos el primer Numero "+ num_1 +" Y aquí vemos el segundo "+ num_2);
    }
}
