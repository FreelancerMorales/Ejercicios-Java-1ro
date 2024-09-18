package com.thenoob.tarea_no2;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese dato 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese dato 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese dato 3: ");
        int num3 = scanner.nextInt();

        int mayor = Math.max( num3, Math.max(num1, num2));
        int menor = Math.min( num3, Math.min(num1, num2));
        int medio = (num1 + num2 + num3 - mayor - menor);

        System.out.println("");
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número medio es: " + medio);
        System.out.println("El número menor es: " + menor);
    }
}
