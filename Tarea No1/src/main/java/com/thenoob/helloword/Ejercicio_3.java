package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner set_num = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        float x = set_num.nextFloat();

        System.out.print("Ingrese otro número: ");
        float y = set_num.nextFloat();

        set_num.close();

        System.out.println("El numero " + x +" multiplicado por " + y + " es igual a: "+(x * y));
    }
}
