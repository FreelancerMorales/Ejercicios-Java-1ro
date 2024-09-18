package com.thenoob.tarea_no2;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner set_Num = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num1 = set_Num.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2 = set_Num.nextInt();

        if (num1 == num2) {
            System.out.println("Ambos números son iguales");
        }else if (num1 > num2) {
            System.out.println("El numero "+ num1 +" es mayor");
            System.out.println("1. "+num1);
            System.out.println("2. "+num2);
        }else{
            System.out.println("El numero "+ num2 +" es mayor");
            System.out.println("1. "+num2);
            System.out.println("2. "+num1);
        }

        set_Num.close();
    }
}
