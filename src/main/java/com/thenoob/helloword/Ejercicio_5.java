package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

        System.out.print("Ingrese el radio de un circulo: ");
        Scanner set_radio = new Scanner(System.in);
        int radio = set_radio.nextInt();

        set_radio.close();

        final double PI = 3.1416;

        double longitud = 2 * PI * radio;
        double circunferencia = PI * (radio * radio);

        System.out.println("La longitud del círculo con radio de " + radio + " es: " + longitud +" Y su circunferencia es: " + circunferencia);
    }
}
