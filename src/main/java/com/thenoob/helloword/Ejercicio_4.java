package com.thenoob.helloword;

// Se paso con este, no se de termo asi que queda a su criterio si esta bien :c

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner set_c = new Scanner(System.in);
        System.out.print("Ingrese un valor para grados centígrados: ");
        int c = set_c.nextInt();

        int f = (32 + (9 * c/5));
        System.out.println("El numero " + c + "° en grados Fahrenheit es: "+ f + "°");
    }
}
