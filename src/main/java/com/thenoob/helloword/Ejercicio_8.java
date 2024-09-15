package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {

        System.out.print("Ingresa un numero:");
        Scanner set_Number = new Scanner(System.in);
        int Number = set_Number.nextInt();

        if(Number < 0){
            System.out.println("El numero "+Number+" es negativo");
        }else{
            System.out.println("El numero "+Number+" es positivo");
        }
    }
}
