package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner set_num = new Scanner(System.in);

        System.out.println("Realizaremos una suma.");
        System.out.print("Ingrese el primer Numero: ");
        int num_1 = set_num.nextInt();

        System.out.print("Ahora ingrese el segundo numero: ");
        int num_2 = set_num.nextInt();

        int total = num_1 + num_2;

        set_num.close();

        System.out.println("La suma del numero "+num_1+" y el numero "+num_2+" es igual a: "+total);
    }
}
