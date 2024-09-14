package com.thenoob.helloword;

public class Ejercicio_5 {
    public static void main(String[] args) {
        double radio = 4;
        final double PI = 3.1416;

        double longitud = 2 * PI * radio;
        double circunferencia = PI * (radio * radio);

        System.out.println("La longitud del círculo con radio de " + radio + " es: " + longitud +" Y su circunferencia es: " + circunferencia);
    }
}
