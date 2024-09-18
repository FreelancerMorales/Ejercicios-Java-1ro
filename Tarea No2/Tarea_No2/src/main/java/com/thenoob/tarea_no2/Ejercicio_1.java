package com.thenoob.tarea_no2;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Comparación de Números");
        System.out.println("");
        System.out.print("Ingrese el primer dato: ");
        num1 = Num.nextInt();
        System.out.print("Ingrese el segundo dato: ");
        num2 = Num.nextInt();

        System.out.println("");

        if (num1 == num2) {
            System.out.println("Ambos números son Iguales");
        }else{
            System.out.println("Los números Diferentes");
        }

    }
}
