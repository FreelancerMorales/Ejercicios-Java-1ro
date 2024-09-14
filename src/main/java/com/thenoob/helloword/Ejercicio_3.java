package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        System.out.print("Ingrese un número: ");
        Scanner set_x = new Scanner(System.in);
        float x = set_x.nextFloat();

        System.out.print("Ingrese otro número: ");
        Scanner set_y = new Scanner(System.in);
        float y = set_y.nextFloat();

        System.out.println("El numero " + x +" multiplicado por " + y + " es igual a: "+(x * y));
    }
}
