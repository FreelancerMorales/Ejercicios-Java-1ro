package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {

        System.out.print("Por favor, digite su edad: ");
        Scanner set_edad = new Scanner(System.in);
        int edad = set_edad.nextInt();
        set_edad.close();

        if (edad >= 100) {
            System.out.println("Usted es un fósil");
        }else if(edad >= 18){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }
    }
}
