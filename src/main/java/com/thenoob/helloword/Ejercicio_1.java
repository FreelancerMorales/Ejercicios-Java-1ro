package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner set_num = new Scanner(System.in);

        System.out.print("Ingrese dato 1: ");
        int num_1 = set_num.nextInt();

        System.out.print("Ingrese dato 2: ");
        int num_2 = set_num.nextInt();

        set_num.close();

        System.out.println("Aquí vemos el primer Numero "+ num_1 +" Y aquí vemos el segundo "+ num_2);
    }
}
