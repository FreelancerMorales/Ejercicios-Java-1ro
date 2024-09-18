package com.thenoob.tarea_no2;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner set_num = new Scanner(System.in);

        System.out.print("Dígito un numero por favor:");
        int num = set_num.nextInt();

        if (num < 0) {
            System.out.println("El numero " + num + " es Negativo");
        }else{
            System.out.println("El numero " + num + " es Positivo");
        }
    }
}
